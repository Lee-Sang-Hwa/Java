package test.date;

import java.util.ArrayList;

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
public class TestAppointmentCollection {

	public static void main(String[] args) {
		ArrayList apps = new ArrayList();
		for(int i = 0; i < 10; i++) {
			if (i%2 == 0) {
				apps.add(new Appointment("����"+i, 2020, 7, (17+i), (11+i), 30));
			} else {
				apps.add(new Date(2020, 7, (17+i)));
			}
		}
		for (Object o : apps) {
			System.out.println(o); // o = o.toString(), toString�� �ڵ����� ����� => ������
		}
		Object sample = apps.get(0);
		
		// ���� : sample.setDay(500); => Object���� setDay()�� ����, ���� X. 
		//                             but date or appointment ��ü�̹Ƿ� ������ ����
		// Date converted = (Date)sample; // Date�� Appointment�� �θ��̱� ������, Appointment converted�� �Ұ�
		// Appointment�� ���� ������ instanceof ����ؼ� ��Ӱ��� Ȯ��
		
		if (sample instanceof Appointment) {
			Appointment converted = (Appointment) sample;
			converted.setMonth(2); converted.setDay(500);
			converted.print();
		}
		// sample.print(); => sample�� Object type, Object�� print �Լ� X 
		System.out.println(sample.toString());
		
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
