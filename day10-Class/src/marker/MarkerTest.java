package marker;
/**
 * 화이트 보드 마커를 사용하는 테스트 클래스
 * @author Administrator
 *
 */
public class MarkerTest {

	public static void main(String[] args) {
		// 객체 선언
		Marker red;
		Marker blue;
		Marker green;
		Marker black;
		
		// 초기화
		red = new Marker(true, true, "빨강");
		blue = new Marker(false, false, "파란색");
		green = new Marker(true, false, "초록");
		black = new Marker(true, false, "검정");
		// 사용
		red.print();
		blue.print();
		green.print();
		black.print();
		
		// 파란, 검정 마커 사용
		blue.use();
		black.use();
		
		// 
	}
}
