package test.oper;

public class TestGradeSwitch {

	public static void main(String[] args) {
		
		int i;
		int score[] = {80, 90, 20, 60, 100, 50};
		
		for(i=0; i<score.length; i++) {
			score[i]/=10;
				switch (score[i]) {
				case 10:
					System.out.println("A학점입니다");
					break;
				case 9:
					System.out.println("A학점입니다");
					break;
				case 8:
					System.out.println("B학점입니다");
					break;
				case 7:
					System.out.println("C학점입니다");
					break;
				case 6:
					System.out.println("D학점입니다");
					break;
				default:
					System.out.println("F학점입니다");
					break;
				} 
		
		}
	}

}
