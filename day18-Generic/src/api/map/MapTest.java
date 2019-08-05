package api.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 데이터를 Key, Value 를 쌍으로 저장하는 자료구존인 Map 을 테스트하는 클래스
 * 
 * Key : 중복을 허용하지 않음 Value : 중복을 허용
 * 
 * Key, Value 는 반드시 한 쌍으로만 취급할 수 있음. Key 없이 Value 를 만들 수 없음. Key 없이 Value 를 찾을 수
 * 없음.
 * 
 * Key, Value에 모든 타입의 데이터가 저장 가능 ----------------------------------------------
 * 
 * @author Administrator
 *
 */
public class MapTest {

	public static void main(String[] args) {
		// 1. 선언 : Map 인터페이스 타입 변수
		Map map;

		// 2. 초기화 : HashMap 클래스 인스턴스로 초기화
		map = new HashMap();

		// 3. 사용
		// (1) Map에 데이터 추가
		map.put("1", "안녕하세요");
		// key : Integer, value : String
		map.put(new Integer(2), "반가워요~");
		// key : Character, value : String
		map.put('3', "아..오늘 날씨가...");
		// key : Double value : String
		map.put(4.0, "너무나 더워요..!");
		// key : Boolean, value : Book(사용자 정의 타입 가능)
		map.put(true, new Book());
		map.put(false, new Book(5));

		// (2) Map의 데이터 추출 get(K)
		System.out.println(map.get("1"));
		// auto=boxing, equls(), hashCode(), toString()
		System.out.println(map.get(2));
		System.out.println(map.get('3'));
		System.out.println(map.get(4.0));
		System.out.println(map.get(true));
		System.out.println(map.get(false));
		
		// (3) Map 의 데이터 추출 : 전체 데이터 추출
		//	   foreach로
		//     key 꾸러미를 먼저 얻어내야 함
		Set keys = map.keySet();
		
		// 얻어진 key 꾸러미가 Set 이기 때문에
		// 이 key에 foreach를 적용
		for (Object key : keys) {
	//		System.out.println(map.get(key));
			System.out.printf("key=%s : value =%s%n", 
								key.toString(), map.get(key).toString());
		}
	}
}
