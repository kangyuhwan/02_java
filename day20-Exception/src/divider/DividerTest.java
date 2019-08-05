package divider;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *
 */

public class DividerTest {

	public static void main(String[] args) {
		// 1. 선언
		Scanner scan;
		int input;
		Divider div;

		// 2. 초기화

		div = new Divider();
		scan = new Scanner(System.in);

		// 입력 지시하는 출력
		System.out.println("정수를 입력하세요");
		input = scan.nextInt();

		// 3. 사용
		int result;
		try {
			result = div.divide(input);
			System.out.printf("나눗셈 성공:%d%n", result);
		} catch (DivideZeroException e) {
			System.err.printf("나눗셈 실패:%s%n", e);
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료=");
		/*
		 * input : 2 나눗셈 성공:50 =프로그램 종료= ============== input : 0 프로그램 종료 메시지가 출력되지 않음
		 * ==> 예외가 처리되지 못 하고 프로그램 중단됨을 알 수 있음
		 */
	}

}
