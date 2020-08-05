package test.object;

import java.util.Arrays;

public class Date {
	
	//Encapsulation(은닉성), 외부에서 접근하지 못하도록 함
	private int [] lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private int year = 2000;
	private int month = 2; // private에 접근하기 위해서 getter, setter를 만들어준다
	private int day = 0;
	
	/**
	 * 생성자 - new(연산자:객체 메모리를 생성)와 함께 생성된 객체의 멤버를 초기화
	 * @param i -> year
	 * @param j -> month
	 * @param k -> day
	 */
	
	public Date (int i, int j, int k) {
		setYear(i); setMonth(j); setDay(k);
	}

	@Override
	public String toString() {
		return getYear() + "년 " + 
				+ getMonth() + "월 "
				+ getDay() + "일 ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getDay();
		result = prime * result + getMonth();
		result = prime * result + getYear();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (getDay() != other.getDay())
			return false;
		if (!Arrays.equals(lastDay, other.lastDay))
			return false;
		if (getMonth() != other.getMonth())
			return false;
		if (getYear() != other.getYear())
			return false;
		return true;
	}
	
	public Date() { // 오버로딩, 생성자 : 타입이 없고, 이름이 같음, arg는 달라도 됌, arg가 같으면 충돌
		// TODO Auto-generated constructor stub
	}

	
	void printLastDay() // over-loading (인자:argument가 다른 함수)
	{
		System.out.println(getMonth() + "월의 마지막 날짜는" + lastDay[getMonth()-1] + "일입니다.");
	}
	
	void printLastDay(int month) {
		
		System.out.println(month + "월의 마지막 날짜는" + lastDay[month-1] + "일입니다.");
		
	}

	public void print() {
		System.out.println(year+"년"+getMonth()+"월"+day+"일");
	}

	public int getYear() {
		return year;	
	}

	public void setYear(int year) {

		this.year = year;		
	}
	
	public int getMonth() { //getter
		return month;	
	}
	
	/**
	 * 월을 설정
	 * 월의 범위는 1 ~ 12임.
	 * 1보다 작은 값은 1로, 12보다 큰 값은 12로 설정함.
	 * @param month : 1 <= month <= 12
	 */

	public void setMonth(int month) { //setter	
		month = month<1 ? 1 : month>12 ? 12 : month;
		this.month = month;
	}
	
	public int getDay() {
		return day;	
	}
	
	/**
	 * 일(날짜)을 설정
	 * 일의 범위는 1 ~ lastDay[month-1]임.
	 * 1보다 작은 값은 1로, lastDay[month-1]보다 큰 값은 
	 * lastDay[month-1]로 설정함.
	 * @param month : 1 <= month <= lastDay[month-1]
	 */
	
	public void setDay(int day) {
		checkLuna();
		day = day>lastDay[month-1] ? lastDay[month-1] : day < 1 ? 1 : day;
		this.day = day;
	}

	/**
	 * 윤년을 검사해서 lastDay[1(2월의 값)]의 값 변경
	 * 윤년 공식
	 * 0. 기본 : 2월의 마지막 날은 28일
	 * 1. 연도를 4로 나눠 나머지가 0 이면 2월은 29일까지
	 * 2. 연도를 100으로 나눠 나머지가 0 2월은 28일까지
	 * 3. 연도를 400으로 나눠 나머지가 0 2월은 29일까지
	 */
	
	private void checkLuna() {
		
		if((year % 4 == 0)&&(year % 100 == 0)&&(year % 400 == 0)){
			lastDay[1] = 29;	
		}else lastDay[1] = 28; 
		
		//int ckln = day != 28 ? day : (year%4==0) ? 29 : (year % 100 == 0) ? 28 : (year % 400 == 0) ? 29 : day ;
		//return ckln;
	}
	
}
