package type.casting;
/**
 * 숫자형데이터사이에
 * 형 변환을
 * 테스트하는 클래스이다
 * @author Administrator
 *
 */
public class TypeCastiongTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		double pi = 3.1415926535797;
		int number =100;
		int result;
		
		// 형 변환
		result = number + (int) pi; //잠깐 int로 형 변환
		 // 4. 사용 
		System.out.println("double pi = " + pi);
		System.out.println("int number = " + number);
		System.out.println("result = " + result);
		

	}

}
