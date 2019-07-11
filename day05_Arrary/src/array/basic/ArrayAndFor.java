package array.basic;
/*
 * 10칸짜리 int배열 numbers를 선언, 생성(0초기화) 한 후
 * 각 원소에 값을 0번 인덱스부터 9번 인덱스까지
 *  10, 20, 30 ... 100 까지 저장한다.
 *  
 * 배열에 저장된 원소의 합을 int summary; 변수에 누적하여
 * 출력하시오.
 */

public class ArrayAndFor {

	public static void main(String[] args) {
		// 선언
		int[] numbers;
		int summery = 0;

		// 초기화 (10으로 기본 초기화)
		numbers = new int[10];

		// 값 저장 배열의 인덱스는 0부터 -1까지이므로 length의 길이보다 작을때
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = (idx + 1) * 10;
			summery += numbers[idx];
		}
		// 합산 출력
		System.out.printf("원소의 합 : %d%n", summery);
		System.out.println("================================");

		// 새 값 저장
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = (idx + 1) * 100;
		}
		// foreach 구문으로 출력
		for (int idx : numbers) {
			System.out.println("idx = " + idx);
		}
	}
}
