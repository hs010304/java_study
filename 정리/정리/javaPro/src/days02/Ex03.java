package days02;

/**
 * @author yhs
 * @date 2024. 12. 24. - 오전 10:42:35
 * @subject 지역변수
 * @content 지역변수
 */
public class Ex03 {

	{
		int age = 20;
	}

	public static void main(String[] agrs) {

		String name;

		name = "홍길동";
		
		{
			char grade = 'A';
			name = "이순신";
		}
		
		name = "김김김";
		// 1. 정의 : 메서드, 생성자 또는 블록 내에서 선언된 변수
	}
}


