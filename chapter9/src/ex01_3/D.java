package ex01_3;

import ex01_1.A;

//D extends A를 했다는 것은 A의 (확장 버전으로 D를 만들겠다) A가 부모 클래스, D가 A의 자식 클래스로 사용하겠다는 뜻.
// D가 A의 자식이 되는 순간 A의 필드, 메서드가 D에 모두 복사가 된다.
public class D extends A{
    public void print() {
        //자식 클래스에서는 public과 더불어 protected까지 사용할 수 있다
        //default와 private(c와 d)는 사용할 수 없음
        System.out.print(a + " ");
        System.out.print(b + " ");
        //System.out.print(c + " ");
        //System.out.print(d + " ");
        System.out.println();
    }
}
