package divider;

/**
 * 
 * @author Administrator
 *
 */

public class Divider {
	// 2. 생성자 선언
	// 기본 생성자 명시
	public Divider() {

	}

	// 3. 메소드 선언
	public int divide(int x) throws DivideZeroException {
		
		switch (x) {
		case 0 : case 1:
			throw new DivideZeroException();
			
		default:
			break;
		}
		
		int result = 100 / (x * (x - 1));
		return result;
	}
	

}
