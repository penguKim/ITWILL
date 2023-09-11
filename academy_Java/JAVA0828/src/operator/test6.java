package operator;

public class test6 {

	public static void main(String[] args) {

		// 나이(age) 변수 선언
		// age가 10세 이상이고 19세 이하를 연산자로 표현
		int age = 70;
		System.out.println((age >= 10) && (age <= 19));

		// age가 5세 미만 이거나 65세 이상을 연산자로 표현
		System.out.println((age < 5) || (age >= 65));
		
	}

}
