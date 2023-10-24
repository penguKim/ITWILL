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
		 *   2) 뒷자리 첫번째 숫자(문자데이터)가 2 또는 4 : "여성" 출력
		 *   3) 뒷자리 첫번째 숫자(문자데이터)가 5 또는 6 : "외국인" 출력
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
		
		/*
		 * 2. subString() 메서드 활용
		 * 문자열에 포함된 내용(주소) 중에서 실제 주소 부분만 추출하여 출력
		 * - 입력 형식 : "Address : 주소..."
		 *   ex) "Adress : 부산광역시 부산진구 동천로 109 삼한골든게이트"
		 * - 출력 형식 : "Adress : " 부분을 제외하고 나머지 주소만 추출하여 출력
		 */
		
		String address = "Address : 부산광역시 부산진구 동천로 109 삼한골든게이트";
		System.out.println(address.substring(10));
		
		/*
		 * 3. split() 메서드 활용
		 * 문자열에 포함된 정보를 특정 기준 문자열(구분자)을 기준으로 분리하여
		 * 항목별로 출력
		 */
		
		String address2 = "Address:부산광역시 부산진구 동천로 109, Floor:7층, Tel:051-803-0909";
		
		// 1. 콤마(,)를 기준으로 각 항목 분리
		// => 분리된 문자열은 String[] 배열로 저장
		String[] strArr = address2.split(",");
		for(String str : strArr) {
			System.out.println(str);
		}
		System.out.println("----------------------------------");
		
		// 2. 1번의 결과에서 콜론(:)을 기준으로 항목명과 항목 내용을 분리하여
		//    내용 부분(주소, 층, 전화번호)만 출력
		// 부산광역시 부산진구 동천로 109 7층 051-803-0909
		for(int i = 0; i < strArr.length; i++) {
			String[] strArr2 = strArr[i].split(":");
			System.out.print(strArr2[1] + " ");
			
		}
		System.out.println();
//		 분리된 결과를 별도의 배열에 저장하지 않고
//		 1번 인덱스 데이터를 바로 출력 가능
//		 => 1회성으로 접근 후 제거해도 무관할 경우 사용
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i].split(":")[1] + " ");
			// => 분리된 결과의 1번 인덱스 문자열을 출력
		}
	}

}











