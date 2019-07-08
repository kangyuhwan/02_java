package comtrol.ifstmt;
/*
 * 입력된 정수에 대해서 2의 배수인지 판별하는 클래스
 * Scanner를 사용하여 입력된 정수를 input 변수에 저장하고
 * 입력된 값이 2의 배수인지 판단하는 조건을 작성
 * 2의 배수 판결 결과는 String result에 저장하시오
 * 
 * 
 * 2의 배수일 때 : "입력값 4 = 2의 배수 입니다"
 * 2의 배수가 아닐 때 : "입력값 5는 2의 배수가 아닙니다"
 * ------------------------------------------------
 * 
 * 나머지는 int mod;에 저장하여 사용하시오.
 * 2의 배수일 때 : "입력값 4 = 2의 배수 입니다"
 * 2의 배수가 아닐 때 : 
 * 					"입력값 5는 2의 배수가 아닙니다"
 * 					"나머지가 1입니다."
 * ------------------------------------------------
 * 
 */

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// 선언
		int input;
		int mod;
		String result;
		Scanner scan;
		
		// 초기화

		scan = new Scanner(System.in);
		
		//. 입력을 알리는 메세지
		System.out.println("2의 배수인지 판별하는 정수");
		input = scan.nextInt();
		
		//. 사용
		if ( input%2==0 )
		{
			result = "2의 배수입니다.";
		}
		else
		{
			result = "2의 배수가 아닙니다.";
		}
		System.out.printf("입력값 %d(은)는 %s", input, result);	
	}
}


		if ( input%2==0 )
		{
			result = "2의 배수입니다.";
		}
		else
		{
			result = "2의 배수가 아닙니다.";
		}
		System.out.printf("입력값 %d(은)는 %s", input, result);	
	}		
}

