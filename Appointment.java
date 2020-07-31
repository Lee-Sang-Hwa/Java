package test.date;

import test.object.Date;

/**
 * 일정 : 제목, 날짜(y,m,d), 시간, 분 
 * 일정 : 제목 : subject, 시간 : hour, 분 : min
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
		return "Appointment"+"[" + subject + "약속은 " 
				+ getYear() + "년 " + 
				+ getMonth() + "월 "
				+ getDay() + "일 "
				 + hour + "시"+ min + "분 입니다."  
				+ "]";
	}


}
