package test.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * IO : Stream 기반 데이터 이동
 * 1. 단방향 이동, read(), write() 통해 전달
 * 2. Framework(F/W) => 객체 생성, 읽기/쓰기(W/R), 닫기
 * 3. read()
 * 3-1. FileInputStream 객체 생성 => file 이름(경로), 필히 존재해야함
 * 3-2. 데이터 읽기(단위 : byte, char)
 * 3-3. 닫기(안해도 됌) close()
 * 
 * 4. write()
 * 4-1. FileInputStream 객체 생성 => file 이름(경로), 미존재시 생성됨
 * 4-2. 데이터 쓰기(단위, 완전히 보내려면 flush())
 * 4-3. 닫기(필수) close() 
 * 
 * @author User
 *
 */

public class TestIO {

	public static void main(String[] args) throws IOException {
		
//		 * 4. write()
//		 * 4-1. FileInputStream 객체 생성 => file 이름(경로), 미존재시 생성됨
		String file = "C:\\Users\\User\\Downloads\\data.txt";
		FileOutputStream fos = new FileOutputStream(file);
		String str = "한글... abcd... 1234";
		byte[] b = str.getBytes();
//		 * 4-2. 데이터 쓰기(단위, 완전히 보내려면 flush())
		fos.write(b);
//		 * 4-3. 닫기(필수) close() 
		fos.close();
		
//		 * 3. read()
//		 * 3-1. FileInputStream 객체 생성 => file 이름(경로), 필히 존재해야함
//		 * file 경로 [C:\Users\User\Downloads\data.txt]
//		String file = "C:\\Users\\User\\Downloads\\data.txt";
		FileInputStream fis = new FileInputStream(file); // 객체 생성 
				
        int data=0;
//		 * 3-2. 데이터 읽기(단위 : byte, char)
        byte[] buffer = new byte[1024];
		while((data=fis.read(buffer)) != -1) {
			System.out.print(new String(buffer));
		}
//		 * 3-3. 닫기(안해도 됌) close()
		fis.close(); //byte는 int 호환타입이여서, int로 받음, byte보다 int로 받는게 빠름
	}

}
