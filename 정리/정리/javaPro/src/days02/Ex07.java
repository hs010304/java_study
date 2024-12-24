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

public class Ex07 {

	public static void main(String[] agrs) throws IOException {
		
		/*
	       *    [키보드]   -> System.in       -> InputStreamReader -> BufferedReader
	       *  이름입력 엔터     Stream                문자 변환           버퍼 기능
	       *                 텍스트(문자)스트림
	       *                 *바이트 스트림         0101->한 문자 
	       * */
		
//		String name = "윤형식";
//		 System.out.println(name);
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.print("이름을 입력하세요 : ");
		 
		 String name = br.readLine();
				 System.out.printf(name);
	}
}
