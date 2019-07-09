package comtrol.ifstmt;

import java.util.Scanner;

public class CalcBMIs {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double weight;
		double height;
		double bmi;
		String result;
		Scanner scan;
		
		// 초기화
		System.out.printf("키 몸무게 입력 ");
		scan = new Scanner(System.in);
		height = scan.nextDouble();
		weight = scan.nextDouble();
		bmi = (weight / (height * 2)*100);
		
		// prompt		
		if (bmi > 40.0f)
		{
			result = "병적인 비만";
		}
		else if (bmi >= 27.5f && bmi < 40.0f )
		{
			result = "비만";
		}
		else if (bmi >= 23.0f && bmi < 27.5f )
		{
			result = "과체중";
		}
		else if (bmi >= 18.5f && bmi < 23.0f )
		{
			result = "정상";
		}
		else if (bmi >= 15.0f && bmi < 18.5f )
		{
			result = "저체중";
		}
		else
		{
			result = "병적인 저체중";
		}
		System.out.printf("키 %.2fcm 몸무게 %.2fkg, bmi는 %.2f 당신은 %s입니다.", weight, height, bmi, result);
	}

}
