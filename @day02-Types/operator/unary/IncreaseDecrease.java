package operator.unary;

/**
 * 단항연산자를 테스트해보는 클래스
 * +, - : 부호변경 연사나
 * 		  변수의 왼쪽에 붙어서
 *        해당 변수에 있는 숫자 값의 부호를 변경
 *        ------------------
 * ++, -- : 증감 연산자
 * 			변수의 왼쪽 오른쪽에 붙여서
 * @author Administrator
 *
 */

public class IncreaseDecrease {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int ten = 10;
		int count = 0;
		// 3. - 연산자로 부호를 변경
		System.out.println("ten =" + ten);
		ten = -ten;
		
		System.out.println("ten = " + ten);
		ten = -ten;
		
		System.out.println("ten =" + ten);
		ten = +ten;
	}

}
