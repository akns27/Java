package ch02;
//변수에는 일반 변수와 참조변수가 있다


import java.util.Arrays;

public class InitialValue {
    public static void main(String[] args) {
        //일반 변수나 배열은 초기화가 자동으로 되지 않는다.(c언어에서는 0이나 쓰레기 값이 자동으로 들어감...)

        int value1;
        //System.out.println(value1);
        int[] value2;
        //System.out.println(value2);

        int value3 = 0;
        System.out.println(value3);
        //배열은 대표적인 참조 변수다. 아직 주소를 담을 수 없다면 null로 초기화한다.
        int[] value4 = null;
        System.out.println(value4);
        System.out.println();

        //new로 만든 배열의 실체들은 자동으로 초기화가 된다.
        int[] array1 = new int[3];//new int로 3칸짜리 방을 만듦, int 배열 방의 초기값은 0이다.
        for(int i =0; i<3; i++){
            System.out.println(array1[i]);
        }
        boolean[] array2 = new boolean[3];//boolean 배열 방의 초기값은 false이다.
        for(int i =0; i<3; i++){
            System.out.println(array2[i]);
        }

        double[] array3 = new double[3];//double 배열 방의 초기값은 0.0이다.
        for(int i =0; i<3; i++){
            System.out.println(array3[i]);
        }

        String[] array4 = new String[3];//string 배열 방의 초기 값은 null이다. 이유는 String으로 만든 변수도 참조변수이기 때문이다.
        for(int i =0; i<3; i++){
            System.out.println(array4[i]);
        }
        //배열을 한 줄에 예쁘게 출력하는 방법
        //Arrays 클래스 파일 안에있는 toString() 메서드를 실행시킴
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));

    }
}
//변수에는 일반 변수와 참조변수가 있다
//참조 변수에는 배열, string이 있다.
