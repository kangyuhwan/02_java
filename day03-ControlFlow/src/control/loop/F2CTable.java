package control.loop;

public class F2CTable {

	public static void main(String[] args) {
		// 선언문 조건문 증감문
		//double c;
		// 상수 선언
		/*final int FROM = 10;
		final int TO = 100;
		final int STEP = 10;
		
		// 온도 변수 선언
		double cel;
		double fah;
		
		
		for(fah = FROM; fah <= TO; fah+=STEP) {	
				cel = (double)5 / 9 * (fah - 32);
				System.out.printf("%5.1f F = %5.1f C%n", fah, cel);
		}
		System.out.println("============================");
		
		// final 사용 안 하고 작성
	
		 */
		double cel;
		for (double fah = 0; fah <= 100; fah+=10) {
			cel = 5.0/9*(fah-32);
			System.out.printf("%5.1f F = %5.1f C%n", fah, cel);
		}
	}

}
