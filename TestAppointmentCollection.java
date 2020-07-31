package test.date;

import java.util.ArrayList;

import test.object.Date;

/**
 * 일정관리용 API
 * 일정 : 제목, 날짜(y,m,d), 시간, 분 
 * 일정 : 제목 : subject, 시간 : hour, 분 : min
 * 사용 : 일정 약속 : 점심, 회식
 * 1. 점심 약속 데이터 생성
 * 2. 회식 약속 데이터 생성
 * 3. 오늘의 약속 출력
 * 
 * @author User
 *
 */
public class TestAppointmentCollection {

	public static void main(String[] args) {
		ArrayList apps = new ArrayList();
		for(int i = 0; i < 10; i++) {
			if (i%2 == 0) {
				apps.add(new Appointment("점심"+i, 2020, 7, (17+i), (11+i), 30));
			} else {
				apps.add(new Date(2020, 7, (17+i)));
			}
		}
		for (Object o : apps) {
			System.out.println(o); // o = o.toString(), toString은 자동으로 실행됨 => 다형성
		}
		Object sample = apps.get(0);
		
		// 목적 : sample.setDay(500); => Object에는 setDay()가 없음, 실행 X. 
		//                             but date or appointment 객체이므로 실제는 존재
		// Date converted = (Date)sample; // Date는 Appointment의 부모이기 때문에, Appointment converted는 불가
		// Appointment로 쓰고 싶으면 instanceof 사용해서 상속관계 확인
		
		if (sample instanceof Appointment) {
			Appointment converted = (Appointment) sample;
			converted.setMonth(2); converted.setDay(500);
			converted.print();
		}
		// sample.print(); => sample은 Object type, Object에 print 함수 X 
		System.out.println(sample.toString());
		
		Appointment lunch = new Appointment("점심", 2020, 7, 17, 11, 30);
		Appointment dinner = new Appointment("회식", 2020, 7, 17, 18, 30);
		
		//상속 : 자식객체 is a 부모객체
		
		Date lunch1 = new Date(2020, 7, 17);
		Date dinner1 = new Appointment("회식", 2020, 7, 17, 18, 30);
		Appointment lunch2 = lunch;
		// lunch2 = (Appointment) lunch1; // 컴파일 OK, but Runtime Exception 발생
		
		if (lunch1 instanceof Appointment) { // Runtime data type을 체크하는 연산자
			lunch2 = (Appointment) lunch1;
		}
		
		lunch.print(); dinner.print();
	}

}
