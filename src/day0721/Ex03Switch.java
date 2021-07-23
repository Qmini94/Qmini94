package day0721;

import java.util.Scanner;

public class Ex03Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자를 입력후 1이면 one, 2면 two, 3이면 three
		 * 그 이외에는 'all'출력하기 
		 */
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("숫자 입력");
		num=sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default://1,2,3 이외 
			System.out.println("all");
		}
		
	}

}
