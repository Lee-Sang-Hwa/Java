package test.io;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * IO : Reader/Writer 기반 데이터 이동
 * 1. 단방향 이동, read(), write() 통해 전달 (char 단위)
 * 2. Framework(F/W) => 객체 생성, 읽기/쓰기(W/R), 닫기
 * 3. read()
 * 3-1. FileReader 객체 생성 => file 이름(경로), 필히 존재해야함
 * 3-2. 데이터 읽기(단위 : byte, char)
 * 3-3. 닫기(안해도 됌) close()
 * 
 * 4. write()
 * 4-1. FileWriter 객체 생성 => file 이름(경로), 미존재시 생성됨
 * 4-2. 데이터 쓰기(단위, 완전히 보내려면 flush())
 * 4-3. 닫기(필수) close() 
 * 
 * @author User
 *
 */

public class TestReaderWriter {

	public static void main(String[] args) throws IOException {
		
//		 * 4. write()
//		 * 4-1. FileInputStream 객체 생성 => file 이름(경로), 미존재시 생성됨
		String file = "C:\\Users\\User\\Downloads\\data.txt";
		FileWriter fos = new FileWriter(file);
		String str = "한글... abcd... 1234";
//		 * 4-2. 데이터 쓰기(단위, 완전히 보내려면 flush())
		fos.write(str);
		fos.flush();
//		 * 4-3. 닫기(필수) close() 
		fos.close();
		
//		 * 3. read()
//		 * 3-1. FileInputStream 객체 생성 => file 이름(경로), 필히 존재해야함
//		 * file 경로 [C:\Users\User\Downloads\data.txt]
//		String file = "C:\\Users\\User\\Downloads\\data.txt";
		FileReader fis = new FileReader(file); // 객체 생성 
        int data=0;
//		 * 3-2. 데이터 읽기(단위 : byte, char)
        char[] buffer = new char[1024];
        while ((data = fis.read(buffer)) != -1) { 
			System.out.print(new String(buffer));
		}
		 System.out.println();
		 fis.close();
		 
		 //String을 한꺼번에 읽는 방법2 : BufferedReader로 한번에 읽어옴
		 FileReader fis2 = new FileReader(file);//객체 생성  <- file이름(경로), 필히 존재해야 함.
		 BufferedReader br = new BufferedReader(fis2);
		 String result = "", s = null;
		 while ((s = br.readLine()) != null) {
			result += s;
		}
		 System.out.println(result); //BufferedReader의 readLine()은 줄나눔(\n)을 없앰
		 fis2.close(); //byte는 int 호환타입이여서, int로 받음, byte보다 int로 받는게 빠름 
	}

}
