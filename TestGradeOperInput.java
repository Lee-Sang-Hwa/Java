package test.oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestGradeOperInput {

	public static void main(String[] args) throws IOException {
		System.out.println("�Է�>");
		//int inputValue = System.in.read();
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		String input = in.readLine();
		//System.out.println((char)inputValue);
		
		Integer temp = new Integer(input);
		int score = temp.parseInt(input);
				
		String result = "A�����Դϴ�";

			result = (score >= 90) ? "A�����Դϴ�"
					: (score >= 80) ? "B�����Դϴ�" 
					: (score >= 70) ? "C�����Դϴ�" 
					: (score >= 60) ? "D�����Դϴ�" 
					: "F�����Դϴ�";
		System.out.println(result);
	}
}
