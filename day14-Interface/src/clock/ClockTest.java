package clock;
/**
 * Clock인터페이스,
 * SmartWatch, GarminActive3, GalaxyGear4 클래스를 테스트
 * @author Administrator
 *
 */
public class ClockTest {

	public static void main(String[] args) {
		// 1. 선언, 2.초기화
		//(1) SmartWatch 추상클래스(상위클래스) 타입의 배열선언
		SmartWatch[] = watches = new SmartWatch[2];
		//(2) 각 인덱스 위치에 GarminActive3, GalaxyGear4 인스턴스에 저장
		watches[0] = new GarminActive3();
		watches[0].setWatchName("가민 액티브3");
		
		watches[1] = new GalaxyGear4();
		watches[1].setWatchName("갤럭시 기어4");
		
		
		// 3.사용
		for (SmartWatch watch : watches) {
			watch.displayTime();
		}
		
		///////////////////////////////////
		//4. 인터페이스 타입의 변수선언
		
		Clock myWatch;
		myWatch = new 
	}

}
