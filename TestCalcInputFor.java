package test.oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestCalcInputFor {

	public static void main(String[] args) throws IOException {
		
		int opr1 = 5; char op = '+'; int opr2 = 3; int result = 0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		Integer temp = new Integer(opr1);
		//opr1 = temp.parseInt(args[0]);
		//op = args[1].charAt(0);
		//opr2 = temp.parseInt(args[2]);
		
		for(;;) {
			
			/**�Ϲ� ��ü�� �ڵ�
			System.out.println("ù��° ��?");
			String input = in.readLine();
			opr1 = temp.parseInt(input);
			System.out.println("�����ڴ�?");
			input = in.readLine();
			op = input.charAt(0);
			**/
			
			//static �ڵ�
			//static�� ������(����, �Լ�)�� Ŭ������.OOO()���� ���
			System.out.println("ù��° ��?");
			String input = in.readLine();
			opr1 = Integer.parseInt(input);
			System.out.println("�����ڴ�?");
			input = in.readLine();
			op = input.charAt(0);
			
			
			if(op == 'c') {
				break;
			}
			
			System.out.println("�ι�° ��?");
			input = in.readLine();
			opr2 = Integer.parseInt(input);
			

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
		
		}
		
		System.out.println("���α׷��� �����մϴ�");
	}
}
