package inheritance04_super;


// public class는 한번 밖에 못 쓰는데 그냥 class는 여러개 쓸 수 있음

public class Person {
	String name;
	int age;
	
//	// 기본 생성자 생략
//	public Person() {
//		super();
//	}
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public void eat() {
		System.out.println("음식을 먹는다");
	}
	
}


