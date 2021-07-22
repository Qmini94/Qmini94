package day0721;

import java.util.Scanner;

public class Ex01Yoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 년도와 월을 입력받아 그해가 윤년인지 평년인지 출력하고
		 * 해당달이 몇일까지 있는지 출력하시오  
		 */
		Scanner sc=new Scanner(System.in);
		int year,month,days;
		boolean flag;
		System.out.println("년도와 월을 입력해주세요");
		year=sc.nextInt();
		month=sc.nextInt();
		//월 잘못 입력시 프로그램 종료 
		if (month<1 || month>12)
		{
			System.out.println("월을 잘못 입력 했어요!!");
			return;//메인 메서드 종료 
		}

		//윤년 구하기 
		flag=year%4==0 && year%100!=0 || year%400==0;
		//if(flag==true)
		if(flag)//true 는 생략가능(false인 경우는 보통 if (!flag) 이런식으로 쓴
			System.out.println(year+"년도는 윤년입니다");
		else
			System.out.println(year+"년도는 평년입니다");
		//해당 년도의 월이 몇일까지 있는지 구하기 
		if (month==4||month==6||month==9||month==11)
			days=30;
		else if (month==2) {
			if(flag)//윤년일 경우는 29일까지 있다 
				days=29;
			else
				days=28;
		}else//나머지는 모두 큰달
		{
			days=31;
		}
		
		
		System.out.println(year+"년 "+month+"월은 "+days+"일까지 있습니다.");
		System.out.println("** 종료 **");
	}

}
