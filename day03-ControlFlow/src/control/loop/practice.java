package control.loop;

import java.util.Scanner;

/*
 * 학점 계산하기
 * 
 */
public class practice {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * // 선언 int score; char grade; Scanner scan = new Scanner(System.in);
		 * 
		 * //prompt System.out.println("점수를 입력 : "); score = scan.nextInt();
		 * 
		 * if (score >= 90) { grade = 'A'; } else if(score >= 80) { grade = 'B'; } else
		 * if(score >= 70) { grade = 'C'; } else if(score >= 60) { grade = 'D'; } else {
		 * grade = 'F'; } System.out.printf("%s 등급입니다.", grade);
		 */

		/*
		 * // 선언 int score; char grade; Scanner scan;
		 * 
		 * // 초기화 scan = new Scanner(System.in); // prompt
		 * System.out.println("점수를 입력하세요 : "); score = scan.nextInt();
		 * 
		 * // 사용 switch (score / 10) { case 9 : grade = 'A'; break; case 8 : grade =
		 * 'B'; break; case 7 : case 6 : grade = 'C'; break; case 5 : case 4 : grade =
		 * 'D'; break; default: grade = 'F'; }
		 * System.out.printf("%d 점에 해당하는 학점은 %s입니다.", score, grade);
		 */

		// 홀수 합 구하기

		/*
		 * //선언 int num = 1; int sum = 0;
		 * 
		 * while (100 >= num ) { sum += num; num += 2; } // 출력
		 * System.out.printf("1부터 100까지의 홀수 값을 더하면 : %d", sum);
		 */

		/*
		 * //짝수 값 구하기 // 선언 int num = 1; int sum = 0;
		 * 
		 * while (100 >= num) { sum += num; num += 2; }
		 * System.out.printf("1부터 100까지의 짝수 값을 더하면 : %d", sum);
		 */

		// 총점과 평균 구하기 0이 아닐 때 는 평균값과 합을 구하고 0일 때는 종료구문 작성
		// 선언
		/*
		 * int score = 0; int total = 0; int count = 0; double average; Scanner scan;
		 * 
		 * //초기화 scan = new Scanner(System.in); // prompt
		 * System.out.printf("각 정수를 입력 : "); // 입력 값 저장 score = scan.nextInt();
		 * 
		 * // 사용 while (score != 0) { total += score; score = scan.nextInt(); count++; }
		 * if (count == 0) { System.out.println("입력된 값이 없습니다."); } else { average =
		 * (double)total/count; System.out.printf("총점은 %d%n", total);
		 * System.out.printf("평균은 %.2f%n", average); }
		 */
		// 체질량 지수 구하기
		// 선언
		/*double weight; // kg
		double height; // cm
		double bmi;
		String result;
		Scanner scan;

		// 초기화, 입력 값 저장
		System.out.printf("몸무게 키 입력 : ");
		scan = new Scanner(System.in);
		height = scan.nextDouble();
		weight = scan.nextDouble();
		bmi = (weight / (height * 2) * 100);

		if (bmi > 40.0f) {
			result = "병적인 비만";
		} else if (bmi > 27.5f && bmi <= 40.0f) {
			result = "비만";
		} else if (bmi >= 23.0f && bmi <= 27.5f) {
			result = "과체중";
		} else if (bmi >= 18.5f && bmi < 23.0f) {
			result = "정상";
		} else if (bmi >= 15.0f && bmi < 18.5f) {
			result = "저체중";
		} else {
			result = "병적인 저체중";
		}
		System.out.printf("키 %.2fcm 몸무게 %.2fkg BMI %.2f 당신은 %s입니다.", weight, height, bmi, result);*/
		// 선언
		// 입력값이 0인 경우 : "0은 배수를 판별할 수 없습니다."
		int input;
		String result;
		Scanner scan;
		// 초기화
		System.out.println("정수 값 입력");
		scan = new Scanner(System.in);
		input = scan.nextInt();
		// 사용
		
		if (input == 0){ 
			result = "0은 배수를 판별할 수 없습니다.";
		} else if (input %2 == 0) {
			result = "2의 배수 입니다.";
		} else {
			result = "2의 배수가 아닙니다.";
		}
		System.out.printf("입력값 %d이고 %s", input, result);
	}
}
