package array;

public class test2 {

	public static void main(String[] args) {
		/*
		 * 배열의 최대값을 구하는 코드
		 * numbers = {3, 2, 14, 21, 100, 4, 2, 1}
		 * int max; int min; int sum; int avg;
		 * 
		 * 출력 결과
		 * 
		 * 최대값 : 100
		 * 최소값 : 1
		 * 합  계 :
		 * 평  균 :  
		 * 
		 */
		
		int[] numbers = {3, 2, 14, 21, 100, 4, 2, 1};
		int max = numbers[0];
		int min = numbers[0];
		int sum = 0;
		double avg = 0.0;
//		for(int i = 0; i < numbers.length; i++) {
//			if(max < numbers[i]) {
//				max = numbers[i];
//			}
//		}
//		System.out.println("최대값 : " + max);
//		
//		for(int i = 0; i < numbers.length; i++) {
//			if(min >numbers[i]) {
//				min = numbers[i];
//			}
//		}
//		System.out.println("최소값 : " + min);
//		
//		for(int i = 0; i < numbers.length; i++) {
//			sum += numbers[i];
//		}
//		System.out.println("합  계 : " + sum);
//		
//		avg = sum / numbers.length;
//		System.out.println("평  균 : " + avg);
		
		
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		
			if(min > numbers[i]) {
				min = numbers[i];
			}
			sum += numbers[i];
		}
		avg = (double)sum / numbers.length;
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합  계 : " + sum);
		System.out.println("평  균 : " + avg);
		
	}

}
