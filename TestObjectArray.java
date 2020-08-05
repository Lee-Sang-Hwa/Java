package test.object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * [ ] : 배열/객체(보조타입, 주데이터타입에 보조-집합 개념을 포함)
 * ex ) int [ ] = i; i = new int[3]; i[0] = 1;
 * 1. 1월부터 12월까지 마지막 날짜 출력 프로그램 작성
 * 1-1. 월이 지정되면 해당 달의 마지막날짜를 출력
 * 1-1-1. month = ?; printLastDay(month); // 마지막 날짜를 출력해주는 함수
 * 
 * 1-2. [1-1]반복, 12번 반복
 * 1-2-1. for
 * 
 * @author User
 *
 */

public class TestObjectArray {
	
	public static void main(String[] args) throws IOException {
		Date birthDay = new Date();
		Date birthDay1 = new Date(2024, 2, 300);
		Date birthDay2 = new Date(1990, 2,-11);
		birthDay1.print();		birthDay2.print();
		
//		if (birthDay1 == birthDay2) {
//			System.out.println("same");
//		} else {
//			System.out.println("not same");
//		}
		
		if (birthDay1.equals(birthDay2)) { // birthDay1 == birthDay2
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		birthDay.print();
	}

	
	
	 private static int inputUser() throws IOException {
	      
	      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("월을 입력하세요>");
	      String input = in.readLine();
	      
	      //if (input.equals("X")) System.exit(0); // JVM을 종료
	      
	      return input.equals("x") ? -1 : Integer.parseInt(input);
	 }
}
