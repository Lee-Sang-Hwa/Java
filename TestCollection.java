package test.collect;

import java.util.ArrayList;

public class TestCollection {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add('한');
		list.add(true);
		list.add("Good morning");
		int [] arr = {1,2,3};
		list.add(arr); 
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (Object o : arr) {
			System.out.println(o);
		}
		// foreach : 순차적으로 하나씩 실행할 때, 인덱스 사용 X, 건너뛰기 안됨
		for (int element : arr) {
			System.out.println(element);
		}
		System.out.println(list);
	}
}
