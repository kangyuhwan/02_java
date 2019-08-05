package api.collection.generic;

import java.awt.List;

/**
 * 컬렉션에 저장할 타입에 제한을 주는
 * Generic 이 적용된 List 를 테스트
 * @author Administrator
 *
 */
public class GenericListTest {

	public static void main(String[] args) {
		// 1. 선언 : Integer 만 저장할 수 있는 List 선언
		List<Integer> numbers;
		// 			Book만 저장할 수 있는 List 선언
		List<Book> books;
		
		// 2. 초기화 : Integer 만 저장할 수 있는 ArrayList로 생성
		numbers = new ArrayList<>();
		books = new ArrayList<>();
		
		// 3. 사용
		// (1) Integer 만 저장하는 리스트에 add(E
		numbers.add(1); // index:0, value:1
		numbers.add(3); // index:1, value:3
		//
		numbers.add(1, 2); // index:1, index:2, index
		// (2) Book만 저장하는 리스트에 add(E)
		books.add(new Book)
	}

}
