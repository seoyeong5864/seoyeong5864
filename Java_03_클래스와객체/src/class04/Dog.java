package class04;

public class Dog {
	
	String name;
	int age;
	
	
	//기본생성자가 자동으로 추가된다! -> 습관처럼 만들기를 권장! -> Ctrl + Space + Enter
//	public Dog() {
//		
//	}
	public Dog() {
		System.out.println("기본 생성자 호출");
	}
	
	public Dog(int age) {
		this("뽀삐", age);
//		this.name = "똘똘이";
//		this.age = age;
//		this.name = null;
	}
	
//	public Dog(String n, int a) {
//		name = n;
//		age = a;
//	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
