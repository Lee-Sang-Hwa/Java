package test.oper;

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opr1 = 5;
		char op = '*';
		int opr2 = 3;
		int result = 0;
		
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
		
	}
}
