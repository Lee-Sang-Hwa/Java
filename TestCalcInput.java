package test.oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestCalcInput {

	public static void main(String[] args) throws IOException {
		
		int opr1 = 5; char op = '+'; int opr2 = 3; int result = 0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		Integer temp = new Integer(opr1);
		//opr1 = temp.parseInt(args[0]);
		//op = args[1].charAt(0);
		//opr2 = temp.parseInt(args[2]);
		
		System.out.println("ù��° ��?");
		String input = in.readLine();
		opr1 = temp.parseInt(input);
		System.out.println("�����ڴ�?");
		input = in.readLine();
		op = input.charAt(0);
		System.out.println("�ι�° ��?");
		input = in.readLine();
		opr2 = temp.parseInt(input);
		
		switch (op) {
		case '+' :
				result = opr1 + opr2;
				break;
		case '-' :
				result = opr1 - opr2;
				break;
		case '*' :
				result = opr1 * opr2;
				break;
		default:
				result = opr1 / opr2;
				break;
		}
		
		System.out.println("= " + result);
		
		/**while (i<2*3) {
			
			//System.out.println(args[i]+">");
			
			String input = in.readLine();

				result = (op == '+') ? opr1 + opr2
						: (op == '-') ? opr1 - opr2 
						: (op == '*') ? opr1 * opr2
						: opr1 / opr2;
				
			System.out.println(result);
			i++;
		}
		System.out.println("���α׷��� �����մϴ�");
		**/
			
			
		/**
		if(op == '+') {
			 result = opr1 + opr2;
		}else if(op == '-') {
			 result = opr1 - opr2;
		}else if(op == '*') {
			 result = opr1 * opr2;
		}else if(op == '/') {
			 result = opr1 / opr2;
		}
		System.out.println(result);
		**/
		
	}
}
