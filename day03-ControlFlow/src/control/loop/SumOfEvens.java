package control.loop;

public class SumOfEvens {

	public static void main(String[] args) {
		// 선언 초기화
		int num = 0;
		int sum = 0;

		while (num <= 100) {	
			if (num % 2 == 0) {
				sum += num;
			}
			num ++;
		}
		System.out.printf("1부터 100사이까지의 짝수의 합은 %d입니다.", sum);
	}
}
