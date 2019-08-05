package io.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 표준 입력인 키보드 입력을 받아서
 * 표준 출력인 모니터 출력하는 클래스
 * 1. node stream (키보드= System.in : InputStream 객체 )
 * 2. filter stream (stream --> reader : InputStreamReader)
 *    1 바이트 키보드 인풋스트림을 
 *    2 바이트 문자로 변경한다.
 *    (키보드는 사실 분자입력이기때문에)
 *    
 *  3.
 * @author Administrator
 *
 */
public class KeyboardInput {

	public static void main(String[] args) throws IOException {
		// 1. 입력 스트림(표준 입력 : 키보드 )
		InputStream in = System.in;
		
		// 2. 노드 스트림을 포장할 필터 스트림
		//   InputStream ==> Reader로 바꿔주는 필터 스트림 적용
		//InputStreamReader ir = new InputStreamReader(in);
		
		// 3. 2의 필터 스트림을 편리한 사용을 위한
		//	  다른 필터 스트림으로 포장
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		
		System.out.println("값을 입력하세요. (ctrl+z 입력시 중단됩니다)");
		// 4. 3의 필터 스트림의 편리한 메소드 사용해서 읽기
		String readData = null;
		while ((readData = br.readLine()) != null) {
			// 5. 읽은 데이터가 null이 아니면
			//    표준 출력에 출력하기
			System.out.println("읽은 데이터:" + readData);
		
		}
		// 6. 자원 해제
		br.close();

	}

}
