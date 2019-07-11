package arraybasic;

/*
 * 자바 1.5버전부터 지원되는
 * 향산된 for 반복문의 기능
 * --------------------
 * 데이터구조와 함께 사용한다.
 * 
 * 테이터 구조 : 1. 배열
 * 				2. 리스트
 * 				3.셋
 * 				4. 
 */
public class ForEachTest {

	public static void main(String[] args) {
		// 배열의 선언(과 동시에 값을 넣으면서 초기화)
		int[] numbers = { 1, 2, 3, 4, 5 }; // 중괄호 안에 값을 넣으면 초기화 lentgh = 5
		int sum = 0;
		// foreach 구문으로 배열 값 출력
		// for(원소의 타입 변수 이름 : 자료구조(==배열) {
		// 문장들;
		// }
		for (int num : numbers) {
			sum += num;

			System.out.println("num = " + num); // 1부터 5까지 출력
		}
		System.out.println("sum = " + sum);
	}

}
