package days02;

/**
 * @author yhs
 * @date 2024. 12. 24. - 오전 10:19:40
 * @subject
 * @content
 */

public class Ex06_02 {

	public static void main(String[] agrs) {
		
		boolean gender = false;
		// Type mismatch: cannot convert from int to boolean (자료형 불일치)
		
		// java.util.MissingFormatArgumentException (매개변수 할당 부족)
		System.out.printf("성별:%1$b - %1$B\n", gender);
	}
}
