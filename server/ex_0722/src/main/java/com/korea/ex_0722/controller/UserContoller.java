package com.korea.ex_0722.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.ex_0722.service.UserService;
import com.korea.ex_0722.vo.UserVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserContoller {

	// 의존성주입(service)
	private final UserService userService;
	
	@GetMapping
	public List<UserVO> findAll(){
		return userService.findAll();
	}
	
	@GetMapping("{id}")
	public UserVO findById(@PathVariable Long id) {
		return userService.findById(id);
	}
	
	
	@PostMapping
	public int insert(@RequestBody UserVO vo) {
		return userService.insert(vo);
	}
	
	@PutMapping
	public int update(@RequestBody UserVO vo) {
		return userService.update(vo);
	}
	
	@DeleteMapping("{id}")
	public List<UserVO> delete(@PathVariable Long id) {
		return userService.delete(id);
	}
	
}
