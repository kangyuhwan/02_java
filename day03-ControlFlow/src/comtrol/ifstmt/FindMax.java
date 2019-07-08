package comtrol.ifstmt;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// 선언
		int x;
		int y;
		int max = 0;
		Scanner scan;
		
		scan = new Scanner(System.in);
		
		// 스캐너 입력
		System.out.println("두 정수를 분리");
		x = scan.nextInt();
		y = scan.nextInt();
		
		// 사용
		if (x > y) {
			max = x;
			System.out.printf("x=%d, y=%d 중 큰 값은 %d%n", x,y,max);
		}
		if (y > x) {	
			max = y;
			System.out.printf("x=%d, y=%d 중 큰 값은 %d%n", x,y,max);
		}
		if (x == y) {
			max = x;
			System.out.printf("x=%d y=%d 두 정수 값이 동일합니다.", x,max);
		}
		
		
	}

}
