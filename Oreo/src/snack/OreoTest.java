package snack;
/**
 * Oreo 쿠키가 3개 들어있는 oreoBox 변수를
 * Oreo 배열타입으로 선언하고
 * 
 * oreoBox[0] ~ [2] Oreo 쿠키를 입력
 * 크림의 종류는 바닐라, 초코, 딸기, 말차 중 하나로 입력할 것
 * 
 * foreach 사용해서
 * oreoBox에서 하나의 쿠키의 상태를 출력
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class OreoTest {

	public static void main(String[] args) {
		//선언
		Oreo[] oreoBox;
	
		
		// 초기화
		oreoBox = new Oreo[2];
		oreoBox[0] = new Oreo("딸기", 4.5, 2.1);
		oreoBox[1] = new Oreo("초코", 4.5, 2.1);
		oreoBox[2] = new Oreo("바닐라", 4.5, 2.1);
		// 사용
		// 모든의 쿠키 상태 출력
		
		
		System.out.println("======================");
		
		int idx;
		// for를 사용하여 모든 쿠키의 크림을 바닐라로 변경
		for (int dox = 0; idx < oreoBox.length; idx++) {
			oreoBox[idx].changeCream("바닐라");
			
		}
		
		// foreach 사용해서 모든 쿠키의 크림 변경 상태 확인을 위한 출력
		for(char letter)
	}

}
