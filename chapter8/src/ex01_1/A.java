package ex01_1;


//A클래스는 public 클래스이기 때문에 다른 패키지에서 사용할 수 있다.
//다른 패키지에서 쓰려면 무조건 public
public class A {
    public int m = 3;
    public int n = 4;
    public void print(){
        System.out.println("임포트");
    }
}

