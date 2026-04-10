package ex3_CollectionsExample.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Bingo {
	public static void main(String[] args) {
		// 1 ~ 50 사이의 난수가 있다.
		// 5 X 5의 빙고판에 25개의 숫자를 채운다.
		// 겹치면 안됨
		
		// 만약 숫자가 연속되게 들어간다면 섞어주기
		
		int ranNum;
		
		HashSet<Integer> bingo = new HashSet<>();
		
		while(bingo.size() <= 25) {
			ranNum = (int)(Math.random() * 50) + 1;
			bingo.add(ranNum);
		}
		
		List<Integer> bingoList = new ArrayList<>(bingo);
		Collections.shuffle(bingoList);
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%02d ", bingoList.get(5*i+j));
			}
			System.out.println();
		}
	}
}
