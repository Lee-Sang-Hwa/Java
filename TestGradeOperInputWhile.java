package test.oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestGradeOperInputWhile {

	public static void main(String[] args) throws IOException {
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		int i=0;
		
		while (i<3) {
		
			System.out.println(args[i]+">"); 
			// or String [] sub = {"����", "����", "����"}; 
			//    System.out.println(sub[i]+">");
			
			String input = in.readLine();
						
			Integer temp = new Integer(input);
			int score = temp.parseInt(input);
					
			String result = "A�����Դϴ�";

				result = (score >= 90) ? "A�����Դϴ�"
						: (score >= 80) ? "B�����Դϴ�" 
						: (score >= 70) ? "C�����Դϴ�" 
						: (score >= 60) ? "D�����Դϴ�" 
						: "F�����Դϴ�";
			System.out.println(result);
			i++;
		}
		System.out.println("���α׷��� �����մϴ�");
		
	}
}