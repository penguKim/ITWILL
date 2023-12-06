package io_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Test5 {

	public static void main(String[] args) {
		/*
		 * 키보드로부터 입력받은 내용을 readme2.txt 파일에 출력
		 * - 여러 줄을 입력 가능하도록 반복 입력처리
		 * - 단, ":wq" 문자열이 입력되면 입력을 종료
		 */
		
//		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter pw = new PrintWriter(new FileWriter(new File("C://temp/readme2.txt")));
		
		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter out = new PrintWriter(new FileWriter(new File("C://temp/readme2.txt")));) {
			
			String str = buffer.readLine();
			
			// 입력 문자열이 ":wq" 가 아닐동안 반복
			while(!str.equals(":wq")) {
//			while(str != null) {	// Ctrl + Z 가 종료조건일 경우
				out.println(str);	 	 // 입력데이터 한줄 출력
				str = buffer.readLine(); // 새로운 한줄 읽어오기
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
