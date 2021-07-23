package day0720;

import java.util.Scanner;

public class Ex11Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3수를 입력하여 더 큰수를 출력하시오 
		 * if 문과 조건연산자를 이용하여 결과를 출력해본
		 */
		Scanner sc=new Scanner(System.in);
		int x,y,z,max;
		System.out.println("세개의 수 입력");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		System.out.println("**if 문 **");
		if(x>y && x>z)
			max=x;
		else if (y>x && y>z)
			max=y;
		else
			max=z;
		System.out.println("max="+max);
		System.out.println("** 조건 연산자 **");
		max=x>y&&x>z?x:y>x&&y>z?y:z;//	조건식?참일때 값:거짓일때 값 
		System.out.println("max="+max);

	}

}
