package test.oper;

public class StarVersion3 {

	public static void main(String[] args) {
		
		String st = "*";
		String sp = " ";
		String str = "";
		
		for(int i=1; i<10; i=i+2) {
			str = "";
			for(int j=(10-i)/2; j>0; j--) {
				str += sp;
			}
			for(int k=1; k<i+1; k++) {
				str += st;
			}
			for(int j=(10-i)/2; j>0; j--) {
				str += sp;
			}
			System.out.println(str);
		}
	}
}


