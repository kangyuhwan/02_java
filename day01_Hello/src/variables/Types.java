package variables;
/**
 * 문서 주석
 * 클래스나 메소드의 설명을 하기 위해 사용하는 주석
 * 클래스 바로 위쪽 혹은 메소드 바로 
 * 
 *
 * **/

public class Types {

	public static void main(String[] args) {
		// 1. 변수의 선언
		//    타입이름 변수이름;
		// (1) char : 문자 1글자를 저장하는 타입
		char c; //네모 칸만 생김
		// (2) int : 꽤 큰 정수를 저장하는 타입
		int size;
		
		// (3) String : 1글자이상의 문자열을 저장하는 타입
		String name;
		
		// 2. 초기화 구문
		c = 'A'; //Tab 키로 커서위치를 이동시킴
		size = 95;
		name = "김수한무거북이와두루미";
		// ctrl + / = 지정 주석/토글
				
		// 3. 사용 : 출력
		// 연산자 와 연산자 사이에 공백이 들어간다
		System.out.println("c=" + c); //변수 초기화가 안 됨
		System.out.println("size=" + size);
		System.out.println("name=" + name);

	}
}


