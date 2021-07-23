package day0720;

import java.util.Scanner;

public class Ex15Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score;
		char jum;
		System.out.println("점수 입력");
		score= sc.nextInt();
		jum=score>=90?'A':score>=80?'B':score>=70?'C':score>=60?'D':'F';
		
		System.out.println("[결과]");
		System.out.println(score+"점은 "+jum+"학점입니다");
		
		

	}

}
