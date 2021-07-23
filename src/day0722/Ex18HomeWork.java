package day0722;

import java.util.Random;
import java.util.Scanner;

public class Ex18HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * while문 사용 while문 안에서 대문자를 임의로 출력한후 그문자를 입력하여 맞을경우
		 * cnt 변수 1증가 입력시 q나 Q를 입력하면 빠져나온후
		 * 총 알파벳 10개중 5개 맞춤 
		 */
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int cnt=0,su=0;
		String a;
		while(true)
		{
			
				int n=r.nextInt(26)+65;
				System.out.println((char)n);
				System.out.println("맞추기 :");
			a=sc.nextLine();
			if(a.charAt(0)=='q' || a.charAt(0)=='Q')//a.charAt(0):입력하는 문자열의 첫글자만 얻기 
				break;
			if(a.charAt(0) == n)
			cnt++;
			su++;
			
		}
		System.out.println("총"+su+"문제중"+cnt+"개 맞음");
		
	}

}
