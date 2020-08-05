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
	      System.out.println("���� �Է��ϼ���>");
	      String input = in.readLine();
	      
	      //if (input.equals("X")) System.exit(0); // JVM�� ����
	      
	      return input.equals("x") ? -1 : Integer.parseInt(input);
	 }
}
