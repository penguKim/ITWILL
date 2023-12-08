package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

	public static void main(String[] args) {
		
		/*
		 * Pattern 클래스와 Matcher 클래스를 활용하여
		 * 입력된 패스워드에 대한 규칙(복잡도) 검사
		 * 
		 * 규칙1. 패스워드 길이 : 영문자, 숫자, 특수문자(!@#$%) 조합 8 ~ 16자리
		 * 규칙2. 영문자(대,소문자), 숫자, 특수문자(!@#$%) 중 2가지 이상 조합
		 * 		  => 4가지 모두 조합 시 : 안전
		 * 		     3가지 조합 시 : 보통
		 * 			 2가지 조합 시 : 미흡
		 * 			 1가지 사용 : 사용 불가능한 패스워드
		 */
		
		// 영문자(대문자 또는 소문자) 판별 정규표현식
		String engregex = "[A-Za-z]";
		// 영문 대문자와 소문자를 별도로 구분하여 판별하는 정규표현식
		String engUpperRegex = "[A-Z]"; // 대문자
		String engLowerRegex = "[a-z]"; // 소문자
		
		// 숫자를 판별하는 정규표현식
		String numRegex = "[0-9]";
		
		// 특수문자(!@#$%)를 판별하는 정규표현식
		String specRegex = "[!@#$%]";

		// 패스워드 길이를 판별하는 정규표현식
		// => 영문자(대문자, 소문자), 숫자, 특수문자(!@#$%) 조합 8 ~ 16자리로 시작하고 끝
		String lengthRegex = "^[A-Za-z0-9!@#$%]{8,16}$";
		
		String[] passwords = {"Abcde123!", "abcde123@", 
							"abcde123", "12345678", "abcde한글!"};
		
		// Pattern.matches() 메서드를 호출하여 패스워드 길이 규칙에 일치하는지 여부 출력
		for(String password : passwords) {
//		for(int i = 0; i < 5; i++) {
//			System.out.print("패스워드 입력 : ");
//			Scanner s = new Scanner(System.in);
//			String password = s.nextLine();
			if(Pattern.matches(lengthRegex, password)) {
				// 패스워드 길이 체크를 통과했을 경우
				System.out.println(password + " : 길이 규칙 적합!");
				
				// 각 패턴(영문 대문자, 소문자, 숫자, 특수문자)이 포함되는지를 각각 검사
				// => 검사 결과를 포인트화하여 패스워드 등급 계산하지 위해 변수 필요
				int count = 0;
				// 검사할 정규표현식으로 Pattern 객체 생성 및 Pattern 객체로 Matcher 객체 생성
//				Pattern pattern = Pattern.compile(engUpperRegex); // 대문자 검사 정규표현식
//				Matcher matcher = pattern.matcher(password);
				// Matcher 객체의 find() 메서드로 해당 정규표현식이 포함되는지를 검사하여
				// 포함될 경우 포인트(count) 1 증가시킴
//				if(matcher.find()) {
//					count++;
//				}
				
				// Pattern 객체 생성과 Matcher 객체 생성 및 find() 메서드 호출을 하나로 결함
				// => 주의! 각 정규표현식 판별 문장을 else if로 처리하면 안된다!
				//    각각의 점수를 합산해야 하므로 모든 조건을 따로 판별해야 한다.
//				if(Pattern.compile(engUpperRegex).matcher(password).find()) {
//					count++;
//				}
//				
//				if(Pattern.compile(engLowerRegex).matcher(password).find()) {
//					count++;
//				}
//				
//				if(Pattern.compile(numRegex).matcher(password).find()) {
//					count++;
//				}
//				
//				if(Pattern.compile(specRegex).matcher(password).find()) {
//					count++;
//				}
				
				// 삼항연산자를 사용하여 표현하는 방법
				// => 판별 결과가 true이면 1 더하고 아니면 0 더하기
				count += Pattern.compile(engUpperRegex).matcher(password).find() ? 1 : 0;
				count += Pattern.compile(engLowerRegex).matcher(password).find() ? 1 : 0;
				count += Pattern.compile(numRegex).matcher(password).find() ? 1 : 0;
				count += Pattern.compile(specRegex).matcher(password).find() ? 1 : 0;
				
				
				// 점수를 판별하여 패스워드 복잡도 검사 결과 출력
				switch(count) {
					case 4 : System.out.println(password + " : 안전!"); break; 
					case 3 : System.out.println(password + " : 보통!"); break; 
					case 2 : System.out.println(password + " : 미흡!"); break; 
					default : System.out.println(password + " : 사용 불가능한 패스워드!");
				}
				
			} else {
				// 패스워드 길이 체크를 통과하지 못했을 경우
				System.out.println(password + " : 영문자, 숫자, 특수문자 조합 8 ~ 16자 필수!");
			}
		}
		
	}

}
