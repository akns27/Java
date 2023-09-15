package ch06;

public class MethodOverLoading {
    //메소드의 이름을 같지만 메소드 시그니처는 다르게 하여 같은 이름의 메소드를 여러개 만들 수 있는 것. 쉽게 말하자면
    //메소드 오버로딩은 원래라면 안되는 것을 시그니처(=괄호 안에 것)을 바꿔서 출력(가능하게)이 되게 만드는 것
    //호출할 때 컴파일러가 헷갈리게 시그니처를 만들어놓으면 오류 뜸
    //메서드 시그니쳐가 다르다는 것은 이름은 똑같지만 매개변수의 종류나 숫자가 다름을 의미

    public static void main(String[] args){//static을 굳이 붙이는 이유는 main(같은 static)을 호출하려고.
        print(3,4);

    }

    public static void print(){
        System.out.println("데이터가 없습니다");//print()만 호출할 시 이거 호출
    }

    public static void print(int a){
        System.out.println("1234");//자연수 호출시 이거 호출

    }

    public static void print(double a){
        System.out.println("5678");//예)5.5입력시 이거 호출

    }

    /* 바로 위의 것과 메서드 시그니쳐가 똑같기 때문에 정의할 수 없다.
    public static void print(double b){
        System.out.println("5678");//예)5.5입력시 이거 호출

    }
    */

    public static void print(int a, int b){
        System.out.println("9101112");
    }
/* 반환명이 다르다는 것은 호출할 때 헷갈리기 때문에 시그니쳐가 같다라고 할 수 있다.
    public static int print(int a, int b){
        System.out.println("9101112");
    }
*/




}
