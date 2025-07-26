package inheritance01_no;

public class Test {
	public static void main(String[] args) {
		Person p = new Person(); //기본생성자를 컴파일러가 알아서 추가를 해주기 때문에 가능
		Student st = new Student();
		
		p.eat();
		st.eat();
	}
}
