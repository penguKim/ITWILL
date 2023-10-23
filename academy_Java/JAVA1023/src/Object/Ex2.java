package Object;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * toString() 메서드(public String toString() {} )
		 * - 어떤 객체의 정보를 문자열로 변환하여 리턴
		 * - 기본적으로 Object 클래스의 toString() 메서드는
		 *   객체의 정보(= 주소값)을 문자열로 리턴하도록 정의되어 있음.
		 * - 일반적으로 객체의 정보는 객체 내의 멤버변수에 저장된 데이터(속성값)를
		 *   의미하므로 Object 클래스의 toString() 메서드를 오버라이딩하여
		 *   객체가 가지는 멤버변수 값을 문자열로 결합하여 리턴하도록 해야함
		 * - 출력문 내에서는 toString() 메서드 생략 가능(참조변수명만으로 사용 가능)
		 * - 자바에서 제공하는 대부분의 클래스(API) 들은 toString() 메서드가
		 *   오버라이딩 되어 있으므로 객체에 저장된 값을 문자열로 리턴받기 가능
		 *   ex) String 클래스, ArrayList 클래스 등
		 * - equals() 메서드와마찬가지로 단축키를 통한 자동 생성 가능
		 *   => Alt + Shift + S -> S
		 */
		
		String str = new String("자바"); // String 타입도 객체이다!
		System.out.println(str); // toString() 메서드 생략되어 있음(문자열 출력)
		System.out.println(str.toString()); // 위의 결과와 동일하다.
		// => java.lang.String.toString() 재정의한 메서드 호출하여 문자열 출력
		
		Person2 p2 = new Person2("홍길동", 20, "999999-9999999");
		System.out.println("사람 p2 의 정보 : " + p2); // p2.toString() 과 동일
		System.out.println("사람 p2 의 정보 : " + p2.toString()); // Object.Person2@626b2d4a
		// => println() 메서드 내에 p2 객체 정보 출력 시 toString() 생략 가능
		// => java.lang.Object.toString() Object의 메서드 호출하여 주소값 출력
		
		// 출력문이 아닌 결과값을 변수에 저장하는 경우 반드시 toString() 필수
		String personInfo = p2.toString();
		// Object 클래스의 toString() 메서드는 "클래스명@주소값" 형태의 문자열 리턴
		// => 주소값은 16진수로 변환되어 문자열로 결합됨
		System.out.println("Person p2 의 클래스명 : " + p2.getClass().getName());
		System.out.println("Person p2 의 주소값 : " + p2.hashCode());
		
		System.out.println("------------------------------");
		
		Person3 p3 = new Person3("홍길동", 20, "999999-9999999");
		System.out.println("사람 p3의 정보 : " + p3);
		System.out.println("사람 p3의 정보 : " + p3.toString());
		
	}
	
}

class Person2 {
	String name;
	int age;
	String jumin;
	
	public Person2(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
	
}

class Person3 {
	String name;
	int age;
	String jumin;
	
	public Person3(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	
//	@Override
//	public String toString() {
//		// 현재 인스턴스가 가진 멤버변수들을 모두 문자열로 결합하여 리턴
//		// => 결합하는 형태(출력 모양)는 개발자가 알아서 결정
//		return "이름 : " + name + ", 나이 : " + age + ", 주민번호 : " + jumin;
//	}
	
	// toString() 메서드 자동 생성(오버라이딩)으로 만들기
	@Override
	public String toString() {
		return "Person3 [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}
	
	
}














