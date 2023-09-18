package constructor_overloading;

public class Test_2_answer {

	public static void main(String[] args) {
		
		MyDate3 d1 = new MyDate3(2023, 9, 18);
		System.out.println(d1.isValid());
		
		System.out.println("----------------------------");
		
		MyDate3 d2 = new MyDate3(2200, 9, 18);
		System.out.println(d2.isValid());
		
		System.out.println("----------------------------");
		
		MyDate3 d3 = new MyDate3(2023, 20, 18);
		System.out.println(d3.isValid());
		
		System.out.println("----------------------------");
		
		MyDate3 d4 = new MyDate3(2023, 2, 31);
		System.out.println(d4.isValid());
	}

}

/*
 * 날짜를 관리하는 MyDate2 클래스 정의
 * - 멤버변수 : 연도(year, 정수), 월(month, 정수), 일(day, 정수)
 *   => 접근제한자 private 설정
 *   파라미터 생성자
 *   연도(year), 월(month), 일(day)을 전달받아 초기화
 * - 유효한 년도, 월, 일 파라미터값을 전달할 수 있도록 설정!
 *   생성자 자동 단축키 : Alt + Shift + S -> O
 *   
 *  Hint!)
 *  1. 멤버변수가 private 접근제한자 이므로 Getter/Setter 필요!
 *  2. 파라미터 생성자에 데이터를 전달할 때 멤버변수의 초기화는
 *     Setter() 메서드 활용!
 *  3. Setter() 메서드 내에서 조건식을 사용하여 유효한 년, 월, 일인지 판별
 *  <조건식 판별>
 *  year의 경우 : 1900 ~ 2100 사이의 연도일 경우 year에 초기화
 *  month의 경우 : 1 ~ 12월의 경우에만 month에 초기화
 *  day의 경우 : switch문을 사용하여 
 *               1, 3, 5, 7, 8, 10, 12월의 경우 1 ~ 31일 허용
 *               4, 6, 9, 11의 경우 1 ~ 30일 허용
 *               2월의 경우 1 ~ 29일 허용(윤년 적용)
 * 윤달의 경우 : 4로 나눠지는 해는 윤년이지만 그 중 100으로 나눠지는 해는 윤년이 아님.
 *               그러나 400으로 나눠지는 해는 윤년이다!
 * 4. 입력되는 값의 유효성을 판단하는 isVaild() 메서드 정의
 */
class MyDate3 {
	private int year;
	private int month;
	private int day;
	boolean isValid = true;
	
	public MyDate3(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public int getYear(int year) {
		return this.year = year;
	}
	
	public int getMonth(int month) {
		return this.month = month;
	}
	
	public int getDay(int day) {
		return this.day = day;
	}
	
	public void setYear(int year) {
		if(!(year >= 1900 && year <= 2100)) {
			isValid = false;
		} else {
			this.year = year;
		}
	}
	
	public void setMonth(int month) {
		if(!(month >= 1 && month <= 12)) {
			isValid = false;
		} else {
			this.month = month;
		}
	}
	
	public void setDay(int day) {
		switch (month) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 :
			case 12 : 
				if(!(day >= 1 && day <= 31)) {
					isValid = false;
				} else {
					this.day = day;
				}
				break;
			case 4 : case 6 : case 9 :
			case 11 : 
				if(!(day >= 1 && day <= 30)) {
					isValid = false;
				} else {	
					this.day = day;
				}
				break;
			case 2:
				// 윤년의 경우 : 4로 나눠지는 해는 윤년이지만
				//               그 중 100으로 나눠지는 해는 윤년이 아님
				//               그러나 400으로 나눠지는 해는 윤년이다!
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					if(!(day >= 1 && day <=29)) {
						isValid = false;
					} else {	
						this.day = day;
					}
				} else {
					if(!(day >= 1 && day <=28)) {
						isValid = false;
					} else {
						this.day = day;
					}
				}
				break;
				default : isValid = false;
		}
	}

	public String isValid() {
		if(isValid) { // isVaild == true
			return "유효한 날짜입니다. : " + year + "/" + month + "/" + day;
		} else {
			return "유효하지 않은 날짜입니다. : " + year + "/" + month + "/" + day;
		}
	}
}