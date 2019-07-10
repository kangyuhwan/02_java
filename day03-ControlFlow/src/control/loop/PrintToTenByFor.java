package control.loop;
/*
 * 1에서부터 10까지 출력하는 클래스
 * 
 * for 구문을 사용해서 출력
 */

public class PrintToTenByFor {

	public static void main(String[] args) {
		// for (선언식; 조건식; 증감식) {
		// 문장들;
		// }
		// 1. 선언식 : 선언의 형태 => 타입 변수이름;
		// 2. 조건식 : 조건의 형태 => 비교연산자(관계비교연산자, 동일비교연산자를 사용한
		// 식, 연산의 결과 true or false로 얻어짐
		// 3. 증감식 : 보통 증감연산자를(++,--) 사용해서
		// 선언식에서 선언된 루프제어 변수 값을 변경
		for (int idx = 1; idx <= 10; idx++) { // idx를 1로 초기화하고 10까지 반복하는데 한 번 반복하면 1씩 증가
			System.out.printf("idx= %2d%n", idx); // 2자리 십진수

			for (int idx2 = 1; idx2 <= 10; idx2++) { // idx를 1로 초기화하고 10까지 반복하는데 한 번 반복하면 1씩 증가
				System.out.printf("idx= %2d%n", idx2); // 2자리 십진수
			}
		}

		System.out.println("==============================");
		System.out.println("10에서 1까지 역순으로 출력");
		for (int idx = 10; idx > 0; idx--) {
			System.out.printf("idx= %2d%n", idx);
		}
		// final 변수는 상수 , 상수를 활용한 for loop
		final int FROM = 1;
		final int TO = 10;

		for (int idx = FROM; idx <= TO; idx++) {
			System.out.printf("idx= %2d%n", idx);
		}
		System.out.printf("===============================");

		for (int idx = TO; idx >= FROM; idx--) {
			System.out.printf("idx= %2d%n", idx);
		}
		System.out.printf("===============================%n");
		// 0~9까지 추가
		for (int idx = FROM; idx <= TO; idx++) {
			System.out.printf("idx= %2d%n", idx + 1);
		}
		for (int idx = FROM - 1; idx <= TO; idx++) {
			System.out.printf("idx= %2d%n", idx - 1);
		}
	}

}
