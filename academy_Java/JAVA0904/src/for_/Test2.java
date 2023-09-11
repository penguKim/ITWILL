package for_;

public class Test2 {

	public static void main(String[] args) {
		// 정수 1 ~ 100까지의 합을 누적변수 total에 누적 후 출력
				
		// 누적변수 선언 및 초기화
		int total = 0;
		// for문
		for(int i = 0; i <= 100; i++) {
			total += i;
		}
		// 누적변수 출력
		System.out.println("1 ~ 100 까지의 합 : " + total);
		
		System.out.println("------------------------------");
		
		// 1 ~ 10까지 1씩 증가하면서, 정수 중 짝수의 합만 계산
		// hint) for문 내에서 짝수인지 판별해서 짝수면 누적
		
		// 누적 변수 선언 및 초기화
		total = 0;
		// for문
		for(int i = 1; i <=10; i++) {
			if(i % 2 == 0) {
				total += i;
				System.out.println("i : " + i + ", total : " + total);
			} else {
				System.out.println(i + " : 홀수이므로 누적 X");
			}
		}
		System.out.println("1 ~ 10 까지에서 짝수의 값 : " + total);
		
		System.out.println("------------------------------");
		
		// 1 ~ 10까지 정수 중 홀수의 합 계산 후 출력
		total = 0;
		for(int i = 1; i <=10; i++) {
			if(i % 2 == 1) {
				total += i;
				System.out.println("i : " + i + ", total : " + total);
			} else {
				System.out.println(i + " : 짝수이므로 누적 X");
			}
		}
		System.out.println("1 ~ 10 까지에서 홀수의 값 : " + total);
	}

}
