package api.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Key : Integer Value : Book
 * 
 * foreach로 전체 목록 출력 10% 가격이 다운된 전체 목록 출력
 * 
 * @author Administrator
 *
 */
public class BookMapTest {

	public static void main(String[] args) {
		// 1. 선언
		Map<Integer, Book> map;

		// 2. 초기화
		map = new HashMap<>();

		Book vegetarian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10800, 10);

		Book littlePrince = new Book(2, "9791159039690", "어린왕자(초판본)", "생텍쥐페리", "더스토리", 150, 8820, 5);

		Book noDaap = new Book(3, "9791190182645", "제 인생에 답이 없어요", "선바", "위즈덤하우스", 192, 10800, 3);

		Book dduk = new Book(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어", "백세희", "흔", 208, 12420, 2);

		Book ax = new Book(5, "9788956055466", "책은 도끼다", "박웅현", "북하우스", 348, 14400, 2);

		// 3. 사용	
		map.put(vegetarian.getSequence(), vegetarian);
		map.put(littlePrince.getSequence(), littlePrince);
		map.put(noDaap.getSequence(), noDaap);
		map.put(dduk.getSequence(), dduk);
		map.put(ax.getSequence(), ax);
		// ket 설정
		Set<Integer> keys = map.keySet();
		// 전체 책 목록 출력
		for (int key : keys) {
			// System.out.println(map.get(key));
			System.out.printf("key=%d : value =%s%n", key, map.get(key));
		}
		// 10% 할인 된 책 목록
		System.out.println("==10%할인==");
		for (int key : keys) {
			System.out.printf("key=%d : value =%s%n", key, map.get(key).getPrice() * 0.9);
		}
	}

}
