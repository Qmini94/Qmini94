package day0723;

import java.util.Date;

public class Ex08Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month,day;
		year=2020;
		month=5;
		//2020년 5월 1일의 요일 숫자 얻기 
		Date d1=new Date(year-1900,month-1,1);
		System.out.println("요일 숫자:"+d1.getDay());//5:금요일 
		
		
		
 
	}

}
