package ch07;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {
    public static void main(String[] args){
        //메서드 오버로딩을 이용해서 동일한 이름의 메서드를 다양하게 호출
        method1(1,2);
        method1(1,2,3);
        method1();

        method2("안녕", "HI");
        method2("잘가", "Bye");
        method2();

    }

    //만약 100가지의 시그니처가 있다묜...
    //100가지나 만들어야 하냐구..
    //이때!.. 한 개발자가 새로운 문법을 하나 만들었습니다! 이름하여 '가변길이 배열 매개변수'
    //...사용
    public static void method1(int...array){//...을 붙이면 int형 무엇이든 넣어도 됨
        for(int k:array){
            System.out.print(k+" ");
        }
        System.out.println();

    }

    public static void method2(String...array){
        System.out.print(Arrays.toString(array));
        System.out.println();

    }



}
