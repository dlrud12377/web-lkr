package ex5_math;


public class RandomExample {
	public static void main(String[] args) {
		
	// 로또번호 ( 1 ~ 45 )를 뽑아서 배열에 넣는다.
	// 키보드에서 6개의 숫자를 입력받아서 번호 맞추기
	// Arrays.equals(arr1, arr2), Arrays.sort() 활용하기

	LottoMachine lm = new LottoMachine();
	
	int[] lotto = lm.setLotto();
	
	int[] guess = lm.guessLotto();
	
	lm.lottoResult(lotto, guess);

	}
}
