package test.oper;

public class TestBreakFor {

	public static void main(String[] args) {
		
		
		for(int sum = 0, count = 1; count < 10; count++) { // int sum=0을 for문 안에 선언 가능
			sum += count;
			System.out.println(sum);
		}
	}
}
