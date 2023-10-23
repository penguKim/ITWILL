package Object;

import java.util.Objects;

public class Ex {
	
	public static void main(String[] args) {
		
		/*
		 * Object 클래스
		 * - java.lang 패키지에 위치하는 클래스
		 * - 모든 클래스의 슈퍼클래스(최상위 클래스)
		 *   => 상속을 표현하지 않으면 자동으로 상속되는 클래스
		 * - Object 클래스의 모든 멤버는 다른 클래스에서 사용 또는 오버라이딩 기능
		 * 
		 * 1. equals() 메서드 (public boolean equals(Object obj) {} ) 
		 * 
		 * - 두 객체가 같은지 동등비교(==) 수행
		 *   => 즉, 두 객체의 주소값을 비교하여 같으면 true, 다르면 false 리턴
		 * - 실제 '두 객체가 같다' 의 의미는 두 객체의 주소값 비교가 아닌
		 *   객체가 가지는 멤버변수가 같다는 의미로 사용됨
		 *   => 따라서, 사용자가 정의하는 클래스에 Object 클래스로부터 상속받은
		 *      equals() 메서드를 오버라이딩하여
		 *      각 객체의 멤버변수끼리 비교하도록 수정하여 사용함
		 * - 자바에서 제공하는 대부분의 클래스(API) 들은
		 *   Object 클래스의 equals() 메서드를 오버라이딩 해 놓았으므로
		 *   객체 내용 비교가 가능함
		 *   ex) String 클래스, ArrayList 클래스 등
		 * - equals() 메서드 자동 생성(오버라이딩) 기능을 활용하여 쉽게 구현
		 *   => Alt + Shift + S -> H
		 */
	
		Person p1 = new Person("홍길동", "999999-9999999");
		Person p2 = new Person("홍길동", "999999-9999999");
		
		System.out.println("p1 의 객체 정보 : " + p1);
		System.out.println("p1 의 객체 정보 : " + p2);
		
		// 참조변수에 대한 동등비교(==) 수행
		if(p1 == p2) { // 객체 p1 과 p2 에 저장된 주소값 비교
			System.out.println("두 객체의 주소값이 같다! (==)");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (==)");
		}
		
		// 참조변수에 대한 Object 클래스의 equals() 메서드를 통한 비교 수행
		if(p1.equals(p2)) { // 동등비교 연산(==) 과 동일한 결과를 수행
			System.out.println("두 객체의 주소값이 같다! (equals())");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (equals())");
		}
		
		System.out.println("-------------------------------------------");
		
		OverridePerson p10 = new OverridePerson("홍길동", "999999-9999999");
		OverridePerson p11 = new OverridePerson("홍길동", "999999-9999999");
		
		// 참조변수에 대한 동등비교(==) 수행
		if(p10 == p11) { // 객체의 주소값 비교
			System.out.println("두 객체의 주소값이 같다! (==)");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (==)");
		}
		
		// 오버라이딩 된 equals() 메서드를 호출하여
		if(p10.equals(p11)) {
			System.out.println("두 객체의 내용(멤버변수 값)이 같다!");
		} else {
			System.out.println("두 객체의 내용(멤버변수 값)이 다르다!");
		}
		
	}
	
}

class Person {
	String name;
	String jumin;
	
	public Person(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}
	
}

class OverridePerson {
	String name;
	String jumin;
	
	public OverridePerson(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}


	
	// Object 클래스의 equals() 메서드 오버라이딩
	// Person 클래스의 모든 멤버변수를 비교하여
	// 하나라도 다를 경우 false 리턴, 모두 같은 경우 true 리턴하도록 수정
//	@Override
//	public boolean equals(Object obj) {
//		// 주의! equals() 메서드 파라미터로 객체를 전달하면
//		// 해당 객체는 Object 타입으로 업캐스팅이 일어나는데
//		// 이로 인해 해당 객체 고유의 멤버에는 접근이 불가능해짐
//		// => 따라서, 다시 해당 객체 타입으로 다운캐스팅이 필요함!
////		OverridePerson p = (OverridePerson)obj; 
//		// => 무조건 변환하기 보다 instanceof 연산자로 판별하면 더 안전함!
//		if(obj instanceof OverridePerson) {
//			OverridePerson p = (OverridePerson)obj; // Object -> OverridePerson
//			
//			// 다운캐스팅 된 객체(p)의 멤버변수와 현재 인스턴스의 멤버변수를
//			// 각각 비교 후 모두 같으면 true 리턴, 다르면 false 리턴
//			// => 문자열끼리의 비교이므로 String 클래스의 equals() 로 비교
//			if(name.equals(p.name) && jumin.equals(p.jumin)) {
//				// 이름과 주민번호가 모두 같을 경우 true 리턴
//				return true;
//			}
//			
//		}
//		
//		// 두 객체의 변수가 하나라도 다르거나 
//		// instanceof 연산 결과가 false 일 경우 false 리턴
//		return false;
//		
//	}
	
	// 단축키를 이용한 equals() 메서드 자동 오버라이딩
	// => 직접 오버라이딩 하기 보단 자동 생성 기능을 활용한다.
//	@Override
//	public int hashCode() { // 주소값을 16진수로 바꿔서 암호화 해준다.
//		return Objects.hash(jumin, name);
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 자기자신과의 비교
			return true;
		if (obj == null) // 비교대상이 없다.
			return false;
		if (getClass() != obj.getClass()) 
			// getClass()는 클래스명을 가져오는 메서드
			// 같은 데이터타입의 비교를 하는 equals() 메서드이기에
			// 다른 데이터타입일 경우 false 리턴을 위한 비교가 필요하다.
			return false;
		OverridePerson other = (OverridePerson) obj;
		return Objects.equals(jumin, other.jumin) && Objects.equals(name, other.name);
	}
	
}

// 값 비교의 처리 순서
// java -> hashCode() -> equals()
// 중간의 hashCode() 메서드에서 처리결과의 true, false를 판별해도
// 값의 결과와 관계없이 equals() 메서드를 호출하여 수행하기 때문에
// 단축키를 이용하여 자동 생성시 같이 생성되는 hashCode() 메서드는
// 오버라이드할 필요가 없다.





















