package chap5.referencevar;

import java.util.Calendar;
/*
 * 자바에서 제공하는 날짜, 요일, 시간을 사용할 수 있는 클래스
 */
public class CalendarAPI {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();	// Calendar객체를 리턴하는 메서드
		
		int year = now.get(Calendar.YEAR);			//년
		int month = now.get(Calendar.MONTH);		//월
		int day = now.get(Calendar.DAY_OF_MONTH);	//일(1~31)
		int week = now.get(Calendar.DAY_OF_WEEK);	//요일(1~7)
		int hour = now.get(Calendar.HOUR);			//시
		int minute = now.get(Calendar.MINUTE);		//분
		int second = now.get(Calendar.SECOND);		//초
	}
}
