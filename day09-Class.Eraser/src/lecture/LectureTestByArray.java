package lecture;
/**
 * 2개의 지우개와 4개의 마커를
 * 배열을 사용하여 사용/관리 하는 테스트 클래스
 * ----------------------------------
 * 1. 마커(Marker) 배열 marker를 선언
 *    지우개(Eraser) 배열 eraser를 선언
 *    
 * 2. marker는 길이 4로 생성
 *    eraser 는 길이 2로 생성
 *    
 *    markers[0] <== 에는 순서대로
 *    ~
 *    markers[3] red, green, blue, black 마커를 저장
 *    
 *    erasers[0], [1]에는 순서대로
 *    			leftEraser, rightEraser를 저장
 *    
 * 3. foreach 를 사용하여
 * 	(1)모든 마커를 한 번씩 사용(use())
 * 	(2)모든 지우개를 한 번씩 사용(erase())
 * 	(3)모든 지우개를 한 번씩 한 겹 벗겨내기(peel())
 *  (4)모든 지우개의 상태 출력
 *  (5)모든 마커의 상태 출력
 * @author Administrator
 *
 */

public class LectureTestByArray {

	public static void main(String[] args) {
		// 선언
		Eraser[] erasers;
		Marker[] markers;
		
		Eraser leftEraser;
		Eraser rightEraser;
		
		Marker red;
		Marker blue;
		Marker green;
		Marker black;
		// 초기화
		markers = new Marker[4];
		erasers = new Eraser[2];
	    erasers[0] = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "왼쪽");
		erasers[1] = new Eraser(3.5, 12.0, 5.5, 3, "검정색", "오른쪽");
		
		markers[0] = new Marker(true, true, "빨강");
		markers[1] = new Marker(false, false, "파랑");
		markers[2] = new Marker(true, false, "초록");
		markers[3] = new Marker(true, false, "검정");
		
		leftEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "왼쪽");
		rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "검정색", "오른쪽");
		
		red = new Marker(true, true, "빨강");
		blue = new Marker(false, false, "파란");
		green = new Marker(true, false, "초록");
		black = new Marker(true, false, "검정");
		// 사용
		// 1)모든 마커를 한 번씩 사용(use())
		for (Marker marker : markers) {
			marker.use();
		}	
		// (2)모든 지우개를 한 번씩 사용(erase())
		for (Eraser eraser : erasers) {
			eraser.erase();
		}
		// 모든 지우개를 한 번씩 한 겹 벗겨내기(peel())
		for (Eraser eraser : erasers) {
			eraser.peel();
		}
		// 모든 지우개의 상태 출력
		for (Eraser eraser : erasers) {
			eraser.print();
		}
		// 모든 마커의 상태 출력
		for (Marker marker : markers) {
			marker.print();
		}
	}
}
