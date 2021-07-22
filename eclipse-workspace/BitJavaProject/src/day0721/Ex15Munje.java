package day0721;

import java.util.Scanner;

public class Ex15Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 총 5개의 점수를 입력받아 합계를 구하려고한 만약
		 * 1~100이 아닐경우 다시 입력받으시오(continue사용) 
		 * (예)
		 * 1번 점수 : 90
		 * 2번 점수 : 120
		 * 		잘못 입력했어요
		 * 2번 점수 : 80
		 * .....
		 * 5번까지 입력후 총 합계 출력하기 
		 */
		Scanner sc=new Scanner(System.in);
		int jum,sum=0;

		for (int i=1;i<=5;i++)
		{
			jum=sc.nextInt();
			System.out.println(i+"번 점수:"+jum);
			if(jum<1 || jum>100)
			{
				System.out.println("잘못입력했어요");
				i--;
				continue;
			}
			sum+=jum;

			
		}
		System.out.println("총점 : "+sum);
		
			
		
		

	}

}
