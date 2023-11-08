package ex03;
//abstract = 추상메서드
//interface에는 추상 메서드만 올 수 있음
//인터페이스는 구현 안 된 다양한 기능의 집합,
//자식들(=클래스) 오버라이딩 해줘야 함
interface A{
	void abc();//public abstract 자동으로 붙여줌
	default void bcd(){
		System.out.println("A인터페이스의 bcd()");
	}
}

class B implements A{
	@Override
	public void abc() {
		System.out.println("B클래스의 abc()");
	}
}

class C implements A{
	@Override
	public void abc() {
		System.out.println("C클래스의 abc()");
	}
}

public class DefaultMethod {
	public static void main(String[] args) {
		A a1 = new B();
		A a2 = new B();
		a1.abc();
		a1.bcd();//bcd는 부모가 준 default method이다.
		a2.abc();
		a2.bcd();
	}
}
