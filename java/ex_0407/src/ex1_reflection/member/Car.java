package ex1_reflection.member;

import lombok.Data;

@Data
public class Car {
	
	// field
	// model, owner -> String
	
	private String model;
	private String owner;
	
	// Const
	public Car() {
	}
	
	// model initalization Const
	public Car(String model) {
		this.model = model;
	}

	// setter getter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
