package test.oper;

public class StarVersion2 {

	public static void main(String[] args) {
		
		String st = "*";
		String sp = " ";
		String str = "";
		
		for(int i=5; i>0; i--) {
			str = "";
			for(int j=i; j>0; j--) {
				str += st;
			}
			System.out.println(str);
		}

	}

}
