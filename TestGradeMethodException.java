package test.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;


/**

3개의 함수로 나눈다.
1. 사용자 입력
2. Control(Logic)
3. 사용자 출력
4. 반복실행 - "x"가 입력될 경우 프로그램 종료.
		  (main()외에서는 종료는 return을 사용하면 됌)

main()
1-1. inputUser();
2-1. createGrade();
3-1. printData();

inputUser();
1-1-1. readLine(); <- BufferedReader
1-1-2. return [1-1-1]의 데이터

createGrad();
2-1-1. 입력값 -> 학점을 만든다. <- 조건비교
2-1-2. return 학점

printData();
3-1-1. 
3-1-2. return 없음
 
*/


public class TestGradeMethodException {

	   public static void main(String[] args) throws IOException {
		   
		   while (true) {
	   
			   int data;
			   try {
				   data = inputUser();
			   } catch (NumberFormatException e) { // 숫자 대신 문자가 입력될 때
				   break;
			   }
			   String grade = createGrade(data);
			   printData(grade);
		   }
		   System.out.println("프로그램이 종료하였습니다.");
	   }
   
	   private static void printData(String grade) {
		   System.out.println(grade);		  
	   }
	   
	   private static String createGrade(int score)  {
		  // && : 논리곱(if(); 대체), || : 논리합(not-if(); 대체)
	      String result = ((score <= 100)&&(score >= 90))? "A학점입니다" 
	            : (score >= 80)? "B학점입니다"
	            : (score >= 70)? "C학점입니다"      
	            : (score >= 60)? "D학점입니다"
	            : "F학점입니다";
	      return result;
	   }
	   
	   
	   private static int inputUser() throws IOException {
	      
	      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("점수를 입력하세요 >");
	      String input = in.readLine();
	      
	      // 비정상적인 상황 - Exception(예외상황) -> return;
	      try {
	    	  return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			  throw e;
		}
	    
	   }
}
