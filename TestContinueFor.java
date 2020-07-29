package test.oper;

public class TestContinueFor {

	public static void main(String[] args) {
		int sum = 0;
		for(int count = 0; count <= 100; count ++) {
			if(count % 2 != 0) continue;
			sum += count;
		}
		System.out.println(sum);
	}
}
