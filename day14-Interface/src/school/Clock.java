package school;
/**
 * 시간을 알려주는 시계의 기능ㅇ
 * 정의하는 인터페이스
 * --------------------------------
 * 상수 : final 변수 ==> 값을 변경할 수 없는 것
 * 추상메소드 : 메소드 헤드만 선언되는 형태
 * 두 가지만 적용됨
 * ------------------------
 * 메소드 : displayTime() : void
 * 
 * 
 * @author Administrator
 *
 */

public interface Clock {
	
	/**
	 * abstract 키워드가 붙어서
	 * 시간을 어떻게 보여줄지는 관심 없고
	 * 오로지 displayTime이라는 이름의 메소드만 호출하면
	 * 이 인터페이스를 구현하는 클래스에서
	 * 재정의해서 완성시킬 목적의
	 * 추상메소드를 정의
	 */
	public abstract void displayTime(); // 추상 메소드
	

}
