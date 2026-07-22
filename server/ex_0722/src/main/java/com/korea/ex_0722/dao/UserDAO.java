package com.korea.ex_0722.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.ex_0722.vo.UserVO;

@Mapper // MyBatis가 해당 인터페이스를 Mapper로 인식하고 Spring에서 주입할 수 있게 해준다.
public interface UserDAO {
	
	List<UserVO> findAll();
	
	UserVO findById(Long id);
	
	//SQL의 영향을 받은 행의 개수를 return으로 받기 위해 int로 설정
	int insert(UserVO vo);
	
	// update
	int update(Long id, String name, String email);
	
	// delete
	int delete(Long id);

}
