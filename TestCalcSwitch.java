package test.oper;

public class TestCalcSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opr1 = 5;
		char op = '+';
		int opr2 = 3;
		int result = 0;

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
		System.out.println(result);
		
	}
}
