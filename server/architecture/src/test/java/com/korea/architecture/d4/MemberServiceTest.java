package com.korea.architecture.d4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberServiceTest {

	@Autowired
	private MemberService memberService;
	
	@Test
	public void MemberJoinTest(){
		memberService.joinMember("김민수");
	}
	
}
