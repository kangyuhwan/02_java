package control.loop;
/* 0 ~ 10까지 출력하는 클래스
 * 
 * while 구문을 사용해서
 * 반복 출력을 구현
 * while 문을 이용하여 1~100 사이의 홀수의 합을 구하는 클래스
 */
public class PrintToTen {

	public static void main(String[] args) {
		// 선언 초기화
		int number = 0;
		// 반복문 사용
		while (number <= 10)
		{
			System.out.printf("number= %d%n", number);
			number ++;
		} 
	}

}
