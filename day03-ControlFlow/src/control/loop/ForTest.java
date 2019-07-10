package control.loop;

/*
 * 1. 50~ 0까지 짝수만 역순으로 출력
 *    (1) continue 없이
 *    (2) continue 사용
 */
public class ForTest {

	public static void main(String[] args) {
		// 선언
		int num;
		
		
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
		
		
		for (num = 1; num <= 10; num++) {
				System.out.printf("%d x %d = %d%n", num, num, num*num);
		}
	}
}
