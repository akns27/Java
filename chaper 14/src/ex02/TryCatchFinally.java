package ex02;
//예외가 발생할 가능성이 있는 문장들을 중괄호로 {}묶어서 예외 처리를 해주어야 한다.
//예외 처리 방법 2가지
//1. Try-Catch로 묶기(내가 직접 책임짐)
//2. Throws로 던지기(나를 호출한 쪽에 책임 전가)
//try{}에는 예외 발생 가능성이 있는 문장들을 적는 곳
//catch{}에는 try{}에서 만약에 발생했다면 처리하는 차선책이 적히는 곳
//만약 try{}에서 예외가 발생하지않으면 catch{}는 실행안됨
//finally{}에는 try와 catch에서 공통적으로 수행되는 명령을 적는다

import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchFinally {
	public static void main(String[] args){
		System.out.println("딜레이 전");
		try {
			Thread.sleep(1000);//쓰레드를 호출시켜서 1초 멈추기
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("딜레이 후");

		//forname안에 있는 클래스를 JVM이 메모리로 올려서 객체 하나를 반환하는 명령ß
		try {
			Class cls = Class.forName("java.lang.object");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		InputStreamReader in = new InputStreamReader(System.in);//입출력 형식을 키보드로 하겠다(scanf처럼)
		try {
			in.read();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}
