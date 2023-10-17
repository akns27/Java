package ex06;

public class ToString {
        private int m = 3;
        private int n = 4;
    //외부에서 m과n을 직접적으로 접근하지 못하도록 방어적인 코드를 작성할 필요가 있다.
    //간접적으로 메서드를 통해서 필드(데이터)에 접근하도록 코드르 짜야 안전한 코드

    //m 필드에서 값을 가져오는 메서드
    public int getM() {
        return m;
    }

    //m 필드에 값을 저장하는 메서드
    public void setM(int m) {
        this.m = m;
    }

    //n 필드에서 값을 가져오는 메서드
    public int getN() {
        return n;
    }

    //n 필드에 값을 저장하는 메서드
    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "ToString{" +
                "m=" + m +
                ", n=" + n +
                '}';
    }



    //필드는 private
    //바꾸려면 getter 가져오려면 setter

    public static void main(String[] args) {

    }

}
