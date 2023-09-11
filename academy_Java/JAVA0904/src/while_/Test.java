package while_;

public class Test {

	public static void main(String[] args) {
		// while문을 사용하여 구구단 2단 출력
		int dan = 2;
		System.out.println(" < " + dan + "단 >");
		int i = 1;
		while(i < 10) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i++;
		}
		
		System.out.println("-------------------------------");
		
		// while문을 사용하여 정수 1 ~ 10까지의 합(total) 을 계산 후 출력
		int total = 0;
		int num = 1;
		while(num <= 10) {
			total += num;
			System.out.println("i = " + num + ", tatal = " + total);
			num++;
		}
		System.out.println("1 ~ 10까지의 합 = " + total);
		
	}

}
