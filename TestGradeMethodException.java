package test.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;


/**

3���� �Լ��� ������.
1. ����� �Է�
2. Control(Logic)
3. ����� ���
4. �ݺ����� - "x"�� �Էµ� ��� ���α׷� ����.
		  (main()�ܿ����� ����� return�� ����ϸ� ��)

main()
1-1. inputUser();
2-1. createGrade();
3-1. printData();

inputUser();
1-1-1. readLine(); <- BufferedReader
1-1-2. return [1-1-1]�� ������

createGrad();
2-1-1. �Է°� -> ������ �����. <- ���Ǻ�
2-1-2. return ����

printData();
3-1-1. 
3-1-2. return ����
 
*/


public class TestGradeMethodException {

	   public static void main(String[] args) throws IOException {
		   
		   while (true) {
	   
			   int data;
			   try {
				   data = inputUser();
			   } catch (NumberFormatException e) { // ���� ��� ���ڰ� �Էµ� ��
				   break;
			   }
			   String grade = createGrade(data);
			   printData(grade);
		   }
		   System.out.println("���α׷��� �����Ͽ����ϴ�.");
	   }
   
	   private static void printData(String grade) {
		   System.out.println(grade);		  
	   }
	   
	   private static String createGrade(int score)  {
		  // && : ����(if(); ��ü), || : ����(not-if(); ��ü)
	      String result = ((score <= 100)&&(score >= 90))? "A�����Դϴ�" 
	            : (score >= 80)? "B�����Դϴ�"
	            : (score >= 70)? "C�����Դϴ�"      
	            : (score >= 60)? "D�����Դϴ�"
	            : "F�����Դϴ�";
	      return result;
	   }
	   
	   
	   private static int inputUser() throws IOException {
	      
	      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("������ �Է��ϼ��� >");
	      String input = in.readLine();
	      
	      // ���������� ��Ȳ - Exception(���ܻ�Ȳ) -> return;
	      try {
	    	  return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			  throw e;
		}
	    
	   }
}
