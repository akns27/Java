package ex01;
// 예외 처리를 하는 법 try-catch-finally 구문을 활용
//try{} 예외가 발생할 가능성이 있는 구문들을 적는 곳
//catch{} : try{}에서 실제로 예외가 발생했다면 실행된는 차선책들이 적히는
//finally{}: try와 catch에서 공통적으로 실행되는 문장을 적어놓는 곳
//차선책이 뭐야?:
public class ExceptionHandler {
	public static void main(String[] args) {
		try{
			System.out.println(3/0);
		}
		catch (ArithmeticException e){//e는 변수 이름 <- 임의로 정해준 거임
			System.out.println("숫자는 0으로 나눌 수 없습니다");
		}
		finally {
			System.out.println("프로그램 종료");
		}

		try{
			int num = Integer.parseInt("10A");//parseInt는 문자열을 숫자로 변경시켜줌, Integer은 정수라는 뜻
		System.out.println(num);
		}
		catch (NumberFormatException e){
			System.out.println("A는 변환할 수 없습니다");
		}
	}
}
