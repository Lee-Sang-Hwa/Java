package test.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * IO : Stream ��� ������ �̵�
 * 1. �ܹ��� �̵�, read(), write() ���� ����
 * 2. Framework(F/W) => ��ü ����, �б�/����(W/R), �ݱ�
 * 3. read()
 * 3-1. FileInputStream ��ü ���� => file �̸�(���), ���� �����ؾ���
 * 3-2. ������ �б�(���� : byte, char)
 * 3-3. �ݱ�(���ص� ��) close()
 * 
 * 4. write()
 * 4-1. FileInputStream ��ü ���� => file �̸�(���), ������� ������
 * 4-2. ������ ����(����, ������ �������� flush())
 * 4-3. �ݱ�(�ʼ�) close() 
 * 
 * @author User
 *
 */

public class TestIO {

	public static void main(String[] args) throws IOException {
		
//		 * 4. write()
//		 * 4-1. FileInputStream ��ü ���� => file �̸�(���), ������� ������
		String file = "C:\\Users\\User\\Downloads\\data.txt";
		FileOutputStream fos = new FileOutputStream(file);
		String str = "�ѱ�... abcd... 1234";
		byte[] b = str.getBytes();
//		 * 4-2. ������ ����(����, ������ �������� flush())
		fos.write(b);
//		 * 4-3. �ݱ�(�ʼ�) close() 
		fos.close();
		
//		 * 3. read()
//		 * 3-1. FileInputStream ��ü ���� => file �̸�(���), ���� �����ؾ���
//		 * file ��� [C:\Users\User\Downloads\data.txt]
//		String file = "C:\\Users\\User\\Downloads\\data.txt";
		FileInputStream fis = new FileInputStream(file); // ��ü ���� 
				
        int data=0;
//		 * 3-2. ������ �б�(���� : byte, char)
        byte[] buffer = new byte[1024];
		while((data=fis.read(buffer)) != -1) {
			System.out.print(new String(buffer));
		}
//		 * 3-3. �ݱ�(���ص� ��) close()
		fis.close(); //byte�� int ȣȯŸ���̿���, int�� ����, byte���� int�� �޴°� ����
	}

}
