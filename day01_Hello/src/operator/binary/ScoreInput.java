package operator.binary;

import java.util.Scanner;

/*
 * &&, || : 논리연산 AND, OR 연산자
 * ----------------------------
 * 반드시 기호를 두 번 겹쳐서 쓸 것
 * 
 * 입력된 점수가 0 ~100 사이의 값인지 판단하는 클래스
 */
public class ScoreInput {

	public static void main(String[] args) {
		// 1. 선언
		// 입력값 저장할 변수 선언
		int score;
		
		//입력처리를 위한스캐너 선언
		Scanner scan;
		// 변수애 스캐너로 값을 입력하여 초기화
		
		// 3. 입력된 값의 범위를 판단
		scan = new Scanner (System.in);
		score = scan.nextInt();
		/*
		 *  WHERE score >= 0
		 *    AND score <= 100
		 */
		
		if (score >= 0 && score <= 100) {
			System.out.printf("%d는 유요한 점수입니다. %n", score);
		}
		else {
			System.out.printf("%d는 벗어난 점수입니다. %n", score);
		}

	}

}
