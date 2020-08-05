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
public class TestObject {

	static int [] lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) throws IOException {
		
		int month =1 ;
		printLastDay(month);
		
		
		for(int i = 0; i<lastDay.length; i++) {
			
			printLastDay(i+1);
		
		}
		
		
		while(true) {
			month = inputUser();
			
			if(month == -1) {
				break;
			}
			printLastDay(month);
		}
	}

	private static void printLastDay(int month) {
		
		System.out.println(month + "월의 마지막 날짜는" + lastDay[month-1] + "일입니다.");
		
	}
	
	 private static int inputUser() throws IOException {
	      
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("월을 입력하세요>");
		String input = in.readLine();
		return (input.equals("x")) ? -1 : Integer.parseInt(input);

	 }
}
