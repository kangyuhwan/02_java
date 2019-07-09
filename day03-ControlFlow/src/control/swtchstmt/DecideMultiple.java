package control.swtchstmt;
/*
 * 입력된 자연수가 3의 배수인지 판별하는 클래스
 * -----------------------------------
 * 배수 판단에 switch 구문을 사용
 */

import java.util.Scanner;

public class DecideMultiple {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 1.선언
		int input;
		Scanner scan;
		
		// 초기화
		scan = new Scanner(System.in);
		
		// 입력 메세지(prompt)
		System.out.printf("정수 입력");
		input = scan.nextInt();
		
		// 3. input 변수의 값이 3의 배수인지 판단
		switch (input % 3) //3으로 나눈다, 조건식이 아닌 수식이 들어간다.
		{
		case 0 : //수식의 결과가 case 0일 때
			System.out.printf("입력 값 : %d 는 3의 배수 입니다.%n",  input);
			break;  //break걸리면case 종료
		case 1 : case 2 :	//case를 한 줄에 입력, case 1,2의 역할이 같을 때
			System.out.printf("입력 값 : %d 는 3의 배수가 아닙니다.%n",  input);
		    break;
		    
		    default :
		    	System.out.println("입력이 잘못되었습니다.");
		} //end switch 
			
		

	}

}
