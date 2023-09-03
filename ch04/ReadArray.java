package ch04;

import java.util.Arrays;

public class ReadArray {
    public static void main(String[] args){
        int[] array = new int[] {3, 4, 5, 5, 7};

        //출력하기1
        System.out.print(array[0]+"");
        System.out.print(array[1]+"");
        System.out.print(array[2]+"");
        System.out.print(array[3]+"");
        System.out.println(array[4]+"");

        //println은 줄바꿈해서 출력하는 것


        //출력하기 2. for문을 써서 출력
        //for문을 쓸때 배열의 길이 바뀌면 최대 길이 값을 일일이 수정해야 하니 좋지 않은 코드가 됨
        //따라서 .length를 사용할 필요가 있다.
        for(int i=0; i<array.length; i++)//배열 출력할때는 배열이름.length(ex/ a.length)
            System.out.print(array[i] + "");
        System.out.println();
        //장점: 범위를 지정할 수 있다.

        //출력하기 3. each for문을 활용
        for(int k: array)
            System.out.print(k + "");
        System.out.println();
        //장점이자 단점: 전체 출력 가능
        //국룰로 each for문은 인덱스를 k로 잡음

        //출력하기 4.
        System.out.println(Arrays.toString(array));
    }
}
