package Q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
6. Collections.sort()와 람다식을 사용하여 다음과 같이 정렬하시오.
- 급여가 높은 순으로 정렬
7. 정렬 결과를 출력하시오.
8. 다시 Collections.sort()와 람다식을 사용하여 다음과 같이 정렬하시오.
- 이름 오름차순 정렬
9. 정렬 결과를 출력하시오.
 */

public class Main {
	public static void main(String[] args) {
		
		// Main 클래스에서 ArrayList<Employee>를 생성하고 직원 4명을 저장하시오.
		List<Employee> employees = new ArrayList<>(Arrays.asList(
				new Employee("김대리", 4000),
				new Employee("박사장", 9000),
				new Employee("김철수", 3500),
				new Employee("이인턴", 3000)
				));
		
		
//		List<String> employeeName = new ArrayList<>();
//		List<Integer> employeeSalary = new ArrayList<>();
//		for (Employee employee : employees) {
//			employeeName.add(employee.getName());
//			employeeSalary.add(employee.getSalary());
//		}
//		
//		// 오름차순
//		Collections.sort(employeeSalary, Comparator.reverseOrder());
//		System.out.println(employeeSalary);
//		
//		// 내림차순
//		Collections.sort(employeeName);
//		System.out.println(employeeName);
		
		Collections.sort(employees, (e1, e2) -> (e2.getSalary() - e1.getSalary())); // 내림차순이었으면 e1 - e2로 가야함
		// 오른쪽 int : 양수이면 변경, 음수이면 그대로 순서를 둠
		for (Employee employee : employees) {
			employee.printInfo();
		}
		
		Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName())); // compareTo의 반환값은..? -> int임
		for (Employee employee : employees) {
			employee.printInfo();
		}

	}
}
