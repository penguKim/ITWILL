package String;

public class Test2 {

	public static void main(String[] args) {
		
		/*
		 * String 클래스 메서드 연습
		 * ----------------------------------------
		 * 1. 주민번호(jumin)을 입력받아 성별(남 또는 여) 및 외국인 판별
		 * - 입력형식 : "XXXXXX-XXXXXXX"
		 * - 판별조건
		 *   1) 뒷자리 첫번째 숫자(문자데이터)가 1 또는 3 : "남성" 출력
		 *   1) 뒷자리 첫번째 숫자(문자데이터)가 2 또는 4 : "여성" 출력
		 *   1) 뒷자리 첫번째 숫자(문자데이터)가 5 또는 6 : "외국인" 출력
		 */
		
//		String jumin = "930123-1234567";
//		String jumin = "930123-2234567";
		String jumin = "930123-5234567";
		
		char genderNum = jumin.charAt(7);

		if(genderNum == '1' || genderNum == '3') {
			System.out.println("남성");
		} else if(genderNum == '2' || genderNum == '4') {
			System.out.println("여성");
		} else if(genderNum == '5'|| genderNum == '6') {
			System.out.println("외국인");
		} else {
			System.out.println(jumin + ": 잘못된 주민번호!");
		}
		
		switch(genderNum) {
			case '1' :
			case '3' : System.out.println("남성"); break;
			case '2' :
			case '4' : System.out.println("여성"); break;
			case '5' :
			case '6' : System.out.println("외국인");break;
			default : System.out.println(jumin + ": 잘못된 주민번호!");
			
		}
		
		
	}

}
