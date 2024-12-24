package days01;

public class Ex06_02 {

	public static void main(String[] args) {

		String name = "윤형식";
		int age = 24;
		char grade = 'A';
		double avg = 78.99;
		
		
		System.out.println("이름은 \"" + name + "\" 이고, 나이는 '"
		+ age + "' 살이고, 학점은 '"+grade+"' 입니다.");
		
		// 자바의 문자열
		/* '\"'
		 * 출력형식을 가지고 출력하는 함수(메서드) : printf() format(형식)
		 * [함수(메서드) 3가지]
		 * 1. 기능
		 * 2. 매개변수
		 * 3. 리턴값
		 * 
		 * String $s char %c int %d double %f
		 * 
		 * %[argument_index$][flags][width][.precision]conversion
		 * 
		 */
		System.out.printf("이름은 \"%s\" 이고, 나이는 '%d' 살이고, 학점은 '%c' 이고, 평균은 %.2f 입니다.", 
				name, age, grade, avg);
	}

}
