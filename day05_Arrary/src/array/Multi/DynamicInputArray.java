package array.Multi;

import java.util.Scanner;

/* 
 * 정수를 저장하는 동적 2차 배열을 numbers 생성
 * 
 * numbers의 사이즈 : 4
 *  numbers[0] = 5
 *  numbers[1] = 5
 *  numbers[2] = 5
 *  numbers[3] = 5
 *  
 *  각각의 사이즈를 Scanner로 입력받아서 생성
 *  
 *  생성된 배열 안에는 10,20,30,40 ~ ,170까지의 숫자를 저장하도록 한다.
 *  출력을 해보기
 */
public class DynamicInputArray {

	public static void main(String[] args) {
		// 선언
		int[][] numbers2d;
		int input;
		int value = 0;
		Scanner scan;

		// 초기화
		scan = new Scanner(System.in);

		// 2차 배열 입력하여 생상
		System.out.println("2차 배열의 크기를 입력(4):");
		input = scan.nextInt();

		numbers2d = new int[input][];

		for (int idx = 0; idx < numbers2d.length; idx++) {
			System.out.printf("인덱스[%d] 1차 배열 크기 입력 : %n", idx);
			// 스캐너로 입력된 값으로 1차 배열을 생성
			input = scan.nextInt();
			numbers2d[idx] = new int[input];

			// 생성된 1차 배열에 값을 저장
			for (int ind = 0; ind < numbers2d[idx].length; ind++) {
				numbers2d[idx][ind] = (value += 10);
			}
		} // for idx 사용해서 출력, foreach를 사용하면 결과 값만 나오게 됨.
		for (int idx = 0; idx < numbers2d.length; idx++) {
			for (int ind = 0; ind < numbers2d[idx].length; ind++) {
				System.out.printf("[%d][%d]=[%d]%n", idx, ind, numbers2d[idx][ind]);
			}
		}

	}
}
