package abstract_;

public class Test {

	public static void main(String[] args) {
		
		SuperMan sm = new SuperMan();
		sm.takeOff();
		sm.fly();
		sm.land();
		
		
		Bird b = new Bird();
		b.takeOff();
		b.fly();
		b.land();
		
		
		Airplane a = new Airplane();
		a.takeOff();
		a.fly();
		a.land();
		
		System.out.println("---------------------");
		
		// SuperMan, Bird, Airplane -> Flyer  타입으로 업캐스팅하여 다형성 활용
		
		Flyer f = new SuperMan();
		f.takeOff();
		f.fly();
		f.land();
		
		f = new Bird();
		f.takeOff();
		f.fly();
		f.land();
		
		f = new Airplane();
		f.takeOff();
		f.fly();
		f.land();
		
	}

}

/*
 * 모든 날아다니는 것에 대한 이륙(takeOff), 비행(fly), 착륙(land) 메서드 정의
 * => 슈퍼클래스로 사용할 Flyer 클래스의 메서드들에는
 *    실행할 코드가 불필요하므로 추상메서드로 정의하고
 *    추상메서드를 포함하는 Flyer 클래스를 추상클래스 정의
 */

abstract class Flyer {
	
	public abstract void takeOff();
	
	public abstract void fly();
	
	public abstract void land();
}

/* Flyer 클래스를 상속받는 SuperMan, Bird, Airplane 클래스 정의
 * takeOff() 호출 : "XXX 이륙!"
 * fly() 호출 : "XXX 비행!"
 * land() 호출 : "XXX 착륙!"
 */

class SuperMan extends Flyer {

	@Override
	public void takeOff() {
		System.out.println("SuperMan 이륙!");
	}

	@Override
	public void fly() {
		System.out.println("SuperMan 비행!");
	}

	@Override
	public void land() {
		System.out.println("SuperMan 착륙!");
	}
	
}

class Bird extends Flyer {

	@Override
	public void takeOff() {
		System.out.println("Bird 이륙!");
	}

	@Override
	public void fly() {
		System.out.println("Bird 비행!");
	}

	@Override
	public void land() {
		System.out.println("Bird 착륙!");
	}
	
}

class Airplane extends Flyer {
	
	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙!");
	}

	@Override
	public void fly() {
		System.out.println("Airplane 비행!");
	}

	@Override
	public void land() {
		System.out.println("Airplane 착륙!");
	}
	
}

















