package test.oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestGradeOperInputFor {

	public static void main(String[] args) throws IOException {
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		
		for (int i = 0; i < 3; i++) {
		
			System.out.println(args[i]+">"); 
			// or String [] sub = {"국어", "영어", "수학"}; 
			//    System.out.println(sub[i]+">");
			
			String input = in.readLine();
						
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
		System.out.println("프로그램을 종료합니다");
		
	}
}
