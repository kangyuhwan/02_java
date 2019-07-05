package type.primitive;
/**
 * char : 문자 1개를 저장하는 타입
 * 내부적으로는 숫자로 저장하는 특징이 있다.
 * @author Administrator
 *
 */

public class CharTest {

	public static void main(String[] args) {
		// 1. 선언
		char input;
		
		// 2. 초기화
		input = 'a';
		
		// 3. 사용
		System.out.println("input=" + input);
		
		// 4. char 가 내부적으로 숫자로 저장되는 것을 확인하기
		//    정수를 저장하는 변수 code를 선언하면서
		//    문자를 저장하는 변수 input의 값을 복사
		//    int(정수형)으로 'a'를 선언하고 출력하면 97이 나옴(ascii)
		int code = input;
		System.out.println("code=" + code);
		
		// code는 정수를 저장하는 변수이므로
		// +1 하는 산술연산을 하여 값을 증가시킨다
		code = code + 1;
		System.out.println("code=" + code);
		System.out.println("(char)code=" + (char)code); //타입 변환 코드
		
		
		

	}

}
