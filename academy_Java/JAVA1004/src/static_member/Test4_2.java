package static_member;

public class Test4_2 {

	public static void main(String[] args) {
		/*
		 * 카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해줍니다.
		 * 카드가 생성될 때마다 카드 번호가 자동으로 증가할 수 있도록 
		 * 카드 클래스를 만들고 생성해보세요.
		 * 
		 * 1. CardCompany 클래스 생성
		 *    - cardSerialNum(카드 고유번호) ex)10000
		 *    - createCard() 메서드 생성 : 파라미터, 리턴값 있음
		 * 2. Card 클래스 생성
		 *    - CardNum(카드 번호)
		 *    - CardName(카드 이름)
		 * 
		 * Card 클래스를 생성하고 CardNum 을 출력하면 1씩 증가하는 값을
		 * 출력할 수 있음. 
		 * ex) new Card(); -> 10001
		 * ex) new Card(); -> 10002
		 */

//		CardCompany cardCompany = new CardCompany();
		CardCompany cardCompany = CardCompany.getInstance();
		
		Card card = new Card();
		card.CardName = cardCompany.createCard("현대 Zero 카드");
		
		Card card2 = new Card();
		card2.CardName = cardCompany.createCard("현대 M 카드");
		
		Card card3 = new Card();
		card3.CardName = cardCompany.createCard("내카드");
		
		System.out.println("카드 고유 번호 : " + card.CardNum);
		System.out.println("카드 이름 : " + card.CardName);
		
		System.out.println("카드 고유 번호 : " + card2.CardNum);
		System.out.println("카드 이름 : " + card2.CardName);
		
		System.out.println("카드 고유 번호 : " + card3.CardNum);
		System.out.println("카드 이름 : " + card3.CardName);
		
	}

}

class CardCompany {
	private static int cardSerialNum = 10000;
	
	private CardCompany() {}
	
	private static CardCompany instance = new CardCompany();

	public static CardCompany getInstance() {
		return instance;
	}
	
	public static int getCardSerialNum() {
		return ++cardSerialNum;
	}


	String createCard(String cardName) {
		return cardName;
	}
	
}

class Card {
	int CardNum = 0;
	String CardName = null;
	
	public Card() {
		CardNum = CardCompany.getCardSerialNum();
	}
	
}







