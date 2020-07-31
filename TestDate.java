package test.date;

import test.object.Date;

public class TestDate {

	public static void main(String[] args) {
		Date birthDay1 = new Date(1990, 2, 28);
		Date birthDay2 = new Date(1990, 2, 28);
		birthDay1.setYear(2000);
		birthDay1.setMonth(3);
		birthDay1.setDay(20);
		birthDay1.print();
	}
}