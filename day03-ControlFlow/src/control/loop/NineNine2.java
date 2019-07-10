package control.loop;

public class NineNine2 {

	public static void main(String[] args) {
		//3단씩 가로로 작성 => 2단씩 나열 후 1 단을 추가하는 형식
		int stage;
		int times;
		
		for (stage = 2; stage <= 9; stage +=3) {
			System.out.printf("%n%d단\t\t%d단\t\t", stage, stage + 1);
			if (stage < 8) {
				System.out.printf("%d단", stage +2);
			} //가로로 세 단 출력?
			
		}
		
		
		}
	}

