package comtrol.ifstmt;
/*
 * 
 */

import java.util.Scanner;

public class CalcBMI {
	// 선언
	double weight;
	double height;
	String bmi;
	
	Scanner scan;
	
	// 초기화
	bmi = weight/(height*height);
	scan = new Scanner(System.in);
	// prompt
	System.out.printf("키 몸무게 입력 ");
	weight = scan.nextDouble();
	height = scan.nextDouble();
	sysout
	if (bmi > 40)
	{
		bmi = "병적인 비만";
	}
	else if (bmi >= 27.5 && bmi < 40 )
	{
		bmi = "비만";
	}
	else if (bmi >= 23 && bmi < 27.5 )
	{
		bmi = "과체중";
	}
	else if (bmi >= 18.5 && bmi < 23 )
	{
		bmi = "정상";
	}
	else if (bmi >= 15 && bmi < 18.5 )
	{
		bmi = "저체중";
	}
	else
	{
		bmi = "병적인 저체중";
	}
	System.out.printf("키 : %d 몸무게 :  %d bmi : %s입니다.", weight, height, bmi);
}
}
