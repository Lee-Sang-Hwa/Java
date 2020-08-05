package test.object;

import java.util.Arrays;

public class Date {
	
	//Encapsulation(���м�), �ܺο��� �������� ���ϵ��� ��
	private int [] lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private int year = 2000;
	private int month = 2; // private�� �����ϱ� ���ؼ� getter, setter�� ������ش�
	private int day = 0;
	
	/**
	 * ������ - new(������:��ü �޸𸮸� ����)�� �Բ� ������ ��ü�� ����� �ʱ�ȭ
	 * @param i -> year
	 * @param j -> month
	 * @param k -> day
	 */
	
	public Date (int i, int j, int k) {
		setYear(i); setMonth(j); setDay(k);
	}

	@Override
	public String toString() {
		return getYear() + "�� " + 
				+ getMonth() + "�� "
				+ getDay() + "�� ";
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
	
	public Date() { // �����ε�, ������ : Ÿ���� ����, �̸��� ����, arg�� �޶� ��, arg�� ������ �浹
		// TODO Auto-generated constructor stub
	}

	
	void printLastDay() // over-loading (����:argument�� �ٸ� �Լ�)
	{
		System.out.println(getMonth() + "���� ������ ��¥��" + lastDay[getMonth()-1] + "���Դϴ�.");
	}
	
	void printLastDay(int month) {
		
		System.out.println(month + "���� ������ ��¥��" + lastDay[month-1] + "���Դϴ�.");
		
	}

	public void print() {
		System.out.println(year+"��"+getMonth()+"��"+day+"��");
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
	 * ���� ����
	 * ���� ������ 1 ~ 12��.
	 * 1���� ���� ���� 1��, 12���� ū ���� 12�� ������.
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
	 * ��(��¥)�� ����
	 * ���� ������ 1 ~ lastDay[month-1]��.
	 * 1���� ���� ���� 1��, lastDay[month-1]���� ū ���� 
	 * lastDay[month-1]�� ������.
	 * @param month : 1 <= month <= lastDay[month-1]
	 */
	
	public void setDay(int day) {
		checkLuna();
		day = day>lastDay[month-1] ? lastDay[month-1] : day < 1 ? 1 : day;
		this.day = day;
	}

	/**
	 * ������ �˻��ؼ� lastDay[1(2���� ��)]�� �� ����
	 * ���� ����
	 * 0. �⺻ : 2���� ������ ���� 28��
	 * 1. ������ 4�� ���� �������� 0 �̸� 2���� 29�ϱ���
	 * 2. ������ 100���� ���� �������� 0 2���� 28�ϱ���
	 * 3. ������ 400���� ���� �������� 0 2���� 29�ϱ���
	 */
	
	private void checkLuna() {
		
		if((year % 4 == 0)&&(year % 100 == 0)&&(year % 400 == 0)){
			lastDay[1] = 29;	
		}else lastDay[1] = 28; 
		
		//int ckln = day != 28 ? day : (year%4==0) ? 29 : (year % 100 == 0) ? 28 : (year % 400 == 0) ? 29 : day ;
		//return ckln;
	}
	
}
