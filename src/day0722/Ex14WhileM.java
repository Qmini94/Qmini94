package day0722;

import java.util.Scanner;

public class Ex14WhileM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.나이를 반복해서 입력받는다
		 * 2.0이 입력되면 빠져나와 출력한다
		 * 3.나이가 50 이상일 경우 a변수 증가
		 * 		30이상일경우 b변수 증가
		 * 		그 나머지는 c변수증가
		 * 4.빠져나온후 출력내용
		 * 		50세이상:3명
		 * 		30세 이상:2명
		 * 		그 이외 :1명  
		 */
		Scanner sc=new Scanner(System.in);
		int a=0,b=0,c=0,age;
		while(true)
		{
			System.out.println("나이 입력");
			age=sc.nextInt();
			if (age==0)
				break;
			if (age>1 && age<30) a++;
			if (age>=30 && age<50) b++;
			if (age>=50) c++;
			
			

		}
		System.out.println("50세 이상 : "+c+"명");
		System.out.println("30세 이상 : "+b+"명");
		System.out.println("그 이외 : "+a+"명");

	}

}
