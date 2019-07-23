package school;
/**
 * 학교 시스템에서 교직원의 정보를 저장하는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * ----------------------------------------
 * dept : String : 소속부서 이름
 * ----------------------------------------
 * 
 * dept : d
 * @author Administrator
 *
 */
public class Employee extends Person {
	// 1. 멤버변수 선언
	/**
	 * 직원의 소속부서 이름 */
	
	 private String dept;
	 
	 // 2. 생성자 선언부
	 // (1) 기본 생성자
	 /**
	  * 기본 생성자
	  */
	 public Employee() {
		 
	 }
	 /**
	  * Employee 만의 필드 dept를 초기화하는 생성자
	  * @param dept : String : 소속 부서명
	  */
	 public Employee(String dept) {
		 this.dept = dept;
	 }
	 
	 
	public Employee(String id, String name, int age, String dept) {
		super(id, name, age);
		this.dept = dept;
	}
	
	// 3. 메소드 선언부
	public String toString() {
		String empStr = String.format(", 부서 : %s", dept);
		return String.format("직원정보[직급 : %s%s]", super.toString(), empStr);
	}
}
