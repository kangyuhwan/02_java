package control.loop;

import java.util.Scanner;

public class TotalNaverage {

	public static void main(String[] args) {
		// 선언 초기화
		int total = 0;
		int score = 0;
		int count = 0;
		double average = 0;
		
		Scanner scan = new Scanner(System.in);
		//prompt
		System.out.println("점수를 입력하세요(끝내려면 0을 입력하세요) : ");
		score = scan.nextInt();
		
		while(score != 0) {
			total += score;
			score = scan.nextInt(); //입력값 저장
			count++;
		}
		
		if (count == 0)	{
			System.out.println("입력된 값이 없습니다.");
		} else {
			average = (double)total/count;
			System.out.printf("총점 : %d%n", total);
			System.out.printf("평균 : %5.2f%n", average);
		}
		

	}

}
