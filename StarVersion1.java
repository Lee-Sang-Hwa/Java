package test.oper;

public class StarVersion1 {

	public static void main(String[] args) {
		
		String st = "*";
		String sp = " ";
		String str = "";
		
		for(int i=1; i<6; i++) {
			str = "";
			for(int j=1; j<i+1; j++) {
				str += st;
			}
			System.out.println(str);
		}

	}

}
