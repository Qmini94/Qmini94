package day0721;

import java.util.Scanner;

public class Ex12For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자 n을 입력받아 1부터 n까지의 합계를 구하시오(for문 이용)
		 */
		Scanner sc=new Scanner(System.in);
		int su;
		System.out.println("숫자 입력");
		su=sc.nextInt();
		int sum=0;
		for(int i=1;i<=su;i++)
			sum+=i;
			System.out.println("sum="+sum);
		

	}

}
