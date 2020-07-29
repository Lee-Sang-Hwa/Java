package test.oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestGradeOperInput {

	public static void main(String[] args) throws IOException {
		System.out.println("입력>");
		//int inputValue = System.in.read();
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		String input = in.readLine();
		//System.out.println((char)inputValue);
		
		Integer temp = new Integer(input);
		int score = temp.parseInt(input);
				
		String result = "A학점입니다";

			result = (score >= 90) ? "A학점입니다"
					: (score >= 80) ? "B학점입니다" 
					: (score >= 70) ? "C학점입니다" 
					: (score >= 60) ? "D학점입니다" 
					: "F학점입니다";
		System.out.println(result);
	}
}
