package java_util_function;

import java.util.function.DoubleBinaryOperator;
import java.util.function.UnaryOperator;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 자바에서 제공하는 함수형 인터페이스
		 * java.util.function 패키지
		 * 
		 * 					파라미터		리턴
		 * Consumer  계열		O			X
		 * Supplier  계열		X			O
		 * Function  계열		O			O
		 * Operator  계열		O			O
		 * Predicate 계열		O			boolean
		 * 
		 * 4. Operator 계열
		 * - Function 계열과 유사하게 파라미터와 리턴을 갖는다.
		 * - 차이점은 Operation 계열은 매개변수 타입이 곧 리턴타입이 된다.
		 * - 매개변수를 전달받아 "어떠한 연산" 후 같은 타입을 리턴할 때 사용
		 */
		
		// <Type T> 인자를 하나 받고 동일한 제네릭 타입의 객체를
		// 리턴하는 함수형 인터페이스
		
		// 람다식을 이용한 코드
		UnaryOperator<Double> op1 = x -> Math.pow(x, 2);
		
		// 익명 구현 객체를 이용한 코드
		UnaryOperator<Double> op2 = new UnaryOperator<Double>() {
			@Override
			public Double apply(Double t) {
				return Math.pow(t, 2);
			}
		};
		System.out.println(op1.apply(10.0));
		System.out.println(op2.apply(10.0));
		
		// Double 타입의 파라미터를 입력받아 Double 타입을 리턴
		
		// 익명 구현 객체를 이용한 코드
		DoubleBinaryOperator op3 = new DoubleBinaryOperator() {
			@Override
			public double applyAsDouble(double left, double right) {
				return Math.pow(left, right);
			}
		};
		
		// 람다식을 이용한 코드
		DoubleBinaryOperator op4 = (x, y) -> Math.pow(x, y);
		
		System.out.println(op3.applyAsDouble(10, 3));
		System.out.println(op4.applyAsDouble(10, 3));
		
	}

}
