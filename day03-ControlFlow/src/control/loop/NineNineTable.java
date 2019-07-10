package control.loop;

public class NineNineTable {

	public static void main(String[] args) {
		// 조건문
		int stage;
		int times;
		
		for (stage = 2; stage <= 9; stage++) {
			//단의 제목 출력
			System.out.printf("%n%d 단 %n", stage);
			// 내부 for loop : 1 ~ 9 까지 곱해지는 수를 반복수행
			for (times = 1; times <= 9; times++) {
				System.out.printf("%d x %d = %2d%n", stage, times, stage * times);
			}
		}

	}

}
