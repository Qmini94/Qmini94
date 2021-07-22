package day0720;

import java.util.Scanner;

public class Ex10Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 두수를 입력하여 더 큰수를 출력하시오 
		 * if 문과 조건연산자를 이용하여 결과를 출력해본
		 */
		Scanner sc=new Scanner(System.in);
		int x,y,max;
		System.out.println("두수 입력");
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("**if 문 **");
		if(x>y)
			max=x;
		else
			max=y;
		System.out.println("max="+max);
		System.out.println("** 조건 연산자 **");
		max=x>y?x:y;//	조건식?참일때 값:거짓일때 값 
		System.out.println("max="+max);

	}

}
