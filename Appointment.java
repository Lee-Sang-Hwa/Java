package test.date;

import test.object.Date;

/**
 * ���� : ����, ��¥(y,m,d), �ð�, �� 
 * ���� : ���� : subject, �ð� : hour, �� : min
 */

public class Appointment extends Date{
	
	String subject;
	int hour, min;
	
	public Appointment(String subject, int i, int j, int k, int hour, int min) {
		super(i, j, k);
		this.subject = subject;
		this.hour = hour;
		this.min = min;
	}


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void print() {
		System.out.println(this);
	}


	@Override
	public String toString() {
		return "Appointment"+"[" + subject + "����� " 
				+ getYear() + "�� " + 
				+ getMonth() + "�� "
				+ getDay() + "�� "
				 + hour + "��"+ min + "�� �Դϴ�."  
				+ "]";
	}


}
