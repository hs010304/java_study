package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yhs
 * @date 2024. 12. 24. - 오전 10:19:40
 * @subject
 * @content
 */

public class Ex7_02 {

	public static void main(String[] agrs) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어 점수를 입력하세요 : ");

		Byte score = Byte.parseByte(br.readLine());

		System.out.printf("국어=%d점", score);
	}
}
