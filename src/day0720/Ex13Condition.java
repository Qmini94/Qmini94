package day0720;

import java.util.Scanner;

public class Ex13Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 년도를 입력하면 해달 년도가 윤년인지 평년인지 출력하시
		 */
		Scanner sc=new Scanner(System.in);
		int year;
		
		//입력
		System.out.println("년도 입력");
		year=sc.nextInt();
		
		
		//윤년인지 평년인지 조건문 주기 
		if(year%4==0 && year%100!=0 || year%400==0)
			System.out.println(year+"년도는 윤년입니다");
		else
			System.out.println(year+"년도는 평년입니다");
		
	}

}
