package ex05;
//1. 예외 문장을 가지고 있는 아이가 직접 try-catch
class A{
	void abc(){
		bcd();
	}
	void bcd(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
//2. 호춯한 아이로 예외를 전가할 때 throws
class B{
	void abc(){
		try {
			bcd();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	void bcd() throws InterruptedException {
		Thread.sleep(1000);
	}
}
public class ThrowsException {
	public static void main(String[] args) {


	}
}
