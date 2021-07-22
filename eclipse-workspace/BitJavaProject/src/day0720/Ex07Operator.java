package day0720;

import java.util.Scanner;

public class Ex07Operator {

	public static void main(String[] args) {

		//두수를 입력후 산술 연산자를 이용하여 계산해보자 
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("두 수를 입력해주세요");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("더하기"+(x+y));
		System.out.println("빼기"+(x-y));
		System.out.println("곱하기"+(x*y));
		System.out.println("나누기"+(double)x/y);
		System.out.println("나머지"+(x%y));
		
	}

}
