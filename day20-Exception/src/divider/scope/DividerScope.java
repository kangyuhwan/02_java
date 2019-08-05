package divider.scope;

import divider.Divider;

public class DividerScope {

	public void level3(int input) throwsDivideZeroException() {
		// 1.선언
		Divider div;
		// 2. 초기화
		div = new Divider();
		// 3. 사용
		System.out.println("=== level3가 시작되었습니다.===");
		div.divide(input);
		
		System.out.println("=== levle3가 종료되었습니다.===");
	}

	public void level2 throws

	DivideZeroException() {
		System.out.println("=== level2가 시작되었습니다.===");
		level3(0);
		
		System.out.println("=== levle3가 종료되었습니다.===");
	}

	public void level1 throws

	DivideZeroException() {
		System.out.println("=== level1가 시작되었습니다.===");
		try {
			level2();
		} catch (DivideZeroException e) {
			System.err.println("문제발생!:"+e);
		}
		level3(0);
		System.out.println("=== levle1가 종료되었습니다.===");

}
