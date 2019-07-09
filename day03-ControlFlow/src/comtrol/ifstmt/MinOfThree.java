package comtrol.ifstmt;

import java.util.Scanner;

/*
 * 세 정수를 입력받아서
 * 그 중 가장 작은 정수를 판별하는 클래스이다.
 * ------------------------------------
 * 가장 작은 정수를 판별할 때
 * 중첩 if else 구문을 사용
 */

public class MinOfThree {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 선언
		int num1;
		int num2;
		int num3;
		int min;
		Scanner scan;

		// 초기화
		scan = new Scanner(System.in);
		// 입력 안내 메세지
		System.out.println("세 정수를 입력하세요.");

		// 입력 값 저장
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		// 입력 값의 대소비교
		if ( num1 < num2 ) { // 1이 작을 때
			if ( num1 < num3 ) { // 여기 들어오고 또1이 작을 때
				min = num1; // 그때 최솟값은 num1이고 min은 num1이 된다.
			} else {
				min = num3;
			}
		} else {
			if ( num2 < num3 ) {
				min = num2;
			} else {
				min = num3;
			}
		} //end else
		
		// 출력
		System.out.printf("입력된 세 값 : %d, %d, %d 중 가장 작은 값은 %d 이다" + num1, num2, num3, min);
	}

}
