package ex01_3;

import ex01_1.A;

public class C {
    public void print(){
        A a = new A();
        System.out.print(a.a + " ");
        System.out.println();
        //아하! 다른 클래스 에서는 protected, default, private 모두 사용이 불가능하구나!
        //System.out.print(a.b + " ");
        //System.out.print(a.c + " ");
        //System.out.print(a.d + " ");
    }

}
