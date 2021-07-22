package day0721;

import java.util.Scanner;

public class Ex04Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * 문자 1글자를 입력받아 a,A 인경우 "Apple"
		 * b,B 인경우 "Banana"
		 * 그 이외는 "모든 과일 좋아함"
		 */
		char fr;
		System.out.println("좋아하는 과일 첫글자를 영문자로 한글자만 입력");
		fr=sc.nextLine().charAt(0);//입력한 문자열중 0번(첫글자)를 char로 변환 
		switch(fr)
		{
		case 'a':
		case 'A':
			System.out.println("Apply 좋아함");
			break;
		case 'b':
		case 'B':
			System.out.println("Banana 좋아함");
		default:
			System.out.println("모든 과일 좋아함!");
			
		}

	}

}
