package day0721;

import java.util.Scanner;

public class Ex07Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자를 입력받아 그 숫자가 짝수인지 홀수인지 출력하는데
		 * if로도 구해서 출력하고 switch로도 구해서 출력해보세
		 */
		Scanner sc=new Scanner(System.in);
		int su;
		System.out.println("숫자 입력");
		su=sc.nextInt();
		if(su%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		switch(su%2)
		{
		case 0:
			System.out.println("짝수!!");
			break;
		case 1:
			System.out.println("홀수!!");
		}
			
		
		

	}

}
