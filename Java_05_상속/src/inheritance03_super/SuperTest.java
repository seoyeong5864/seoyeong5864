package inheritance03_super;


// public class는 한번 밖에 못 쓰는데 그냥 class는 여러개 쓸 수 있음

class Parent {
	void eat() {
		System.out.println("냠냠");
	}
}

class Child extends Parent {
	void eat() {
		super.eat(); //상위 클래스의 메서드 호출
		System.out.println("쩝쩝");
	}
}
	
public class SuperTest {
	public static void main(String[] args) {
		Child child = new Child();
		child.eat();
	}
}


