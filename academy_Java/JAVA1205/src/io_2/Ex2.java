package io_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 모니터로 데이터를 출력하는 방법
		 * 2. OutputStreamWriter 사용(char 단위로 처리)
		 * - write() 메서드를 호출하여 char[] 배열 또는 String 객체를 전달하여
		 *   문자 데이터 출력 가능
		 *   => String 클래스는 char[] 배열로 관리되므로 writer 계열에서 처리 가능
		 * - FileOutputStream 
		 *   => 파일에 바이트 단위 자료를 출력하기 위해 사용하는 스트림
		 */
		
		try(OutputStreamWriter writer = new OutputStreamWriter(System.out)) {
			String str = "Hello, 자바!";
			writer.write(str);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// =============================================================
		// 출력 내용을 파일에 저장
		
		try {
			FileOutputStream fos = new FileOutputStream("C://temp/data.txt");
			fos.write(65); // 파라미터로 숫자를 쓰면 해당 아스키 코드 값으로 변환됨
			fos.write(66);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}









