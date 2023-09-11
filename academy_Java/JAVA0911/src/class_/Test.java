package class_;

public class Test {

	public static void main(String[] args) {
		// Person 클래스 인스턴스(p) 생성
		Person p = new Person();
		p.name = "홍길동";
		p.age = 20;
		p.isHungry = false;
//		System.out.println("이름 : " + p1.name);
//		System.out.println("나이 : " + p1.age);
//		System.out.println("배고픔 : " + p1.isHungry);
		// 참조변수 p를 통해 멤버변수는 물론 메서드까지 접근 가능
		p.showPersonInfo();
		p.talk();
		p.eat("도시락");
	} // mina() 메서드 끝

}

/*
 *  Person 클래스 정의
 * [ 멤버변수(인스턴스 변수) 선언]
 * - 이름(name, 문자열)
 *   나이(age, 정수)
 *   배고픔(isHungry, boolean)
 *   
 * [ 메서드 정의 ]
 * - 이름, 나이, 배고픔을 출력하는 showPersonInfo() 메서드
 *   (매개변수 없음, 리턴값 없음)
 *   출력 형태
 *   이름 : 홍길동
 *   나이 : 20
 *   배고픔 : true
 *   
 * - 밥먹는 기능을 수행하는 eat() 메서드
 *   (매개변수 : 음식이름(foodName, 문자열), 리턴값 없음)
 *   => "XXX 먹기!" 출력
 *   => 멤버변수 isHungry 의 값을 false로 변경
 *   
 * - 말하기 기능을 수행하는 talk() 메서드
 *   (매개변수 없음, 리턴값 없음)
 *   => "말하기!" 출력
 *   => 멤버변수 isHungry 의 값을 true로 변경
 *   
*/
class Person {
	// 멤버변수(인스턴스 변수) 선언
	String name;
	int age;
	boolean isHungry;
	
	public void showPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("배고픔 : " + isHungry);
	}
	public void eat(String foodName) {
		System.out.println(foodName + " 먹기!");
		isHungry = false;
		System.out.println("식사 후 배고픔 : " + isHungry);
	}
	public void talk() {
		System.out.println("말하기!");
		isHungry = true;
		System.out.println("말한 후 배고픔 : " + isHungry);
	}
}
