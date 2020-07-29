package test.data;

public class IntegralTest {

	public static void main(String[] args) {
	System.out.println();
	System.out.println(12);
	System.out.println(012); // int-8���� (���ھտ� 0�� ���̸� 8����, 8*1+1*2=10) 
	System.out.println(0xA3); //int-16����
	System.out.println(0x80000000); // ���� �� �ִ����밪, -2^31
	System.out.println(5%3);
	System.out.println(-5%3);
	System.out.println(0x80000001 << 2);
	System.out.println(0xFFFFFFFF); // ���� -1
	System.out.println(0xFFFFFFFF >> 30); // ���� ���Ѱ� -1
	System.out.println(0xFFFFFFFF >>> 30); // ���� 3�� shift 3
	
	char c ='a';
	System.out.println(c); // a
	System.out.println((int)c); // �ƽ�Ű�ڵ�, 97, ��ǻ�� ���� ������ �ڵ尪, casting
	System.out.println('\141'); // �����ڵ�, java character set : a
	System.out.println('\u0061'); // �����ڵ�, 16���� : a
	System.out.println(++c); // ++����, a+1=b
	int i = 0;
	System.out.println(3/i); // ������ 0���� ���� ��, ArithmeticException �����߻�
	System.out.println(3.0/i); // �Ǽ��� 0���� ���� ��, Infinity
	}

}
