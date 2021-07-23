package day0723;

import java.util.Calendar;

public class Ex06Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();//생성자가 public이 아니므로 new로 생성안됨 
		int y=cal.get(Calendar.YEAR);
		int m=cal.get(Calendar.MONTH);
		int d=cal.get(Calendar.DATE);
		int hh=cal.get(Calendar.HOUR);
		int mm=cal.get(Calendar.MINUTE);
		int week=cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("오늘날짜:"+y+"-"+m+"-"+d);
		System.out.println("현재시간 :"+hh+":"+mm);
		System.out.println("요일숫자 :"+week);
		
		switch(week)
		{
		case Calendar.SUNDAY:
			System.out.println("오늘은 일요일입니다");
			break;
		case Calendar.MONDAY:
			System.out.println("오늘은 월요일입니다");
			break;
		case Calendar.TUESDAY:
			System.out.println("오늘은 화요일입니다");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("오늘은 수요일입니다");
			break;
		case Calendar.THURSDAY:
			System.out.println("오늘은 목요일입니다");
			break;
		case Calendar.FRIDAY:
			System.out.println("오늘은 금요일입니다");
			break;
		case Calendar.SATURDAY:
			System.out.println("오늘은 토요일입니다");
			break;
			
		}

	}

}
