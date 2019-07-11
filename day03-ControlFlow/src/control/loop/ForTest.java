package control.loop;

/*
 * 1. 50~ 0까지 짝수만 역순으로 출력
 *    (1) continue 없이
 *    (2) continue 사용
 *    
 * 2. 제곱표 출력
 */// scan은 기본형이 아니므로 new를 붙여 초기화시킨다 
 
public class ForTest {

	public static void main(String[] args) {
		// 선언
		int num;
		
		// 사용
		for (num = 50; num >= 0; num--) {
			if(num %2 != 0) {
				;
			} else {
				System.out.printf("짝수 %d%n", num);
			} 
		}
		System.out.println("=========================");
		
		for (num = 50; num >= 0; num--) {
			if(num %2 == 1) {
				continue;
			} else {
				System.out.printf("짝수 %d%n", num);
			}
		}
		System.out.println("==========================");
		
		// 제곱표 출력
		for (num = 1; num <= 10; num++) {
				System.out.printf("%d x %d = %d%n", num, num, num*num);
		}
		System.out.println("==========================");
		// 제곱표 출력(배열, foreach 사용)
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		for (int nums : numbers) {
			System.out.printf("%d x %d = %d%n", nums, nums, nums*nums);
		}
			
	}
}
