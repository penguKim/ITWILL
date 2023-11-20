package thread;

import javax.swing.JOptionPane;

public class Ex2_2 {

	public static void main(String[] args) {
		// 싱글쓰레드로 동작하는 프로그램의 경우 하나의 실행이 완료되어야
		// 다음 동작으로 넘어간다.
		// 아래는 입력창에 값을 넣어야만 출력문과 for문이 실행됨.
		
//		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
//		System.out.println("입력하신 값은 " + input + "입니다!");
		
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000); // 파라미터는 밀리초 단위
//			} catch(InterruptedException e) {
//				
//			}
//		}
		
		// =====================================================================
		// 멀티쓰레드로 위의 내용을 구현하면 입력창에 값을 넣지 않아도
		// 별도의 for문이 동작하게 된다.
		
		MultiThread mt = new MultiThread();
		mt.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다!");
		
		// run() 메서드안의 for문이 실행되는동안 입력창이 같이 실행이 되며
		// for문 반복 도중 입력값을 넣을시 동시에 처리된다.
	}

}

class MultiThread extends Thread {
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
				// 예외 발생 - Unhandled exception type InterruptedException
				// 예외 처리가 필요하다.
			} catch(InterruptedException e) {
				
			}
		}
	}
}