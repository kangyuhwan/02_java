package array.basic;
/*
 * 참조형 타입인 String 타입의 배열 emps를
 * 초기화 목록을 사용하여 초기화하고
 * 내용을 출력해보는 테스트 클래스
 */

public class StringArrayInitList {

	public static void main(String[] args) {
		// 선언 초기화
		String[] students = { "정하은", "최현정", "김지후", "정현수" };
		// 출력
		// foreach 사용
		for (String name : students) {
			System.out.println("학생 이름 = " + name);
		}
		System.out.println("=============================");

		// for (idx 사용) //<=을 사용하려면 students.length -1를 쓴다
		for (int idx = 0; idx < students.length; idx++) {
			System.out.printf("students[%d] = %s%n", idx, students[idx]);
		}
	}
}

