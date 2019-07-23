package school;
/**
 * 학교 시스템에서 
 * 과목을 가르치는 선생의 정보를 저장하는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * @author Administrator
 *
 */
public class Teacher extends Person {
	// 1. 멤버변수
	private String subject;
	
	// 2. 생성자
	/**
	 * 기본생성자
	 */
	public Teacher() {
		
	}
	
	//(2) 매개변수 받는 생성자
	public Teacher(String subject) {
		this.subject = subject;
	}
	public Teacher(String id, String name, int age, String subject) {
		super(id, name, age);
		this.subject = subject;
	}
	//3 메소드
	// (1) toString() 재정의
	@Override
	public String toString() {
		String tcStr = String.format(", 과목 : %s", subject);
		return String.format("교사정보[직급 : %s%s]", super.toString(), tcStr);
	}
}
