package days02;

/**
 * @author yhs
 * @date 2024. 12. 24. - 오전 10:19:40
 * @subject
 * @content
 */

public class Ex06_08 {

	public static void main(String[] agrs) {
		// '0' - 48
		// 'A' - 65
		// 'a' - 97
		System.out.println('0' - 5);
		
		// 대소문자 변환(+- 32)
		char a = 'A';
		System.out.printf("%c\n", a+32);
		
		char c = '\u0041';
		System.out.printf("%c\n", c);
	}
}