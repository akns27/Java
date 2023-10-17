package ex05;
class A {
    void abc(){
        System.out.println("A클래스의 abc()");
    }
}
class B extends A{
    void bdc(){
        //super는 부모를 가리킴,
        //super는 덮어쓰기 전 부모의 원형을 되찾을 수 있음(= abc()가 호출됨)
        super.abc();
    }
    @Override
    void abc(){
        System.out.println("B클래스의 abc()");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        B bb = new B();
        bb.abc();
        bb.bdc();
    }
}
