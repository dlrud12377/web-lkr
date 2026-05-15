package dto;

public class RentalDTO {
	// 필드
	private int rental_id;
	private int customer_id;
	private String rental_date;
	
	// 생성자
	public RentalDTO(int rental_id, int customer_id, String rental_date) {
		this.rental_id = rental_id;
		this.customer_id = customer_id;
		this.rental_date = rental_date;
	}

	// 생성자 오버로딩
	public RentalDTO(int customer_id, String rental_date) {
		this.customer_id = customer_id;
		this.rental_date = rental_date;
	}

	// getter/setter
	
	public int getRental_id() {
		return rental_id;
	}

	public void setRental_id(int rental_id) {
		this.rental_id = rental_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getRental_date() {
		return rental_date;
	}

	public void setRental_date(String rental_date) {
		this.rental_date = rental_date;
	}
	
}
