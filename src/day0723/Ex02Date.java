package day0723;

import java.util.Date;

public class Ex02Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		int y=date.getYear()+1900;//년도는 현재년도 -1900반환 
		int m=date.getMonth()+1;//월은 0~11 반환 
		int d=date.getDate();
		int hh=date.getHours();
		int mm=date.getMinutes();
		int week=date.getDay();
		System.out.println("오늘 날짜:"+y+"-"+m+"-"+d);
		System.out.println("현재시간 :"+hh+":"+mm);
		System.out.println("요일숫자 :"+week);
		System.out.println("오늘은 "+
				(week==0?"일":week==1?"월":week==2?"화":week==3?"수":
			week==4?"목":week==5?"금":week==6?"토":"일")
		+"요일입니다");

	}

}
