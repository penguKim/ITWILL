package static_member;

public class Test4_2 {

	public static void main(String[] args) {
		/*
		 * 카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해줍니다.
		 * 카드가 생성될 때마다 카드 번호가 자동으로 증가할 수 있도록 
		 * 카드 클래스를 만들고 생성해보세요.
		 * 
		 * 1. CardCompany 클래스 생성
		 *    - cardSerialNum(카드 고유번호)
		 *    - createCard() 메서드 생성 : 파라미터, 리턴값 있음
		 * 2. Card 클래스 생성
		 *    - CardNum(카드 번호)
		 *    - CardName(카드 이름)
		 * 
		 * Card 클래스를 생성하고 CardNum 을 출력하면 1씩 증가하는 값을
		 * 출력할 수 있음.
		 */
		
		CardCompany cardCompany = CardCompany.getInstance();
					
		Card card = new Card();
		card.cardName = cardCompany.createCard("현대 Zero 카드");
		
		Card card2 = new Card();
		card2.cardName = cardCompany.createCard("현대 M 카드");
		
		System.out.println("카드 고유 번호 : " + card.cardNum);
		System.out.println("카드 이름 : " + card.cardName);
		
		System.out.println("카드 고유 번호 : " + card2.cardNum);
		System.out.println("카드 이름 : " + card2.cardName);
		
	}

}

class CardCompany {
	static int cardSerialNum = 10000;
	
	public String createCard(String cardName) {
		return cardName;
	}
	
	// ===================== 싱글톤 디자인 패턴 적용 ====================
	// 1. 자신의 인스턴스를 생성하여 자신의 클래스 타입 변수 instance 에 저장
	//    => private static 선언
	private static CardCompany instance = new CardCompany();
	
	// 2. 기본 생성자 정의 => private
	private CardCompany() {}
	
	// 3. Getter 정의 => public static 선언
	public static CardCompany getInstance() {
		return instance;
	}
	
}

class Card {
	int cardNum = 0;
	String cardName = null;
	
	public Card() {
		CardCompany.cardSerialNum += 1;
		cardNum = CardCompany.cardSerialNum;
	}
}














