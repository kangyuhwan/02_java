package type.primitive;
/**
 * int : 정수형 타입중 가장 기본/대표 타입이다.
 * --------------------------------------
 * int 타입을 테스트하는 클래스이다.
 * @author Administrator
 *
 */

public class IntTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		// 선언할 때 ,를 사용해서 한 줄로 나열할 수 있다.
		// 이 때, 타입 맨 앞에 한번만 선언하면 된다.
		
		int num1 = 5, num2 = 28;
		int num3, num4, num5;
		
		//
		int num6;
		int num7;
		int num8;
		
		// num3, num4, num5 에 대해서
		// num1, num2의 연산 결과로 초기화
		num3 = num1 * num2;
		num4 = num2 / num1;//몫
		num5 = 25 / num1; //몫
		
		// 3. 사용 : 변수 값 출력
		System.out.println("5 * 28 = " + num3);
		System.out.println("28 / 5 = " + num4);
		System.out.println("25 / 5 = " + num5);
		
		

	}

}
