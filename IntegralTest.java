package test.data;

public class IntegralTest {

	public static void main(String[] args) {
	System.out.println();
	System.out.println(12);
	System.out.println(012); // int-8진수 (숫자앞에 0을 붙이면 8진수, 8*1+1*2=10) 
	System.out.println(0xA3); //int-16진수
	System.out.println(0x80000000); // 음수 중 최대절대값, -2^31
	System.out.println(5%3);
	System.out.println(-5%3);
	System.out.println(0x80000001 << 2);
	System.out.println(0xFFFFFFFF); // 음수 -1
	System.out.println(0xFFFFFFFF >> 30); // 음수 극한값 -1
	System.out.println(0xFFFFFFFF >>> 30); // 음수 3중 shift 3
	
	char c ='a';
	System.out.println(c); // a
	System.out.println((int)c); // 아스키코드, 97, 컴퓨터 내부 문자의 코드값, casting
	System.out.println('\141'); // 유니코드, java character set : a
	System.out.println('\u0061'); // 유니코드, 16진수 : a
	System.out.println(++c); // ++연산, a+1=b
	int i = 0;
	System.out.println(3/i); // 정수를 0으로 나눌 때, ArithmeticException 오류발생
	System.out.println(3.0/i); // 실수를 0으로 나눌 때, Infinity
	}

}
