package ex1_list.ArrayList;

public class MemberBuilder {
	
	private String name;
    private int age;
    
    public MemberBuilder age(int age) {
        this.age = age;
        return this;
    }

    public MemberBuilder name(String name) {
        this.name = name;
        return this;
    }
    
    public Member build() {
    	return new Member(this.name, this.age);
    }
}