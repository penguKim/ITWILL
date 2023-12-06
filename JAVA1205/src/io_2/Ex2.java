package io_2;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
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
		 * - 데코레이션 패턴을 활용하기 위해 BufferedOutputStream 객체 사용 가능
		 *   => 바이트 단위로 출력하는 스트림에 버퍼링 기능을 제공
		 * - BufferedWriter 는 문자 단위로 출력하는 스트림에 버퍼링 기능 제공
		 *   => OutputStreamWriter~~~~~~~~~~~~~~~~~~~~~~
		 */
		
//		try(OutputStreamWriter writer = new OutputStreamWriter(System.out)) {
//			String str = "Hello, 자바!";
//			writer.write(str);
//			
//		} catch(IOException e) {
//			
//		}
		
		// ==============================================================
		// 출력 내용을 파일에 저장
		
		try {
			FileOutputStream fos = new FileOutputStream("C://temp/data.txt");
			fos.write(65); // 파라미터로 숫자를 쓰면 해당 아스키 코드 값으로 변환됨
			fos.write(66);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// => catch 항목을 IOException e 로만 처리 가능
		// IOException 아래에 FileNotFoundException 이 들어있기 때문이다.
		
		System.out.println("출력이 완료되었습니다.");
		
		// ===============================================================
//		try {
//			FileOutputStream fos = new FileOutputStream("C://temp/data.txt");
//			fos.write(67);
//			// => 기존의 AB를 덮어쓰고 새로운 C가 ~~~~~~~~~~~~~~~~~~
//		} catch(FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("출력이 완료되었습니다.");
		
		// 만약, 기존 자료에 이어처 출력하고 싶으면 생성자의 두 번째 매개변수에 
		// true를 입력한다.
		try {
			FileOutputStream fos = new FileOutputStream("C://temp/data.txt", true);
			fos.write(67);
			// => 기존의 AB를 덮어쓰고 새로운 C가 ~~~~~~~~~~~~~~~~~~
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다.");
		
		// ===============================================================
		// 파일에 바이트 배열로 출력하기.
		try {
			FileOutputStream fos = new FileOutputStream("C://temp/data2.txt", true);
			byte[] bArr = new byte[26];
			byte data = 65; // 'A' 의 아스키 값
			for(int i = 0; i < bArr.length; i++) {
				bArr[i] = data;
				data++;
			}
//			fos.write(bArr);
			// => 배열을 한꺼번에 출력
			fos.write(bArr, 2, 10);
			// => 배열의 세 번째 위치부터 10개의 바이트 출력
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다.");
		
		// ===============================================================
		// BufferedOutputStream 활용
		// FileOutputStream
//		FileOutputStream fos = new FileOutputStream("C://temp/data3.txt");
		// BufferedOutputStream의 버퍼 크기를 5로 한다.
//		BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		
		try(BufferedOutputStream bos = 
				new BufferedOutputStream(new FileOutputStream("C://temp/data3.txt"), 5)) {
			// 파일 data3.txt에 1부터 9까지 출력한다.
			// 정수입력이 아니라 ''를 사용하는 char 타입으로 사용한다.
			for(int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다.");
		
		// ===============================================================
		// BufferedWriter 활용
		try(BufferedWriter bw = 
				new BufferedWriter(new FileWriter("C://temp/data4.txt"), 5)) {
			// 파일 data3.txt에 1부터 9까지 출력한다.
			// 정수입력이 아니라 ''를 사용하는 char 타입으로 사용한다.
			for(int i = '1'; i <= '9'; i++) {
				bw.write(i);
				
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다.");
		
		
		
		
	}

}
