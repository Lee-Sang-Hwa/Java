package test.oper;

public class TestGradeOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int score[] = {80, 90, 20, 60, 100, 50};
		String result = "A�����Դϴ�";
		
		for(i=0; i<score.length; i++) {
			result = (score[i] >= 90) ? "A�����Դϴ�"
					: (score[i] >= 80) ? "B�����Դϴ�" 
					: (score[i] >= 70) ? "C�����Դϴ�" 
					: (score[i] >= 60) ? "D�����Դϴ�" 
					: "F�����Դϴ�";
			System.out.println(result);
		}
	}
}
