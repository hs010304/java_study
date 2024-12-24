package days02;

/**
 * @author yhs
 * @date 2024. 12. 24. - 오전 10:42:35
 * @subject 
 * @content 임시저장소
 */
public class Ex03_04 {

	public static void main(String[] args) {

		int x = 10, y = 20;
		System.out.printf("x=%d, y=%d\n", x, y);

//		x, y 저장소 값 변경
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.printf("x=%d, y=%d\n", x, y);
	}
}

