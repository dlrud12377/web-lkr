package ex1_generic.exam2;

public class MemberResponse <T> {
//	필드
	private boolean success;
	private String message;
	private T data;
	
//	생성자를 통해 모든 필드를 초기화 한다
	public MemberResponse(boolean success, String message, T data) {
		this.success = success;
		this.message = message;
		this.data = data;
	}
	
	public boolean isSuccess() {
		return success;
	}
	
	public String getMessage() {
		return message;
	}
	
	public T getData() {
		return data;
	}
}
