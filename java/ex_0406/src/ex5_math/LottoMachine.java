package ex5_math;

import java.util.Arrays;
import java.util.Scanner;

public class LottoMachine {
	public int[] setLotto() {
		// 로또번호 ( 1 ~ 45 )를 뽑아서 배열에 넣는다.
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1; // 0~44까지의 variation에 1 더하기 -> 1~45
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					System.out.println("번호가 중복되었습니다. " + (i+1) + "번째 프로세스를 다시 진행합니다.");
					i--;
					continue;
				}
			}
		}
		
		Arrays.sort(lotto); // 비교하기 편하게 배열 오름차순
		return lotto;
	}
	
	public int[] guessLotto() {
		// 키보드에서 6개의 숫자를 입력받아서 번호 맞추기
		Scanner sc = new Scanner(System.in);
		int[] guess = new int[6];
		
		for (int i = 0; i < guess.length; i++) {
			System.out.printf("%d번째 수를 입력해주세요 : ", (i+1));
			guess[i] = sc.nextInt();
			if (guess[i] <= 0 || guess[i] > 45) {
				System.out.println("로또 번호 범위 밖의 수를 입력하셨습니다. 다시 진행해주세요.");
				i--;
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (guess[i] == guess[j]) {
					System.out.println("이전의 수와 같은 숫자를 입력하셨습니다. 다시 진행해주세요.");
					i--;
					continue;
				}
			}
		}
		
		Arrays.sort(guess); // 똑같이 정렬
		return guess;
	}
	
	public void lottoResult(int[] lotto, int[] guess) {
		//Arrays.equals() 활용하기
		if (Arrays.equals(lotto, guess)) { // sort 해둔 lotto와 guess 배열 내용이 같으면
			System.out.println("로또에 당첨되셨습니다!");
			System.out.println(Arrays.toString(lotto));
		}
		else {
			System.out.println("로또에 당첨되지 않았습니다.ㅠㅠ");
			System.out.println("로또 번호 : " + Arrays.toString(lotto));
			System.out.println("입력한 번호 : " + Arrays.toString(guess));
		}
	}
}
