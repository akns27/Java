package ex01;
//button 클래스 안에는 onclick()과 같은 메서드가 존재한다.
//onclick()을 실행했을 때 어떤 동작을 실행할 것인지는 때에 따라 다르다.(추상 메서드로 만든다)
//귀를 귀울이고 있다가(이벤트 리스너) 누군가가 setOnClickListner를 호출했을 때
//onClick()메서드의 역활이 확실히 정해지게 되고 누군가가 정의한 오버라이딩 대로 실행된다.

class Button{
	OnClickListener ocl;
	void setOnClickListner(OnClickListener ocl){
		this.ocl = ocl;
	}//구현된 OnclickListner 인터페이스를 외부에서 받아와서 집어넣겠다.
	interface OnClickListener{//클릭 버튼이 어떤 역활을 할지 모르기 때문에 추상 메서드로 만듦
		void onClick();
	}

	void onClick(){
		ocl.onClick();
	}

}


public class ButtonAPIExample {
	public static void main(String[] args) {
		//예시1 : 클릭하면 음악 재생
		Button btn1 =new Button();//첫번째 버튼 객체 생성
		Button btn2 =new Button();//두번째 버튼 객체 생성
		//빈껍데기(interface)를 new해서 바로 줄 수는 없다.
		//빈껍데기(interface)를 구현한(implements) 어떤 자식 클래스를 new()로 넘겨주거나
		//아니면 빈껍데기(interface)를 넘겨줄 때 중괄호 안에 동시에 구현시키면 (Override)가능하다.
		btn1.setOnClickListner(new Button.OnClickListener(){
			@Override
			public void onClick() {
				System.out.println("음악 재생 중");
			}
		});
		btn2.setOnClickListner(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("네이버 실행 중");
			}
		});
		btn1.onClick();
		btn2.onClick();

	}
}
