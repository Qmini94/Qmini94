package day0721;

import java.util.Scanner;

public class Ex16ForHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두수 x,y를 입력후 x의 y승을 for문을 이용해서 구하시오
		Scanner sc=new Scanner(System.in);
		int x,y,sum=1;
		x=sc.nextInt();
		y=sc.nextInt();
		for(int i=1;i<=y;i++)
			sum=sum*x;
			
			
		System.out.println(sum);

	}

}
