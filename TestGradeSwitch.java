package test.oper;

public class TestGradeSwitch {

	public static void main(String[] args) {
		
		int i;
		int score[] = {80, 90, 20, 60, 100, 50};
		
		for(i=0; i<score.length; i++) {
			score[i]/=10;
				switch (score[i]) {
				case 10:
					System.out.println("A�����Դϴ�");
					break;
				case 9:
					System.out.println("A�����Դϴ�");
					break;
				case 8:
					System.out.println("B�����Դϴ�");
					break;
				case 7:
					System.out.println("C�����Դϴ�");
					break;
				case 6:
					System.out.println("D�����Դϴ�");
					break;
				default:
					System.out.println("F�����Դϴ�");
					break;
				} 
		
		}
	}

}
