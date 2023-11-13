package lambda;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 함수형 인터페이스(functional interface) 또는 타겟타입(target type)
		 * - 람다식은 결과적으로 "인터페이스의 클래스를 손쉽게 구현하는 방법"
		 * - 반드시 하나의 abstract 메서드만 존재
		 * - 만약 abstract 메서드가 없거나 두 개 이상 존재한다면 람다식으로 대체할 수 없다!
		 * - 함수형 인터페이스 @FunctionalInterface 어노테이션 선언
		 * 
		 */
		
		useFIMethodA(new MyFunc1() {
			@Override
			public void methodA() {
				System.out.println("익명 내부 클래스 형태!");
			}
		});
		
		System.out.println("-------------------------------------------");
		
		// 1. 파라미터와 리턴타입이 없는 람다식
		System.out.println("(파라미터 : X, 리턴타입 : X)");
		// 정적 메서드 useFIMethodA의 파라미터가 MyFunc1 의 인터페이스 타입이므로
		// 람다식으로 만들어지는 익명 객체가 파라미터로 사용됨
		
		// 표현방식1
		useFIMethodA( () -> {
			System.out.println("람다식1");
		});
		
		// 표현방식2
		useFIMethodA( () -> System.out.println("람다식2") );
		
		System.out.println("-------------------------------------------");

		// 2. 파라미터가 있는 람다식
		System.out.println("(파라미터 : O)");
		
		// 표현방식1
		useFIMethodB( (String msg) -> {
			System.out.println("람다식1 : " + msg);
		});
		
		// 표현방식2
		useFIMethodB( msg -> System.out.println("람다식2 : " + msg) );
		
		System.out.println("-------------------------------------------");
		
		// 3. 리턴 타입이 있는 람다식
		System.out.println("(리턴타입 : O)");
		
		// 표현방식1
		String result = useFIMethodC( msg -> {return "람다식1 : " + msg;} );
		System.out.println(result);
		
		// 표현방식2
		System.out.println(useFIMethodC(msg -> "람다식2 : " + msg));
		
	} // main() 메서드 끝
	
	// 1. 파라미터와 리턴타입이 없는 람다식
	public static void useFIMethodA(MyFunc1 fi)   {
		fi.methodA();
	}
	
	// 2. 파라미터가 있는 람다식
	public static void useFIMethodB(MyFunc2 fi)   {
		fi.methodB("홍길동");
	}
	
	// 3. 리턴타입이 있는 람다식
	public static String useFIMethodC(MyFunc3 fi) {
		return fi.methodC("이순신");
	}
}

// 함수형 인터페이스를 사용하는 람다식 유형
// 1. 파라미터와 리턴타입이 없는 람다식
@FunctionalInterface
interface MyFunc1 {
	// 함수형 인터페이스 어노테이션(@FunctionalInterface) 선언 시 에러 발생!
	// => 함수형 인터페이스는 반드시 하나의 추상메서드(abstract method)를 가져야 함
	public void methodA();
}

// 2. 파라미터가 있는 람다식
@FunctionalInterface
interface MyFunc2 {
	public void methodB(String msg);
}

// 3. 리턴타입이 있는 람다식
@FunctionalInterface
interface MyFunc3 {
	public String methodC(String msg);
}
