package day0723;

import java.util.Date;
import java.util.Scanner;

public class Ex09CalendarMunjae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 년도와 월을 입력후 달력 출력 
		 * 
		 * 요구사항
		 * 월이 1~12를 벗어나면 경고메시지와 함꼐 프로그램 종료
		 * 일요일부터~토요일 순으로 출력
		 * 달력을 만들기위해서 알아야할 사항
		 * 그년도의 그월이 몇일까지 있는가
		 * 그년도의 월이 무슨 요일인지(Date 클래스의 getDay를 이용)
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		Date date=new Date();
		int year,month;
		int days;//총일수 
		int week;//요일
		System.out.println("보고싶은 달력의 년도와 월을 입력 :");
		year=sc.nextInt();
		month=sc.nextInt();
		if (month<1 || month>12)
		{
			System.out.println("월을 잘못 입력 했어요!!");
			return;//메인 메서드 종료 
		}

		//윤년 구하기 
		
		switch(month)
		{
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			days=30;
			break;
		case 2 :
			if(year%4==0 && year%100!=0 || year%400==0)
				days=29;
			else
				days=28;
			break;
		default:
			days=30;
		}
		Date d1=new Date(year-1900,month-1,1);
		week=date.getDay();
		
		System.out.println("\t\t"+year+"년"+month+"월\n");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("============================================================");
		//요일 숫자만큼 탭띄우기
		for (int i=1;i<=week;i++)
			System.out.print("\t");
		for(int i=1;i<=days;i++)
		{
			week++;
			System.out.print(i+"\t");
			if(week%7==0)
				System.out.println();
		}
		
		
		
		

		

		
		

	}

}
