package ex2_object.Q3;

public class Main {
	public static void main(String[] args) {
		Member m1 = new Member("KimAutumn", "김가을");
		Member m2 = new Member("KimAutumn", "김가을");
		Member m3 = new Member("LeeSummer", "이여름");
		
		System.out.println(m1.equals(m2));
		System.out.println(m2.equals(m3));
	}
}
