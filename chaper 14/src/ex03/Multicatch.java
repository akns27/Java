package ex03;

public class Multicatch {
	public static void main(String[] args) {
//		try {
//			System.out.println(3 / 0);
//		} catch (ArithmeticException e) {//e는 변수이름
//			System.out.println("숫자를 0으로 나눌 수 없습니다");
//		} finally {
//			System.out.println("프로그램 종료");
//		}
//    finally는 try catch와 상관없이 어떻게든 실행됨

//		//Integer.parseInt() : ()안에 있는 문자를 숫자로 변환시켜 줌
//		try{
//			int num = Integer.parseInt("10A");
//			System.out.println(num);
//		}
//		catch (NumberFormatException e){
//			System.out.println("숫자로 바꿀 수 없습니다.");
//		}
	try {
		System.out.println(3/0);
		int num = Integer.parseInt("10");
		System.out.println(num);
	}
		catch (ArithmeticException | NumberFormatException e){
			System.out.println("예외가 발생했습니다!");
		}
	}
}
