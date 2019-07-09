package comtrol.ifstmt;
/*
 * 다중 선택 if 구문 사용하여 다음의 기준으로
 * 학점을 게산하는 클래스
 * ------------------------------------
 * A : 90점 이상
 * B : 80 ~ 89 점
 * C : 60 ~ 79 점
 * D : 40 ~ 59 점
 * 나머지 : F
 */

import java.util.Scanner;

public class Grade {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 선언
		int score;
		char grade; // ' 로 저장
		Scanner scan;
		// printf 는 입력란 바로 옆에 작성
		// println은 입력란 한 줄 아래에 작성
		// ctrl shift f = 줄 맞춤
		// 초기화
		scan = new Scanner(System.in); // 시스템에 입력을 하기 위해 써 줌
		// 입력받을 알림 메시지
		System.out.printf("0~100사이의 정수를 입력 : "); // 이걸 써 주어야 입력받는지 아닌지 확인이 된다.
		score = scan.nextInt(); // score 초기화 부분
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80 && score <= 89) {
			grade = 'B';
		} else if (score >= 60 && score <= 79) {
			grade = 'C';
		} else if (score >= 40 && score <= 59) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf(score + "점에 해당하는 학점은 : " + grade + "입니다.");
	}
}







