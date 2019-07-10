package control.loop;

/*
 * while 문 이용하여 1 ~100 사이 홀수 합 구하기
 * 1씩 증가시켰을 때 어떻게 해야 홀수 값의 합만 구할 수 있을지.
 */
public class SumOfOdds {

	public static void main(String[] args) {
		// 선언 초기화
		int num = 1;
		int sum = 0;

		//

		while (num <= 100) {
			if (num % 2 == 1) {
				sum += num; //누적 더하기
			}
			num++;
		}
		System.out.printf("1부터 100사이 홀수의 합은 %d입니다.", sum);

	}

}
