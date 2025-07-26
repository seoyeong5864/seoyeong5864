package inheritance04_super;


// public class는 한번 밖에 못 쓰는데 그냥 class는 여러개 쓸 수 있음

public class Student extends Person {
	String major;
	
	public Student (String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
//	// 기본 생성자 생략
//	public Student() {
//		super();
//	}
		
	
	public void study() {
		System.out.println("공부를 한다");
	}
}


