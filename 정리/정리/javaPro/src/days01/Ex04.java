package days01;


/**
 * @author yhs
 * @date 2024. 12. 23. - 오후 4:21:20
 * @subject 변수와 상수
 * @content 상수와 리터럴( literal ) 설명
 */
// Alt+Shift+J

public class Ex04 {

	public static void main(String[] args) {

		// 변수 : 변하는 수, 기억공간 변경 가능
		// 상수 : 고정된 수, 기억공간 변경 불가 (고정된 값)

		// [ 변수 선언 형식 ]
		// 자료형 변수명[=초기값];
		String name = "윤형식";

		// 좌측변수 = 우측항의 값;

		// The local variable name may not have been initialized
		System.out.println(name);

		name += "홍길동";
		System.out.println(name);

	} // main

} // class
