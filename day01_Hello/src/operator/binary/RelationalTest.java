package operator.binary;
/**
 * 관계연산의결과는 boolean 타입으로 얻어짐
 * @author Administrator
 *
 */

public class RelationalTest {

	public static void main(String[] args) {
		// 선언 초기화
		int a = 1;
		int b = -5;
		
		// 비교 연산자 사용
		System.out.println("등가 비교 연산자");
		System.out.println("==============");
		System.out.printf("(%d == %d) : %b%n", a, b, (a==b));
		System.out.printf("(%d != %d) : %b%n", a, b, (a!=b));
		
		ystem.out.println("대소 비교 연산자");
		ystem.out.println("==============");
		ystem.out.printf("(%d > %d) : %b%n", a, b, (a>b));
		ystem.out.printf("(%d < %d) : %b%n", a, b, (a<b));
		System.out.printf("(%d >= %d) : %b%n", a, b, (a>=b));
		System.out.printf("(%d <= %d) : %b%n", a, b, (a<=b));
		
		// 이클립스 IDE의 단축키\
		// alt + shift + a 세로줄 편집 기능 토글
		// ctrl + d : 커서가 있는 행 전체 삭제
		// alt + up/down
		// ctrl + shift + l : 단축키 모음 안내창 오픈
	}

}
