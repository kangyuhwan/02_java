package school;

/**
 * 시스템에 저장될 학생, 선생, 직원의 정보 중 공통적인 내용을 추출한 상위클래스 일반적인 사람의 정보를 저장한다.
 * ------------------------------------ id : String name : String age : int
 * 
 * @author Administrator
 *
 */
public abstract class Person {
	// 멤버변수 선언
	private String id;
	private String name;
	private int age;

	// 생성자
	// (1) 기본 생성자 : 생성자 선언부를 완전히 생략하면
	// 자동으로 기본생성자 선언이 들어가짐
	// 그러나 기본생성자가 아닌 생성자를
	// 하나라도 선언하면 자동생성되지 않음

	public Person() {

	}

	// (2) 매개변수를 받는 생성자
	// 매개변수를 받는 생성자가 선언이 된 상태에서
	// 기본생성자 선언은 누락하는 경우
	// 기본생성자는 자동으로 만들어지지 않음을 주의

	public Person(String id) {
		this();
		this.id = id;
	}

	public Person(String id, String name) {
		this(id);
		this.name = name;
	}

	public Person(String id, String name, int age) {
		this(id, name);
		this.age = age;
	}
	
	// (3) 메소드 선언부
	/**
	 * toString() 메소드의 의미
	 * ---------------------
	 * 1. print 계열의 메소드에서 객체참조변수를 출력할 때
	 * 	  자동으로 작동하는 메소드
	 * 2. Object 클래스에서 상속받은 메소드
	 * 3. 객체를 대표하는 문자열을 만들어서 리턴
	 *    -> 각 필드를 모두 출력하는 문자열
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("아이디 : %s, 이름 : %s, 나이 : %d", id, name, age); //밑의 출력문에 this에 들어가 출력된다.
	}

	// 출력 메소드
	/** 
	 * 현재의 객체를 출력하는 메소드
	 * this가 toString의 객체참조변수를 출력해 준다.
	 */
	public void print() {
		System.out.println(this); //
	}
}
