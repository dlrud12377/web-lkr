package com.korea.todo.service;

import org.springframework.stereotype.Service;

import com.korea.todo.entity.UserEntity;
import com.korea.todo.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

	private final UserRepository repository;
	
	//회원가입 기능
	public UserEntity create(UserEntity user) {
		
		// 이름 유효성 검사
		if(user == null || user.getUsername() == null) {
			throw new RuntimeException("Invalid Arguments");
		}
		
		final String username = user.getUsername();
		
		//username이 이미 존재하는 경우, 경고 로그를 남기고 예외를 던진다.
		if(repository.existsByUsername(username)) {
			log.warn("Username already exists {}", username);
			throw new RuntimeException("Username already exists");
		}
		
		return repository.save(user);
		
	}

	// 로그인
	public UserEntity getByCredentials(String username, String password) {
		return repository.findByUsernameAndPassword(username, password); // 이름과 패스워드가 일치하는 엔티티 반환
	}
	
	
	
}
