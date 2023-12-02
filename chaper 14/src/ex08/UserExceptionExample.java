package ex08;
//정수가 음수일 때의 예외

import java.util.Scanner;

class MinusException extends Exception {
	public MinusException() {
		super();
	}

	public MinusException(String message) {
		super(message);
	}
}

//점수가 100점을 초과할 때의 예외
class OverException extends Exception {
	public OverException(String message) {
		super(message);
	}
}

//A클래스를 만들어서 예외 두 개를 호출
class A {
	void checkScore(int score) throws MinusException, OverException {
		if (score < 0) {
			//Exception을 발동시키는 문법 -> throw
			throw new MinusException("예외 발생 : 음숫값 입력");
		} else if (score > 100) {
			throw new OverException("예외 발생 : 100점 초과");
		}
		System.out.println("정상적인 값입니다.");
	}
}


		public class UserExceptionExample {
			public static void main(String[] args) {
				A a = new A();
				Scanner scanner = new Scanner(System.in);
				int score;
				while (true){
					score = scanner.nextInt();
					try {
				a.checkScore(score);
			} catch (MinusException | OverException e) {
				System.out.println(e.getMessage());
				return;
			}
				}
			}
		}
