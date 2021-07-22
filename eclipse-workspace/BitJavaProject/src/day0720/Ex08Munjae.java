package day0720;

import java.util.Scanner;

public class Ex08Munjae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 월 급여를 입역하여 만원,천원,백원,십원,일원 갯수를 출력하시오 
		 * (예) 금액입력
		 * 		785913
		 * 		만원 : 78
		 * 		천원 : 5
		 * 		백원 : 9
		 * 		십원 : 1
		 * 		일원 : 3
		 */
	Scanner sc=new Scanner(System.in);
	int mn;
	System.out.println("월 급여를 입력하세요");
	mn=sc.nextInt();
	System.out.println("만원 : "+mn/10000);
	System.out.println("천원 : "+(mn%10000)/1000);
	System.out.println("백원 : "+(mn%1000)/100);
	System.out.println("십원 : "+(mn%100)/10);
	System.out.println("일원 : "+(mn%10));
	

	}

}
