package days02;

/**
 * @author yhs
 * @date 2024. 12. 24. - 오전 10:19:40
 * @subject
 * @content
 */

public class Ex06_03 {

	public static void main(String[] agrs) {

		String name = "ds";
		int age = 20;
		System.out.printf("[%s]\n", name);
		System.out.printf("[%10s]\n", name);
		System.out.printf("[%-10s]\n\n", name);

		System.out.printf("[%d]\n", age);
		System.out.printf("[%10d]\n", age);
		System.out.printf("[%-10d]\n", age);
		System.out.printf("[%04d]\n\n", age);
		
		age=10;
		System.out.printf("[%d]\n", age);
		System.out.printf("[%o]\n", age);
		System.out.printf("[%x]\n", age);
		
		//반복
		System.out.println("-".repeat(50));
		
		// 금액을 세자리마다 , 찍어서 출력
		int money = 7635200;
		System.out.printf("%,d\n", money);
		
		
	}
}
