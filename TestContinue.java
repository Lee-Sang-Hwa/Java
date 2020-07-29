package test.oper;

public class TestContinue {

	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		
		while(count <= 100) {
			count ++;
			if(count % 2 != 0) continue;
			sum+= count;
		}
		System.out.println(sum);
	}
}
