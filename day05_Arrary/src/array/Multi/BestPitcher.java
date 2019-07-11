package array.Multi;

import java.util.Scanner;

/*
 * 야구 구단의 1~5선발 선수의 방어율을 입력하고 그 중 가장 방어율이 낮은 최고의 투수를 찾는 클래스
 * 최고의 투수는 몇 번째 팀 몇 번째 투수의 방어율입니다.
 */
public class BestPitcher {

	public static void main(String[] args) {
		// 선언
		double[][] era = new double[3][5];
		double min = 10.0;
		Scanner scan = new Scanner(System.in);
		// 각 팀별로 각 투수의 방어율을 입력받아 배열에 저장한다.
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력");

		for (int idx = 0; idx < era.length; idx++) {
			System.out.println((idx + 1) + "번째 팀 1~5선발 투수 방어율 : ");
			for (int ind = 0; ind < era[idx].length; ind++) {
				era[idx][ind] = scan.nextDouble();
				
			}
		}
		int i =0;
		int j =0;
		
		System.out.println("최고의 투수는 ");
		for (int idx = 0; idx < era.length; idx++) {
			for (int ind = 0; ind < era[idx].length; ind++) {
				if (min > era[idx][ind]) {
					min = era[idx][ind];
					i=idx+1;
					j=ind+1;
				}
				
				
			} 
			
		}
		System.out.printf("%d번째 팀%d선발 투수로 방어율은= %f입니다.%n", i, j, min);
	}
}
