package test.oper;

public class TestGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int score[] = {80, 90, 20, 60, 100, 50};
		
		for(i=0; i<score.length; i++) {
		
			if (score[i] >= 90) {
				System.out.println("A�����Դϴ�");
			}
			else if (score[i] >= 80) {
				System.out.println("B�����Դϴ�");
			}
			else if (score[i] >= 70) {
				System.out.println("C�����Դϴ�");
			}
			else if (score[i] >= 60) {
				System.out.println("D�����Դϴ�");
			}
			else {
				System.out.println("F�����Դϴ�");
			}
		
		}
		
	}

}
