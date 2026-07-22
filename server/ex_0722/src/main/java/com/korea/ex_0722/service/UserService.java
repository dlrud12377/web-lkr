package com.korea.ex_0722.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.ex_0722.dao.UserDAO;
import com.korea.ex_0722.vo.UserVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // 의존성 주입 위해 필수요소 포함 생성자 어노테이션
public class UserService {

	private final UserDAO userDAO; // 의존성 주입
	
	public List<UserVO> findAll() {
		return userDAO.findAll();
	}
	
	public UserVO findById(Long id) {
		return userDAO.findById(id);
	}
	
	public int insert(UserVO user) {
		return userDAO.insert(user);
	}
	
	public int update(UserVO user) {
		return userDAO.update(user.getId(), user.getName(), user.getEmail());
	}
	
	public List<UserVO> delete(Long id) {
		if(userDAO.findById(id) != null) {
			userDAO.delete(id);
			return userDAO.findAll();
		}
		else {
			return null;
		}
	}
	
}
