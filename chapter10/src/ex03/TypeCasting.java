package ex03;
//클래스 A는 부모가 없는 것처럼 보이지만 자동으로 extends Object가 붙으면서
// 최상위 클래스인 object의 자식이 된다 ->결국은 A 상속받은 자식들도 object의 자식
class A{
    int m = 3;
    void abc(){
        System.out.println("A클래스");
    }
    //toString은 클래스를 설명하는 용도로 사용한다.
    @Override
    public String toString() {
        return "안녕 내 이름은 클래스 A야 필드 m과 abc()를 가지고 있지";
    }
}
class B extends A {
    int n = 4;

    void bcd() {
        System.out.println("B클래스");
    }

    @Override
    public String toString() {
        return "안녕 나는 클래스 B야 필드 n과 메서드 bcd()를 가지고 있지";
    }

    @Override
    void abc() {
        System.out.println("A클래스를 재정의 함");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        //작은 풍선만 만들고 작은 풍선을 가리키는 경우
        A aa = new A();
        //toString()은 Object 클래스로부터 상속 받은 메서드이다.
        System.out.println(aa.toString());
        System.out.println(aa.m);
        aa.abc();
        //크고 작은 풍선 둘 다 만들고 작은 풍선을 가리키는 경우
        A bb = new B();
        System.out.println(bb.m);
        bb.abc();
        //bb가 가리키는 작은 풍선(A)안에 n이 없기에 bb.n사용 불가
        //A를 가리키던 bb를 B로 다운캐스팅(자식에 맞춰서 캐스팅)
        //즉 큰 풍선을 가리키게 바꿈
        System.out.println(((B)bb).n);
        ((B)bb).bcd();
        bb.abc();

        //크고 작은 풍선 둘 다 만들고 큰 풍선을 가리키는 경우
        B cc = new B();
        System.out.println(cc.m);
        System.out.println(cc.n);
        cc.abc();
        cc.bcd();

    }
}
