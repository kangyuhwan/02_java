package comtrol.ifstmt;

import java.util.Scanner;

public class MaxOfThree {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 선언
		int num1;
		int num2;
		int num3;
		int max;
		Scanner scan;

		// 초기화
		scan = new Scanner(System.in);

		// 입력 메세지
		System.out.printf("세 정수를 입력 : ");
		// 입력값 저장
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (num1 > num2) 
		{
			if (num1 > num3)
			{
				max = num1;
			}
			else 
			{
				max = num3;
			}
		}
			else 
			{
				if (num2 > num3)
				{
					max = num2;
				}
				else
				{
					max = num3;
				}
		}
		System.out.printf("입력된 세 값 : %d, %d, %d 중 가장 큰  값은 %d 이다", + num1, num2, num3, max);

	}

}
