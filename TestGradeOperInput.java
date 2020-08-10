package test.io;

import java.io.IOException;
import java.util.Scanner;

/**
사용자입력 -> 쉽게 써보자
BufferedReader -> Scanner
*/

public class TestGradeOperInput {
	public static void main(String[] args) throws IOException {
		System.out.println("입력>");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
				
		String result = "A학점입니다";

			result = (score >= 90) ? "A학점입니다"
					: (score >= 80) ? "B학점입니다" 
					: (score >= 70) ? "C학점입니다" 
					: (score >= 60) ? "D학점입니다" 
					: "F학점입니다";
		System.out.println(result);
	}
}
