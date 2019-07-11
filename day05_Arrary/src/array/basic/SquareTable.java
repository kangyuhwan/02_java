package array.basic;
/*
 * 
 */

public class SquareTable {

	public static void main(String[] args) {
		// 1 ~ 10 까지 정수를 원소로 가지는 배열 numbers를 선언하고
		
		// 1. for (index 사용하는 전통적인 for) 구문을 사용하여
		// 1 ~10까지 정수를 저장한다.
		//
		// 2. foreach 구문을 사용하여
		//    1에서 저장된 값의 제곱표를 출력한다.
		// 선언과 
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		//int sum;
		
		// for
		for (int idx = 1; idx <= 11; idx++) {
			numbers[idx]++;
			System.out.printf("1 ~ 10 까지 출력 %d%n", idx);
		}
		
	}

}
