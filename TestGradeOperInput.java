package test.io;

import java.io.IOException;
import java.util.Scanner;

/**
������Է� -> ���� �Ẹ��
BufferedReader -> Scanner
*/

public class TestGradeOperInput {
	public static void main(String[] args) throws IOException {
		System.out.println("�Է�>");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
				
		String result = "A�����Դϴ�";

			result = (score >= 90) ? "A�����Դϴ�"
					: (score >= 80) ? "B�����Դϴ�" 
					: (score >= 70) ? "C�����Դϴ�" 
					: (score >= 60) ? "D�����Դϴ�" 
					: "F�����Դϴ�";
		System.out.println(result);
	}
}
