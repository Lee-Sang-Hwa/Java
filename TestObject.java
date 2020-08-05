package test.object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * [ ] : �迭/��ü(����Ÿ��, �ֵ�����Ÿ�Կ� ����-���� ������ ����)
 * ex ) int [ ] = i; i = new int[3]; i[0] = 1;
 * 1. 1������ 12������ ������ ��¥ ��� ���α׷� �ۼ�
 * 1-1. ���� �����Ǹ� �ش� ���� ��������¥�� ���
 * 1-1-1. month = ?; printLastDay(month); // ������ ��¥�� ������ִ� �Լ�
 * 
 * 1-2. [1-1]�ݺ�, 12�� �ݺ�
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
		
		System.out.println(month + "���� ������ ��¥��" + lastDay[month-1] + "���Դϴ�.");
		
	}
	
	 private static int inputUser() throws IOException {
	      
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���� �Է��ϼ���>");
		String input = in.readLine();
		return (input.equals("x")) ? -1 : Integer.parseInt(input);

	 }
}