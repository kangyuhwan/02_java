package control.swtchstmt;

import java.util.Scanner;

public class ReportGrade {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 선언
		int score;
		char grade;
		Scanner scan;
		
		// 초기화
		scan = new Scanner(System.in);
		
		//프롬프트
		System.out.printf("0에서 100사이의 정수를 입력 : ");
		// 입력값 저장
		score = scan.nextInt();
		System.out.println();
		switch (score/10)
		{
		case 9 :
			grade = 'A';
			System.out.printf("%d점은%s학점", score,grade);
			break;
		case 8 :
			grade = 'B';
			System.out.printf("%d점은%s학점", score,grade);
			break;
		case 7 : case 6 :
			grade = 'C';
			System.out.printf("%d점은%s학점", score,grade);
			break;
		case 5 : case 4 :
			grade = 'D';
			System.out.printf("%d점은%s학점", score,grade);
			break;
		default :
			grade = 'F';
			System.out.printf("%d점은%s학점", score,grade);
			break;
		}

	}

}
