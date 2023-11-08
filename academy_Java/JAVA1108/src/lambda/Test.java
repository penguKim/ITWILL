package lambda;

public class Test {

	public static void main(String[] args) {
		/*
		 * 문자열을 입력받아 두 문자열을 연결하여 출력하는 프로그램 정의
		 * 람다식을 사용하여 구현
		 * ex) Hello 와 World 를 매개변수값으로 전달하면
		 *     "Hello,World" 가 출력
		 */
		
		StringInterface si = (x, y) -> x + "," + y;
		
		System.out.println(si.add("Hello", "World"));
		
		
	}

}
@FunctionalInterface
interface StringInterface {
	String add(String str1, String str2);
}