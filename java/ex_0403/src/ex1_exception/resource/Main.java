package ex1_exception.resource;

public class Main {
	public static void main(String[] args) {
		try(MyResource res = new MyResource("A")) {
			String data = res.read1(); // "100"
			int value = Integer.parseInt(data);
			
		} catch (Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
		
//		try(MyResource res = new MyResource("A")) { -> 이걸 안쓰면
		MyResource res = null; // 안에 선언하면 res가 try의 지역변수가 되어 finally문에서 사용이 불가능함
		try {
			res = new MyResource("A"); // res가 null이 아닌상태 -> 열려있는 상태
			String data = res.read2(); // "abc"
			int value = Integer.parseInt(data);	
		} catch (Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		} finally { // 닫을 때도 오류가 생길 수 있어서 finally - (try-catch) 사용)
			try {
				if (res != null) {
					res.close();// res에 뭐라도 들어있으면 닫아주어야 함
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
				

		}
	}
}
