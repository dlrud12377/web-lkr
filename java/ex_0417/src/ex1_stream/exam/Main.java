package ex1_stream.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Member> members = new ArrayList<>(Arrays.asList(
						new Member(1, "홍길동", "ACTIVE"),
						new Member(2, "김철수", "INACTIVE"),
						new Member(3, "이영희", "ACTIVE"),
						new Member(4, "박민수", "INACTIVE"),
						new Member(5, "최지은", "ACTIVE")
						));
		
		members.stream()
		.filter(t -> t.getStatus().equals("ACTIVE"))
		.forEach(x -> System.out.println(x.toString()));
	}
}
