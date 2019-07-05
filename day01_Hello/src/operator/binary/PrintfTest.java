package operator.binary;

import java.util.Scanner;

/**
 * 포맷팅 출력을 지원하는 printf() 메소드
 * 
 * @author Administrator %d : decimal : 십진수 출력 %b : boolean : true, false 의
 *         boolean 값 출력 %s : String : 문자열 출력 %c : char : 문자 1개 출력 %x :
 *         hexadecimal : 16 진수
 */

public class PrintfTest {

	public static void main(String[] args) {
		// 1. 선언
		int input1;
		int input2;
		
		// 키보드 입력을 편리학 해 주는 스캐너 변수를 선언
		// 스캐너 사용을 위해서 import 필요
		// ctrl + shift + 영문 o 
		// import ==> 사용에 대한 선언
		Scanner scan;
		//scan 초기화
		scan = new Scanner(System.in); 
		
		//입력 안내 문구 출력
		System.out.println("정수 두개 를 입력 :");
		
		//scan 사용
		input1 = scan.nextInt();
		input2 = scan.nextInt();
		
		// 2. 초기화
	
		// 3. printf로 출력
		System.out.printf("%d + %d =  %d%n",input1, input2, (input1 + input2));
		System.out.printf("%d - %d =  %d%n",input1, input2, (input1 - input2));
		System.out.printf("%d * %d =  %d%n",input1, input2, (input1 * input2));
		System.out.printf("%d / %d =  %d%n",input1, input2, (input1 / input2));
		System.out.printf("%d %% %d =  %d%n",input1, input2, (input1 % input2));
	}

}
