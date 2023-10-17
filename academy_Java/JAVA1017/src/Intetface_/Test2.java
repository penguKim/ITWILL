package Intetface_;

public class Test2 {

	public static void main(String[] args) {
		
		BumbleBee b = new BumbleBee();
		b.fight();
		b.speak();
		b.transform(BumbleBee.MODE_CAR);
		
	}

}

/*
 * 전투 기능을 갖는 Fightable 인터페이스
 * => fight() 메서드 : 파라미터 없음, 리턴값 없음
 * 
 * 변신 기능을 갖는 Transformable 인터페이스
 * => MODE_CAR = 1, MODE_AIRPLANE = 2, MODE_NORMAL = 3
 * => transform() 메서드 : 파라미터 있음(mode, 정수형), 리턴값 없음
 * 
 * Robot 인터페이스 정의
 * => Fightable 인터페이스, Trandformable 인터페이스 상속
 * => 말하기 기능(speak())
 * 
 * Robot 인터페이스를 구현하는 BumbleBee 클래스 정의
 * => fight() 메서드 오버라이딩 
 *    - "로켓 발사!" 출력
 * => transform() 메서드 오버라이딩
 *    - mode 값에 따라 다른 형태로 변신
 *    - MODE_NORMAL 이면 "기본 모드(로봇)로 변신!" 출력
 *    - MOED_CAR 이면 "자동차로 변신!" 출력
 *    - MODE_AIRPLANE 이면 "비행기로 변신!" 출력
 * => speak() 메서드 오버라이딩
 *    - "라디오로 말하기" 출력
 */

interface Fightable {
	public abstract void fight();
}

interface Transformable {
	public static final int MODE_CAR = 1;
	public static final int MODE_AIRPLANE = 2;
	public static final int MODE_NORMAL = 3;
	
	public abstract void transform(int mode);
}

interface Robot extends Fightable, Transformable {
	// Fightable, Transformable 의 멤버를 모두 상속받음
	public abstract void speak();
}

// Robot 인터페이스를 구현하는 BumbleBee 클래스 정의
class BumbleBee implements Robot {

	@Override
	public void fight() {
		System.out.println("로켓 발사!");
	}

	@Override
	public void transform(int mode) {
		if(mode == Transformable.MODE_CAR) {
			System.out.println("자동차로 변신!");
		} else if(mode == Transformable.MODE_AIRPLANE) {
			System.out.println("비행기로 변신!");
		} else if(mode == Transformable.MODE_NORMAL) {
			System.out.println("기본 모드(로봇)로 변신!");
		}
	}

	@Override
	public void speak() {
		System.out.println("라디오로 말하기!");
	}
	
}











