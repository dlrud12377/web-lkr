package com.korea.todo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.todo.DTO.ResponseDTO;
import com.korea.todo.DTO.ToDoDTO;
import com.korea.todo.entity.ToDoEntity;
import com.korea.todo.service.ToDoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("todo")
@RequiredArgsConstructor // @NonNull이나 final을 가진 필드에 대해서 매개변수를 갖는 생성자를 만들어준다.
public class ToDoController {
	
	//TodoService를 필드로 갖고 객체를 생성자 주입을 한다.
	private final ToDoService toDoService;
	
//	public ToDoController(ToDoService toDoService) {
//		this.toDoService = toDoService;
//	}
	
	
	// /test로 요청이 들어오면 testToDo라는 메서드가 실행되고 
	// 서비스의 메서드를 실행하여 응답으로 반환한다.
	// ResponseEntity : HTTP 응답 전체를 표현하는 객체
	@GetMapping("/test")
	public ResponseEntity<?> testTodo() {
		String str = toDoService.testService();
		List<String> list = new ArrayList<>();
		list.add(str);
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		
		// ok() -> 상태를 강제로 200으로 설정한다.
		// body() -> 응답 본문에 response 객체를 넣는다.
		// 완성된 HTTP 응답을 클라이언트에게 전송한다.
		return ResponseEntity.ok().body(response);
		
		// Controller -> Service -> ResponseDTO -> ResponseEntity -> JSON
	}
	
	// 요청 -> (DTO -> Entity) TodoController -> ToDoService
	// 추가하기 위해 데이터가 넘어왔을 때
	// 매개변수로 받는다.
	// 엔티티로 변경하고 service로 보낸다.
	// 비즈니스 로직을 실행하고 난 결과를 받아온다.
	// 응답으로 내보낸다.
	@PostMapping
	public ResponseEntity<?> createTodo(@AuthenticationPrincipal String userId, @RequestBody ToDoDTO dto) {
		try {
			// 임시 유저 만들기(UserId 검사용)
			String temporaryUserId = "temporary-user"; // 임시 유저 아이디
			
			// dto -> entity
			ToDoEntity entity = ToDoDTO.toEntity(dto);
			
			entity.setUserId(temporaryUserId);
			
			// 서비스레이어의 create 메서드를 호출하여, ToDoEntity를 데이터베이스에 저장
			List<ToDoEntity> entities = toDoService.create(entity);
			
			// List 내의 entity를 모두 dto로 변경(자바 스트림 이용)
			List<ToDoDTO> dtos = entities
					.stream()
					.map(ToDoDTO::new)
					.toList();
			
			// 변환된 ToDoDTO 리스트를 이용해 ResponseDTO의 data에 리스트를 넣는다.
			ResponseDTO<ToDoDTO> response = ResponseDTO
					.<ToDoDTO>builder()
					.data(dtos)
					.error(null)
					.build();
			
			return ResponseEntity.ok().body(response);
					
			
			
		} catch (Exception e) {
			// 예외가 발생하는 경우 dto대신 error에 메시지를 넣어 반환한다.
			String error = e.getMessage();
			
			// 에러 메시지를 포함한 ResponseDTO 객체 만들기
			ResponseDTO<ToDoDTO> response = ResponseDTO
					.<ToDoDTO>builder()
					.error(error)
					.build();
			
			// badRequest() : 400 Bad Request 상태코드를 가진 응답을 반환한다.
			// 이는 클라이언트가 잘못 요청을 했음을 나타낸다.
			return ResponseEntity.badRequest().body(response);
		}
	}
	
	
	@GetMapping
	public ResponseEntity<?> findAllTodo() {
		
		try {
			
			List<ToDoDTO> dtos = toDoService.retrieve();
			
			ResponseDTO<ToDoDTO> response = ResponseDTO
					.<ToDoDTO>builder()
					.data(dtos)
					.error(null)
					.build();
			
			return ResponseEntity.ok().body(response);		
			
		} catch (Exception e) {
			String message = e.getMessage();
			
			ResponseDTO<ToDoDTO> response = ResponseDTO
					.<ToDoDTO>builder()
					.error(message)
					.build();
			
			return ResponseEntity.badRequest().body(response);
			
		}
		
		
		@PutMapping
		public ResponseEntity<?> updateToDo(@RequestBody ToDoDTO dto){
			String temporaryUserId = "temporary-user";
			
			ToDoEntity entity = ToDoDTO.toEntity(dto);
			
			
			
			
		}
		
		
		
		@DeleteMapping
		public ResponseEntity<?> deleteTodo(@RequestBody ToDoDTO dto) {
			try {
				String temporaryUserId = "temporary-user"; // 임시 유저 아이디
				
				ToDoEntity entity = ToDoDTO.toEntity(dto);
				
				entity.setUserId(temporaryUserId);
				
				List<ToDoEntity> entities = toDoService.delete(entity);
				
				// 반환?
				List<>
				
			}catch (Exception e) {
				// 예외가 발생하는 경우 dto대신 error에 메시지를 넣어 반환한다.
				String error = e.getMessage();
				
				// 에러 메시지를 포함한 ResponseDTO 객체 만들기
				ResponseDTO<ToDoDTO> response = ResponseDTO
						.<ToDoDTO>builder()
						.error(error)
						.build();
				
				// badRequest() : 400 Bad Request 상태코드를 가진 응답을 반환한다.
				// 이는 클라이언트가 잘못 요청을 했음을 나타낸다.
				return ResponseEntity.badRequest().body(response);
			}
		}
		

		
	}
	
	
}
