package test.oper;

public class TestGradeOperArgs {

	public static void main(String[] args) {// [ ] : �迭, ���� [����]
		
		int score = 91;
		Integer temp = new Integer(score);
		score = temp.parseInt(args[0]);
		String result = "A�����Դϴ�";
		
			result = (score >= 90) ? "A�����Դϴ�"
					: (score >= 80) ? "B�����Դϴ�" 
					: (score >= 70) ? "C�����Դϴ�" 
					: (score >= 60) ? "D�����Դϴ�" 
					: "F�����Դϴ�";
			System.out.println(result);

	}
}
