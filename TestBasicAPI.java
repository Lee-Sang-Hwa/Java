package test.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBasicAPI {

	public static void main(String[] args) throws IOException {
		
		System.out.println("입력>");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		String input = in.readLine();
		
		int inValue = Integer.parseInt(input);
		
		//if (inValue==0) System.out.println("정상종료입니다");
		//else if (inValue==1) System.out.println("");
		
		System.out.println((inValue==0)? "정상종료입니다." : "사용자종료입니다.");
		

	}

}
