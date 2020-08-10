package test.io;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * IO : Reader/Writer ��� ������ �̵�
 * 1. �ܹ��� �̵�, read(), write() ���� ���� (char ����)
 * 2. Framework(F/W) => ��ü ����, �б�/����(W/R), �ݱ�
 * 3. read()
 * 3-1. FileReader ��ü ���� => file �̸�(���), ���� �����ؾ���
 * 3-2. ������ �б�(���� : byte, char)
 * 3-3. �ݱ�(���ص� ��) close()
 * 
 * 4. write()
 * 4-1. FileWriter ��ü ���� => file �̸�(���), ������� ������
 * 4-2. ������ ����(����, ������ �������� flush())
 * 4-3. �ݱ�(�ʼ�) close() 
 * 
 * @author User
 *
 */

public class TestReaderWriter {

	public static void main(String[] args) throws IOException {
		
//		 * 4. write()
//		 * 4-1. FileInputStream ��ü ���� => file �̸�(���), ������� ������
		String file = "C:\\Users\\User\\Downloads\\data.txt";
		FileWriter fos = new FileWriter(file);
		String str = "�ѱ�... abcd... 1234";
//		 * 4-2. ������ ����(����, ������ �������� flush())
		fos.write(str);
		fos.flush();
//		 * 4-3. �ݱ�(�ʼ�) close() 
		fos.close();
		
//		 * 3. read()
//		 * 3-1. FileInputStream ��ü ���� => file �̸�(���), ���� �����ؾ���
//		 * file ��� [C:\Users\User\Downloads\data.txt]
//		String file = "C:\\Users\\User\\Downloads\\data.txt";
		FileReader fis = new FileReader(file); // ��ü ���� 
        int data=0;
//		 * 3-2. ������ �б�(���� : byte, char)
        char[] buffer = new char[1024];
        while ((data = fis.read(buffer)) != -1) { 
			System.out.print(new String(buffer));
		}
		 System.out.println();
		 fis.close();
		 
		 //String�� �Ѳ����� �д� ���2 : BufferedReader�� �ѹ��� �о��
		 FileReader fis2 = new FileReader(file);//��ü ����  <- file�̸�(���), ���� �����ؾ� ��.
		 BufferedReader br = new BufferedReader(fis2);
		 String result = "", s = null;
		 while ((s = br.readLine()) != null) {
			result += s;
		}
		 System.out.println(result); //BufferedReader�� readLine()�� �ٳ���(\n)�� ����
		 fis2.close(); //byte�� int ȣȯŸ���̿���, int�� ����, byte���� int�� �޴°� ���� 
	}

}
