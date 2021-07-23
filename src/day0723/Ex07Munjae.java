package day0723;

import java.util.Date;
import java.util.Scanner;

public class Ex07Munjae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 태어난 년도를 입력받아 나이와 띠를 구하시오
		 * (힌트:서기 1년은 닭띠해이다)
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		Date date=new Date();
		int y,age;
		System.out.println("태어난 년도를 입력");
		y=sc.nextInt();
		int year=date.getYear()+1900;
		System.out.println("현재 나이는 "+(year-y+1)+"살입니다");
		
		
		switch(y%12)
		{
		case 0:
			System.out.println("원숭이띠입니다");
			break;
		case 1:
			System.out.println("닭띠입니다");
			break;
		case 2:
			System.out.println("개띠입니다");
			break;
		case 3:
			System.out.println("돼지띠입니다");
			break;
		case 4:
			System.out.println("쥐띠입니다");
			break;
		case 5:
			System.out.println("소띠입니다");
			break;
		case 6:
			System .out.println("호랑이띠입니다");
			break;
		case 7:
			System.out.println("토끼띠입니다");
			break;
		case 8:
			System.out.println("용띠입니다");
			break;
		case 9:
			System.out.println("뱀띠입니다");
			break;
		case 10:
			System.out.println("소띠입니다");
			break;
		case 11:
			System.out.println("양띠입니다");
			break;
		}
		
		

	}

}
