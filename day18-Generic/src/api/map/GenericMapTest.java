package api.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 데이터를 key, value 쌍으로 저장하는 구조인 Map 인터페이스에서
 * 
 * key, value 양쪽 모두 generic을 적용하는 테스트
 * 
 * @author Administrator
 *
 */
public class GenericMapTest {

	public static void main(String[] args) {
		// 1. 선언 : key : integer, value : string
		Map<Integer, String> map;

		// 2. 초기화 : HashMap 중 Key : Integer, Value : String
		map = new HashMap<>();

		// 3. 사용
		// (1) 데이터 추가 : put(Integer, String)
		map.put(1, "안녕하세요");
		map.put(new Integer(2), "반가워요~");
		map.put(3, "아..오늘 날씨가...");
		map.put(4, "너무나 더워요..!");
		map.put(5, new Book().getTitle());
		map.put(6, new Book(5).getAuthor());

		// (3) Map 의 데이터 추출 : 전체 데이터 추출
		// foreach로
		// key 꾸러미를 먼저 얻어내야 함
		Set<Integer> keys = map.keySet();

		// 얻어진 key 꾸러미가 Set 이기 때문에
		// 이 key에 foreach를 적용
		for (int key : keys) {
			// System.out.println(map.get(key));
			System.out.printf("key=%d : value =%s%n", key, map.get(key));
		}

	}

}
