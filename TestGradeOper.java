package test.oper;

public class TestGradeOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int score[] = {80, 90, 20, 60, 100, 50};
		String result = "A학점입니다";
		
		for(i=0; i<score.length; i++) {
			result = (score[i] >= 90) ? "A학점입니다"
					: (score[i] >= 80) ? "B학점입니다" 
					: (score[i] >= 70) ? "C학점입니다" 
					: (score[i] >= 60) ? "D학점입니다" 
					: "F학점입니다";
			System.out.println(result);
		}
	}
}
