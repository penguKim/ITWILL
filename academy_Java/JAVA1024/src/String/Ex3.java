package String;

public class Ex3 {

	public static void main(String[] args) {
		
		/*
		 * StringBuffer 와 StringBuilder
		 * - String 클래스는 한 번 생성되면 그 내부의 문자열이 변경되지 않음.
		 * - String 클래스를 사용하여 문자열을 계속 연결하거나 변경하는 프로그램을
		 *   사용하면 메모리 낭비가 심함
		 * - 이 때, StringBuffer 또는 StringBuilder 를 활용하여 문자열을 변경하거나 연결
		 * - 두 클래스는 크게 차이가 없으며
		 *   스레드가 동작하는 멀티스레드 프로그램이라면 문자열의 안전한 변경을 보장하는
		 *   StringBuffer 클래스를 사용하고,
		 *   스레드가 동작하지 않는 프로그램이면 실행 속도가 좀 더 빠른
		 *   StringBuilder 클래스를 사용  
		 * 
		 */
		
		String str= new String("Java");
		
		// Object 클래스의 toString() 메서드는 클래스명@해시코드를 리턴하지만
		// String 클래스의 오버라이딩된 toString() 메서드는 문자열을 리턴한다.
		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
		// => 인스턴스가 처음 생성될 때 메모리 주소 : 1023487453
		System.out.println(str); // Java
		// => System.out.println(str.toString());
		
		str = str + " and";
		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
		// => str 문자열 주소 : 1651191114 (새롭게 생성된 문자열)
		System.out.println(str); // Java and
		// => "Java and" 의 문자열을 갖는 메모리 영역이 새로 생성되었음을 알 수 있음
		// => 기존의 "Java" 문자열을 갖는 메모리 영역은 참조하는 변수가 없을 경우
		//    자바에서 제공하는 가비지 컬렉터에 의해서 자동으로 사라짐
		
		str = str + "JSP";
		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
		// => str 문자열 주소 : 1586600255 (새롭게 생성된 문자열)
				
		str = str + " Programming is fun!";
		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
		// => str 문자열 주소 : 474675244
		System.out.println(str);
	
		System.out.println("-----------------------------------------");
		
		String str2 = new String("Java");
		
		StringBuilder buffer = new StringBuilder(str2);
		// => String 으로부터 StringBuilder 생성
		
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		// => 연산 전 buffer 메모리 주소 : 932583850
		
		buffer.append(" and");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		// => 연산 후 buffer 메모리 주소 : 932583850
		
		buffer.append(" JSP");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		// => 연산 후 buffer 메모리 주소 : 932583850
		
		buffer.append(" Programming is fun!");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		// => 연산 후 buffer 메모리 주소 : 932583850
		
		// 문자열이 새로 생성되는것이 아니라 기존의 메모리 영역만 사용한다.
		
		// 오버라이딩한 toString() 를 통해 String 클래스 변환
		// 지금까지 buffer 에 쌓인 문자열을 String 으로 리턴한다.
		str2 = buffer.toString();
		System.out.println(str2);
		System.out.println("새로 만들어진 str2 문자열 주소 : " + System.identityHashCode(str2));
		
		
		
	}

}
