package constructor;

public class Test {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.showAccountInfo();
		
		Account acc2 = new Account();
		
		acc2.showAccountInfo();
		
	}

}

/*
 * Account 클래스 정의
 * - acoountNo, ownerName, balance
 * - showAccountInfo() 메서드
 * - 인스턴스 생성 시
 * 	 "Account() 생성자 호출됨!" 출력
 *   accountNo = "111-1111-111", ownerName = "홍길동", balance = 10000 
 *   초기값 설정
 */
class Account {
	// 멤버변수
	String accountNO;
	String ownerName;
	int balance;
	
	public Account() {
		System.out.println("Account() 생성자 호출됨!");
		// 인스턴스 생성 시 기본값으로 가져야할 데이터를 멤버변수 저장
		accountNO = "111-1111-111";
		ownerName = "홍길동";
		balance = 10000;
	}
	
	// 메서드 정의
	// 계좌 정보를 출력하는 showAccountInfo() 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNO);
		System.out.println("예금주 : " + ownerName);
		System.out.println("현재 잔고 : " + balance + "원");
	}
	
}
