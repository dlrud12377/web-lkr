package com.korea.todo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.todo.DTO.ResponseDTO;
import com.korea.todo.DTO.UserDTO;
import com.korea.todo.entity.UserEntity;
import com.korea.todo.security.TokenProvider;
import com.korea.todo.service.UserService;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class UserController {

	private final UserService userService;
	
	private final TokenProvider tokenProvider;
	
	// 회원가입
	// 경로 : /signup
	// 메서드 : registerUser
	// 요청으로부터 넘어온 내용을 받아서 데이터베이스에 추가하고, 저장된 내용 ResponseDTO에 담아서 반환하기
	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@RequestBody UserDTO dto){
		try {
			UserEntity user = UserEntity.builder()
					.username(dto.getUsername())
					.id(dto.getId())
					.password(dto.getPassword())
					.build();
			
			UserEntity registeredUser = userService.create(user);
			
			UserDTO responseUserDTO = UserDTO.builder()
					.id(registeredUser.getId())
					.username(registeredUser.getUsername())
					.password(registeredUser.getPassword())
					.build();
			
			return ResponseEntity.ok().body(responseUserDTO);
		}catch (Exception e) {
			
			String message = e.getMessage();
			
			ResponseDTO response = ResponseDTO.builder()
					.error(message)
					.build();
			
			return ResponseEntity.badRequest().body(response);
		}
	}
	
	// @RequestBody
	// HTTP 요청의 Body에 담아 보낸 데이터를 Java 객체로 변환하여
	// 컨트롤러의 매개변수로 받기 위한 어노테이션
	// POST, PUT 요청으로 JSON 데이터를 받을 때 많이 사용한다.
	
	// 로그인하기
	// 경로 POST /signin
	// 메서드명 authenticate
	// 입력받은 아이디와 비밀번호를 받아서 검증하고 조회된 유저를 반환
	@PostMapping("/signin")
	public ResponseEntity<?> authenticate(@RequestBody UserDTO dto){
		
		UserEntity user = userService.getByCredentials(dto.getUsername(),
				dto.getPassword());
		try {
			if(user == null) { // 유저가 존재하지 않거나 인증을 실패함
				throw new RuntimeException("유저가 존재하지 않습니다.");
			}
			
			// 토큰 제작
			final String token = tokenProvider.create(user);
			
			final UserDTO responseUserDTO = UserDTO.builder()
					.id(user.getId())
					.username(user.getUsername())
					// 로그인을 하면서 토큰 지급
					.token(token)
					.build(); // response용 DTO 제작
			
			return ResponseEntity.ok().body(responseUserDTO);
			
		} catch (Exception e) {
			
			String message = e.getMessage();
			
			ResponseDTO response = ResponseDTO.builder()
					.error(message)
					.build();
			
			return ResponseEntity.badRequest().body(response);
		}
	}
	
}
