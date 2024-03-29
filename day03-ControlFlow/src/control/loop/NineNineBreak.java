package control.loop;
/*
 * 구구단을 중첩 for loop를 사용해서 출력
 * 곱셈의 결과가 50을 넘으면 중단하도록
 * break 구문과 for 를 조합하여 테스트
 * \
 * break = 가장 가까운 반복문을 빠져나가는 역할
 * 		   또는 switch 구문을 빠져나가는 역할
 * 
 */

public class NineNineBreak {

	public static void main(String[] args) {
		// int stage;
		int times;
		int stage;
		
		for (stage = 2; stage <= 10; stage++) {
			//단의 제목 출력
			System.out.printf("%n%d 단 %n", stage);
			// 내부 for loop : 1 ~ 9 까지 곱해지는 수를 반복수행
			for (times = 1; times <= 10; times++) {
				if (stage * times >50) {
					break; //break는 가장 가까운 loop를 빠져 나간다.
				}
				System.out.printf("%d x %d = %2d%n", stage, times, stage * times);
			}
		}
		System.out.println("==================");
		System.out.println("레이블과 함께 쓰는 break");
	    OUT: for (stage = 2; stage <= 10; stage++) {
			//단의 제목 출력
			System.out.printf("%n%d 단 %n", stage);
			// 내부 for loop : 1 ~ 9 까지 곱해지는 수를 반복수행
		IN:	for (times = 1; times <= 10; times++) {
				if (stage * times >50) {
					break OUT; //break는 가장 가까운 loop를 빠져 나간다.
				}
				System.out.printf("%d x %d = %2d%n", stage, times, stage * times);
			}
		}
	}
}