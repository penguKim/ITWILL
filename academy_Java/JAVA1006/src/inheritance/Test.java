package inheritance;

public class Test {

	public static void main(String[] args) {
		ItwillBank ib = new ItwillBank();
		
		// Accoumt 클래스로부터 상속받은 기본 멤버 접근
		ib.accountNo = "111-1111-111";
		ib.ownerName = "홍길동";
		ib.balance = 10000;
		ib.showAccountInfo();
		
		ib.deposit(50000);
		int money = ib.withdraw(40000);
		System.out.println("출금된 금액 : " + money + "원");
		System.out.println("------------------------------------------");
		
		// ItwillBank 의 고유 기능(추가된 기능)
		ib.contract("자동차");
	}

}

/*
 * Account 클래스를 상속받는 ItwillBank 클래스 정의
 * - Account의 기본 기능(계좌의 기본 기능)은 그대로 유지
 *   => 계좌번호(accountNo), 예금주명(ownerName), 현재잔고(balance) 멤버변수
 *   => 입금하기(deposit), 출금하기(withdraw), 정보보기(showAccountInfo) 메서드
 * - 멤버변수 추가 : 보험명(insureName, 문자열)
 * - 메서드 추가 : 보험계약(contract())
 *   => 파라미터 : 보험명
 *   => 리턴값 : 없음
 *   => 전달받은 보혐명을 멤버변수에 저장 후 "XXX 보험 계약 완료!" 출력
 */

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public void deposit(int amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("입금금액 : " + amount + "원");
			showAccountInfo();
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}
	public int withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금 후 현재잔고 : " + balance + "원");
		} else {
			System.out.println("잔고가 부족하여 출금이 불가능합니다!");
			System.out.println("출금할 금액 : " + amount + "원, 현재잔고 : " + balance + "원");
			amount = 0;
		}
		return amount;
	}
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
}

class ItwillBank extends Account {
	String insureName;

	public void contract(String insureName) {
		this.insureName = insureName;
		System.out.println(insureName + " 보험 계약 완료!");
	}
}