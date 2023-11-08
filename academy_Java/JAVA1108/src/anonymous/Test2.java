package anonymous;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * run() 메서드를 가지는 인터페이스 Vehicle 를 정의하고
		 * 익명 구현 객체를 이용하여 필드, 로컬변수의 초기값과
		 * 메서드의 매개값을 출력해보세요!
		 * 필드 : 자전거가 달립니다.
		 * 로컬변수의 초기값 : 승용차가 달립니다.
		 * 메서드의 매개값 : 트럭이 달립니다.
		 */
		
		AnonyInterfaceClass aic = new AnonyInterfaceClass();
		aic.v.run();
		aic.method1();
		aic.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
		
	}

}

interface Vehicle {
	void run();
}

class AnonyInterfaceClass {
	Vehicle v = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	void method1() {
		Vehicle localV = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localV.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
















