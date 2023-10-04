package static_member;

public class Test4 {

	public static void main(String[] args) {
		// 생성된 인스턴스 주소를 리턴
		Account acc = Account.getInstance();
		
		// Setter() 메서드를 호출하여 값 입력
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("홍길동");
		acc.setBalance(10000);
		
		// showAccountInfo() 메서드로 계좌 정보를 출력
		acc.showAccountInfo();
		
		System.out.println("----------------------------------------");
		
		Account acc2 = Account.getInstance();
		acc2.showAccountInfo();
		
	}

}

/*
 *  Account 클래스를 싱글톤 디자인 패턴을 적용하여 설계
 *  - 멤버변수 : accountNo, ownerName, balance 모두 private 설정
 *  - 메서드 : showAccountInfo(), 멤버변수에 대한 Getter/Setter 정의
 */

class Account {
	
	// 1. 기본 생성자 정의 => private
	private Account() {}
	
	// 2. 자신의 인스턴스를 생성하여 자신의 클래스 타입 변수 instance 에 저장
	//    => private static 선언
	private static Account instance = new Account();

	// 3. Getter 정의 => public static 선언
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static Account getInstance() {
		return instance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	
}
