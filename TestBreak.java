package test.oper;

public class TestBreak {

	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		while(true) {
			sum += count;
			count ++;
			if(count > 10) break;
			System.out.println(sum);
		}
		System.out.println(sum);

	}

}
