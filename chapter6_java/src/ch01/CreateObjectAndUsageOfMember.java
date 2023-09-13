package ch01_new

class A{
    //A라는 클래스 정의
    //클래스 안에는 필드와 메서드들을 정의할 수 있다.

    int m =3;//m의 default값은 3
    void print(){
        System.out.println("객체의 생성과 활용");
    }
}

public class CreateObjectAndUsageOfMember{
    public static void main(String[] args){
        //클래스를 활용하여 객체(실체 불어빵 생성)
        A a = new A();//소문자 a는 객체의 주소가 담기는 참조변수(이름 변경 가능)

        //객체 안에 있는 m이라는 필드를 5에 저장
        a.m = 5;
        System.out.println(a.m);

        //객체 안에 있는 print()라는 메서드를 호출
        a.print();
    }
}