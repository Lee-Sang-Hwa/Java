package test.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBasicAPI {

	public static void main(String[] args) throws IOException {
		
		System.out.println("�Է�>");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		String input = in.readLine();
		
		int inValue = Integer.parseInt(input);
		
		//if (inValue==0) System.out.println("���������Դϴ�");
		//else if (inValue==1) System.out.println("");
		
		System.out.println((inValue==0)? "���������Դϴ�." : "����������Դϴ�.");
		

	}

}
