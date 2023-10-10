package method_overriding;

public class Ex {

	public static void main(String[] args) {
		// 상속의 기본 개념 복습
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
		
		System.out.println("------------------------------");
		
		Student s2 = new Student("이순신", 44, false, true);
		s2.eat("점심"); // Person 클래스로부터 상속받은 메서드
		s2.sleep(); // Person 클래스로부터 상속받은 메서드
		s2.Study();
		
	}

}

class Person {
	String name;
	int age;
	boolean isHungry;
	
	public Person() {
		System.out.println("Person() 생성자 호출됨!");
	}
	
	public void eat(String food) {
		System.out.println(food + " 먹기!");
		isHungry = false;
	}
	
	public void sleep() {
		System.out.println("잠자기!");
		isHungry = true;
	}
}

class Student extends Person {
	boolean isStudyMode;
	
	public Student() {
		// super();
		// Student() 생성자가 호출되면 가장 먼저
		// 슈퍼클래스인 Person 클래스의 기본 생성자가 자동으로 호출됨
		System.out.println("Student() 생성자 호출됨!");
	}
	
	// 이름, 나이, 배고픔, 공부모드를 전달받아 초기화하는 생성자
	public Student(String name, int age, boolean isHungry, boolean isStudyMode) {
		// super();
		// Student(String, int, boolean, boolean) 생성자가 호출되면 가장 먼저
		// 슈퍼클래스인 Person 클래스의 기본 생성자가 자동으로 호출됨.
		System.out.println("Student(String, int, boolean, boolean) 생성자 호출됨");
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
		this.isStudyMode = isStudyMode;
	}
	
	public void Study() {
		System.out.println("공부하기!");
	}
}
