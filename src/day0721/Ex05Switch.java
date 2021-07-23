package day0721;

import java.util.Scanner;

public class Ex05Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문자열로 영어단어를 입력하면 한글로 출력 
		 */
		Scanner sc=new Scanner(System.in);
		String eword;
		System.out.println("영어단어 입력");
		eword=sc.nextLine();
		switch(eword)
		{
		case "apple":
			System.out.println("사과");
			break;
		case "strawberry":
			System.out.println("딸기");
			break;
		default:
			System.out.println("잠시만.....생각좀.....");
			
		}

	}

}
