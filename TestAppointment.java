package test.date;

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
public class TestAppointment {

	public static void main(String[] args) {
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
