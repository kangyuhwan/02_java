package control.loop;

public class ContinueTest {

	public static void main(String[] args) {
		// 선언, 초기화
		
		
		/*// 3. 사용
		for ( idx = 1; idx<= 100; idx++) {
			if (idx % 2 == 0) {
				continue;
			}
			sum += idx;
		}
		System.out.printf("1~100 사이 홀수의 합 : %d%n", sum);
		
		if (idx <= 100) {
			;
		} else {
			sum += idx;
		}*/
		
		// continue : 현재 이하 무시(실행 x), 다음 반복 실행
		int idx;
		int sum = 0;
		for (idx = 1; idx <= 100; idx++) {
			if (idx %3 != 0 ) {
				continue;
				
			}
			sum += idx;
		}
		System.out.printf("3의 배수의 합 : %d", sum);
		
	}

}
