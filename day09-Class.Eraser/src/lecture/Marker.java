package lecture;

/**
 * 마커를 정의하는 클래스 뚜껑 열림 닫힘 isopeneed isclosed : boolean 마커 잉크 양 가득 참, 비어 있음 full
 * empty : boolean 마커 사용 중 use 마커 색 color : String
 * 
 * @author Administrator
 *
 */
public class Marker {
	// 선언
	/** 마커 뚜껑이 열려 있는지 여부 */
	boolean isOpened;
	/** 새 마커인지 여부 */
	/**
	 * true : 뚜껑이 열려있는 상태 false : 뚜껑이 닫혀있는 상태
	 * 
	 */
	boolean isNew;
	/** 마커 잉크 색상 */
	String color;

	// 생성자
	Marker() {

	}

	Marker(boolean isNew) {
		this();
		this.isNew = isNew;
	}

	Marker(boolean isNew, boolean isOpened) {
		this(isNew);
		this.isOpened = isOpened;
	}

	Marker(boolean isNew, boolean isOpened, String color) {
		this(isNew, isOpened);
		this.color = color;
	}

	// 메소드
	public void print() {
		String message = "마커 색상 : %s, %s, %s%n";
		String openStatus;
		String newStatus;

		if (isOpened) {
			openStatus = "뚜껑이 열려 있습니다.";
		} else {
			openStatus = "뚜껑이 닫혀 있습니다.";
		}

		if (isNew) {
			newStatus = "새 마커입니다.";
		} else {
			newStatus = "다 쓴 마커입니다.";
		}

		System.out.printf(message, openStatus, newStatus, color);
	}

	public void use() {
		System.out.printf("%s색 마커를 사용중입니다.", color);
	}
}
