package test.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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


public class TestGradeMethod {

	   public static void main(String[] args) throws IOException {
		   
		   while (true) {
			   
			   int data = inputUser();
			   
			   String grade = createGrade(data);
			   int resultPrint = printData(grade);
			   if(resultPrint == -1) {
				   break;
			   }
		   }
		   System.out.println("���α׷��� �����Ͽ����ϴ�.");
	   }
   
	   private static int printData(String grade) {
		   if((grade.charAt(0) >= 'A')&&(grade.charAt(0) <= 'F')) {
			   System.out.println(grade);
			   return 0;
		   }else {
			   System.out.println(grade);	
			   return -1;
			   //System.exit(0);
		   }		  
	   }
	   
	   private static String createGrade(int score)  {
		  // && : ����(if(); ��ü), || : ����(not-if(); ��ü)
	      String result = (score > 100)? "���α׷��� �����մϴ�."
	    		: (score >= 90)? "A�����Դϴ�" 
	            : (score >= 80)? "B�����Դϴ�"
	            : (score >= 70)? "C�����Դϴ�"      
	            : (score >= 60)? "D�����Դϴ�"
	            : (score >= 0)? "F�����Դϴ�"
	            : "���α׷��� �����մϴ�.";
	      return result;
	   }
	   
	   
	   private static int inputUser() throws IOException {
	      
	      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("������ �Է��ϼ��� >");
	      String input = in.readLine();
	      
	      // ���������� ��Ȳ - Exception(���ܻ�Ȳ) -> return;
	      //if(input.equals("x")) {
	      //	  return -1; // �������� ���� �ȵ�! (������ ������ int�� ������ �ٸ�, 0 ~ 100)
	      //}
	      	      
	      // �������� ��Ȳ 
	      //int result = Integer.parseInt(input);
	      //return result;
	      
	      // ���������� ��Ȳ + �������� ��Ȳ �Բ� ��� ����
	      return input.equals("x") ? -1 : Integer.parseInt(input);
	      
	   }
	   
}
