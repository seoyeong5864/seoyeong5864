package inheritance02_ok;
//Person을 상속받기 위해서 extends 키워드를 사용하겠다
public class Student extends Person {
	String name;
	int age;
	String majorl;
	
	public void study() {
		System.out.println("공부를 한다");
	}
}
