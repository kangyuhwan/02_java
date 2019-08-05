package io.basic;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 표준 입력인 키보드 입력을 바아서 입력된 내용을 파일로 출력하는 클래스 ================= -- 입력 -- 1. node
 * stream (키보드 = System.in : InputStream) 2. filter stream (stream --> reader :
 * InputStreamReader) 3. filter stream (reader --> reader : BufferedReader) 4.
 * 3의 filter stream을 통해 1줄단위 입력을 지원하는 readLine()을 사용
 * 
 * @author Administrator
 *
 */
public class KeyboardInputFileOutput {

	public static void main(String[] args) throws IOException {
		// 1. 입력 : node stream : System.in
		InputStream in = System.in;

		// 2. 입력 : filter stream : stream --> reader
		InputStreamReader ir = new InputStreamReader(in);

		// 3. 입력 : filter stream : reader --> reader
		BufferedReader br = new BufferedReader(ir);

		// 5. 출력 : node stream : file : FileWriter
		FileWriter fw = new FileWriter("out.txt");

		// 6. 출력 : filter stream : writer --> writer
		PrintWriter out = new PrintWriter(fw);

		// 4. 입력 filer stream 에서 읽기
		System.out.println("값을 입력하세요. (ctrl + z 입력 시 중단)");

		String readData = null;
		while ((readData = br.readLine()) != null) {
			// 7. 출력 filter stream에 쓰기
			out.println(readData);
			// 화면 출력
			System.out.println("읽은 데이터:" + readData);
		}
		// 8,9 객체 닫기
		br.close();
		out.close();
	}

}
