package constructor_overloading;

public class Test {

	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		System.out.printf("%d/%d/%d \n", d1.year, d1.month, d1.day);
		
		System.out.println("-----------------------------------");
		
		MyDate d2 = new MyDate(2023);
		System.out.printf("%d/%d/%d \n", d2.year, d2.month, d2.day);
		
		System.out.println("-----------------------------------");
		
		MyDate d3 = new MyDate(2023, 9);
		System.out.printf("%d/%d/%d \n", d3.year, d3.month, d3.day);
		
		System.out.println("-----------------------------------");
		
		MyDate d4 = new MyDate(2023, 9, 14);
		System.out.printf("%d/%d/%d \n", d4.year, d4.month, d4.day);
		
		System.out.println("-----------------------------------");
		

	}

}

/*
 * 날짜를 관리하는 MyDate 클래스 정의
 * - 멤버변수 : 연도(year, 정수), 월(month, 정수), 일(day, 정수)
 * - 생성자
 *   1) 기본 생성자 : 1999년 1월 1일로 초기화
 *   2) 파라미터 생성자
 *      2-1. 연도(year)를 전달받아 초기화하고, 1월 1일로 초기화
 *      2-2. 연도(year), 월(month)을 전달받아 초기화하고 1일로 초기화
 *      2-3. 연도(year), 월(month), 일(day)을 전달받아 초기화
 * 
 *   생성자 자동 단축키 : Alt + Shift + S -> O
 */

class MyDate {
	int year;
	int month;
	int day;
	
	// 1) 기본 생성자 : 1999년 1월 1일로 초기화
	public MyDate() {
		System.out.println("MyDate() 생성자 호출됨!");
		year = 1999;
		month = 1;
		day = 1;
	}
	
	// 2-1) 연도(year)를 전달받아 초기화하고, 1월 1일로 초기화
	public MyDate(int newYear) {
		System.out.println("MyDate(int) 생성자 호출됨!");
		year = newYear;
		month = 1;
		day = 1;
	}
	
	// 2-2) 연도(year), 월(month) 을 전달받아 초기화하고, 1일로 초기화
	public MyDate(int newYear, int newMonth) {
		System.out.println("MyDate(int, int) 생성자 호출됨!");
		year = newYear;
		month = newMonth;
		day = 1;
	}

	// 2-3) 연도(year), 월(month), 일(day)를 전달받아 초기화
	// 자동 생성 단축키 : Alt + Shift + S -> O	
	public MyDate(int year, int month, int day) {
		System.out.println("MyDate(int, int,int) 생성자 호출됨!");
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
}







