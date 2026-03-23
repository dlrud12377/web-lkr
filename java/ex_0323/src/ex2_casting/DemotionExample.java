package ex2_casting;

public class DemotionExample {

	public static void main(String[] args) {
//		 2. 강제 형변환(명시적 형변환)
//		 큰 자료형 -> 작은 자료형으로 바꾸려고 할 때 사용
//		 상황에 따라서는 자료형이 맞지 않아 오버/언더플로우가 일어날 수 있음. 또는 미스매치가 발생도 가능함
//		 바꾸려는 타입을 적어주어야 함
		
		// int -> byte
		int var1 = 10;
		byte var2 = (byte)var1; // 타입을 값 앞에 적어 강제로 변환시킴
		System.out.println(var2); // 10(값 제한 걸리지 않아 유지됨)
		
		// long -> int
		long var3 = 300;
		int var4 = (int)var3;
		System.out.println(var4); // 300(값 제한 걸리지 않아 유지됨)
		
		// int -> char
		int var5 = 65;
		char var6 = (char)var5;
		System.out.println(var6); // A(문자열 변형으로 인해 아스키코드 대응되는 문자열 등장)

		// 위의 경우에서는 값의 손실은 없음
		
		// double -> int
		double var7 = 3.141592;
		int var8 = (int)var7;
		System.out.println(var8); // 3(실수를 정수로 변환하여 소숫점 아래 숫자 소실됨)
		// 내가 생각한 것과 다른 결과가 나올 수 있으므로 주의해야 함
		
		
		// 컴파일 단계에서 연산
		byte result = 10 + 20;
		System.out.println("result : " + result); // result : 30
		
		byte v1 = 10;
		byte v2 = 20;
		// java에서는 byte, short, char끼리의 연산은 자동으로 int로 변환이 된다.
		
		// 그러나 아래 식은 값이 고정되지 않아 미리 계산하지 않으므로, 실행시점에 연산이 됨
		// 따라서 컴파일 시 int 변환보다 연산 실행시점이 더 뒤이므로, 오류 발생 -> byte casting 필요
		byte v3 = (byte)(v1 + v2); // int로의 묵시적 형변환이 일어나므로 다시 변경해주어야 함
		float x = 78.13f;
		int y = 22888;
		float result2 = x * y;
		System.out.println(result2); // int * float = float
	}

}
