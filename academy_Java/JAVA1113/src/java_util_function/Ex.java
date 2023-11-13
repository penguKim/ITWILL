package java_util_function;

import java.util.function.Consumer;

public class Ex {

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
		 * 1. Consumer 계열(소비자)
		 * - 파라미터를 받아서 소비한다.
		 * - 리턴하지 않음
		 */
	
		// 익명의 내부클래스 방식
		Consumer<String> consumer = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		consumer.accept("Hello");
		
		System.out.println("------------------------------------------------");
		
		// 람다식 형태
//		Consumer<String> consumer2 = (String x) -> { System.out.println(x); };
		Consumer<String> consumer2 = x -> System.out.println(x);
		consumer2.accept("Hello2");
		
		System.out.println("------------------------------------------------");
		
		Student s1 = new Student("홍길동", 80);
		
		// 람다식은 심플하게 표현될 때 주로 사용하므로
		// 보통 한줄로 표기 가능할 때 사용됨
		
		// 한줄씩 표현
//		printStudent(s1, s -> System.out.println(s.name));
//		printStudent(s1, s -> System.out.println(s.score *= 1.5));
//		printStudent(s1, s -> System.out.println(s.name + " : " + s.score));
		
		// 여러줄 표현
		printStudent(s1, s -> {
			System.out.println(s.name);
			s.score *= 1.5;
			System.out.println(s.name + " : " + s.score);
		});
	}

	// 학생을 출력하려고 하는데 방식은 아직 미정
	// 출력방식을 전달 반음(Consumer<Student> printer)
	public static void printStudent(Student s, Consumer<Student> printer) {
		printer.accept(s);
	}
	
}

class Student {
	String name;
	double score;
	
	public Student(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}
	
}



