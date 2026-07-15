package com.korea.test.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.test.DTO.ResponseDTO;
import com.korea.test.DTO.StudentDTO;
import com.korea.test.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/students")
@RequiredArgsConstructor
public class StudentController {

	private final StudentService studentService;

	// 수강생 조회
	@GetMapping
	public ResponseEntity<?> printStudents() { // Response 객체에는 조회 결과와 리스트 객체가 동시에 들어있음, 따라서 둘다 반환이 필요
		try {
//			if((studentService.getStudents() == null) || (studentService.getStudents().size() == 0)) {
//				return new ResponseDTO<StudentDTO>("error", null);
//			}
//			
//			return new ResponseDTO<StudentDTO>("success", studentService.getStudents());
			
			List<StudentDTO> students = studentService.getStudents();
			
			ResponseDTO<StudentDTO> response = ResponseDTO
													.<StudentDTO>builder()
													.error(null)
													.data(students)
													.build();
			
			return ResponseEntity.ok().body(response);
		}
		catch(Exception e){
			ResponseDTO<StudentDTO> response = ResponseDTO
					.<StudentDTO>builder()
					.error("수강생 목록 조회에 실패했습니다.")
					.build();
			return ResponseEntity.ok().body(response);
		}

	}
	
	// 데이터를 주소에 넣어서 보낸게 아님
	// api/students/ ... -> pathvariable
	// api/students?name=... -> requestparam
	// 근데 둘다아니면? -> body 내용을 받아야 하니 @RequestBody
	// @RequestBody : 클라이언트가 HTTP 요청의 Body(본문)에 담아 보낸 데이터를 
	// Java 객체로 변환해서 받기 위한 어노테이션
	
	// 수강생 등록
	@PostMapping
	public ResponseEntity<?> addStudent(@RequestBody StudentDTO studentDTO) {
		StudentDTO savedStudentDTO = studentService.addStudent(studentDTO);
		
		ResponseDTO<StudentDTO> response = ResponseDTO.<StudentDTO>builder()
				.data(List.of(savedStudentDTO))
				.error(null)
				.build();
		
		return ResponseEntity.ok().body(response);
	}
	
}
	


//package com.korea.todo.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.korea.todo.DTO.ResponseDTO;
//import com.korea.todo.service.ToDoService;
//
//import lombok.RequiredArgsConstructor;
//
//@RestController
//@RequestMapping("todo")
//@RequiredArgsConstructor // @NonNull이나 final을 가진 필드에 대해서 매개변수를 갖는 생성자를 만들어준다.
//public class ToDoController {
//	
//	//TodoService를 필드로 갖고 객체를 생성자 주입을 한다.
//	private final ToDoService toDoService;
//	
////	public ToDoController(ToDoService toDoService) {
////		this.toDoService = toDoService;
////	}
//	
//	
//	// /test로 요청이 들어오면 testToDo라는 메서드가 실행되고 
//	// 서비스의 메서드를 실행하여 응답으로 반환한다.
//	// ResponseEntity : HTTP 응답 전체를 표현하는 객체
//	@GetMapping("/test")
//	public ResponseEntity<?> testTodo() {
//		String str = toDoService.testService();
//		List<String> list = new ArrayList<>();
//		list.add(str);
//		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
//		
//		// ok() -> 상태를 강제로 200으로 설정한다.
//		// body() -> 응답 본문에 response 객체를 넣는다.
//		// 완성된 HTTP 응답을 클라이언트에게 전송한다.
//		return ResponseEntity.ok().body(response);
//		
//		// Controller -> Service -> ResponseDTO -> ResponseEntity -> JSON
//	}
//	
//	
//}
