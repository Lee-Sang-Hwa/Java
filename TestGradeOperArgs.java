package test.oper;

public class TestGradeOperArgs {

	public static void main(String[] args) {// [ ] : 배열, 사용시 [숫자]
		
		int score = 91;
		Integer temp = new Integer(score);
		score = temp.parseInt(args[0]);
		String result = "A학점입니다";
		
			result = (score >= 90) ? "A학점입니다"
					: (score >= 80) ? "B학점입니다" 
					: (score >= 70) ? "C학점입니다" 
					: (score >= 60) ? "D학점입니다" 
					: "F학점입니다";
			System.out.println(result);

	}
}
