package comtrol.ifstmt;

import java.util.Scanner;

public class PositiveNegative2 {
	/*
	 * 하나의 정수를 입력받아서
	 * 음수인지, 양수인지 판단하는 클래스
	 * 단, 여기서는 0에 대한 판단은 하지 않는다.
	 */

	public static void main(String[] args) {
		// 선언
		int input;
		String result;
		Scanner scan;
		// 초기화
		scan = new Scanner(System.in); //키보드 입력을 받는다
		
		System.out.println("입력할 정수");
		input = scan.nextInt();
		
		// 사용
		if (input > 0)
		{
			result = "양수";
		}
		else if (input < 0)
		{
			result = "음수";
		}
		else 
		{
			result = 0;
		}
		System.out.printf("입력값 %d 은(는) %s 입니다.%n", input, result);
	}

}
