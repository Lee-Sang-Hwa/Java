package test.date;

import test.object.Date;

/**
 * ���������� API
 * ���� : ����, ��¥(y,m,d), �ð�, �� 
 * ���� : ���� : subject, �ð� : hour, �� : min
 * ��� : ���� ��� : ����, ȸ��
 * 1. ���� ��� ������ ����
 * 2. ȸ�� ��� ������ ����
 * 3. ������ ��� ���
 * 
 * @author User
 *
 */
public class TestAppointment {

	public static void main(String[] args) {
		Appointment lunch = new Appointment("����", 2020, 7, 17, 11, 30);
		Appointment dinner = new Appointment("ȸ��", 2020, 7, 17, 18, 30);
		
		//��� : �ڽİ�ü is a �θ�ü
		
		Date lunch1 = new Date(2020, 7, 17);
		Date dinner1 = new Appointment("ȸ��", 2020, 7, 17, 18, 30);
		Appointment lunch2 = lunch;
		// lunch2 = (Appointment) lunch1; // ������ OK, but Runtime Exception �߻�
		
		if (lunch1 instanceof Appointment) { // Runtime data type�� üũ�ϴ� ������
			lunch2 = (Appointment) lunch1;
		}
		
		lunch.print(); dinner.print();
	}

}
