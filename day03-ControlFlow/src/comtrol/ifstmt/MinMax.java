package comtrol.ifstmt;

import java.util.Scanner;

public class MinMax {
/*
 * 두 정수를 입력받아 
 * 둘 중 큰 값, 작은 값을 가려내는 클래스
 * 
 */
	public static void main(String[] args) {
		// 1. 선언
		// 입력받을 변수 선언
		int x,y;
		
		int min,max;
		
		Scanner scan;
		// 스캐너 초기화
		scan = new Scanner(System.in);
		System.out.printf("두 정수 입력%n");
		
		// x, y 두 변수에 정수 입력
		x = scan.nextInt();
		y = scan.nextInt();
		
		if ( x < y ) {
			min = x;
			max = y;
		}
			else {
				min = y;
				max = y;
			}
		
		System.out.printf("입력된 두 정수 %d, %d%n", x,y);
		System.out.printf("두 정수 중에 작은 값 %d%n", x, min);
		System.out.printf("두 정수 중에 큰 값 %d%n", y, max);
	}

}
