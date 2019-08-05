package divider;
/**
 * 0으로 나누려는 시도가 있을 때
 * 발생시킬 예외를 정의하는 클래스
 * -------------------------
 * 모든 예의 클래스는 일반 클래스와 동일하게 정의 가능
 * --------------------------
 * 예외 클래스를 정의할 때 주의점
 * 1. 멤버 변수, 생성자, 메소드 정의는 동일
 * @author Administrator
 *
 */
public class DivideZeroException extends Exception {
	// 1. 멤버 변수 선언
	/**
	 * 예외의 이유를 저장하는 변수
	 */
	private String reason;
	// 2. 생성자 선언
	// (1) 기본 생성자 : 발생이유(reason)을 직접 할당.
	public DivideZeroException() {
		this.reason = "0으로 나누려는 시도가 없습니다."
	}
	//(2) 매개변수 생서자 : 발생 이유를 외부에서 전달받음
	public DivideZeroException(String reason) {
		this.reason = reason;
	}
	// 3. 메소드 선언
	@Override
	public String toString() {
		return this.reason;
	}

}
