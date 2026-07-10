package com.example.demo.dependency.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("Desktop")

@Component
public class Desktop implements Computer {
	
	@Override
	public int getScreenWidth() {
		// TODO Auto-generated method stub
		return 1920;
	}
}
