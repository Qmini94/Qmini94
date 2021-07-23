package day0721;

import java.util.Scanner;

public class Ex08Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 점수를 입력후 학점을 구하는데 switch문을 이용해서
		 * 구해보시오 
		 */
		Scanner sc=new Scanner(System.in);
		int score;
		char grade;
		
		//점수 입력 
		System.out.println("점수 입력");
		score=sc.nextInt();
		
		//switch로 grade 변수에 학점구하기 
		switch(score/10)
		{
		case 10 :
		case 9 :
			grade='A';
			break;
		case 8 :
			grade='B';
			break;
		case 7 :
			grade='C';
			break;
		case 6 :
			grade='D';
			break;

		default :
			grade='F';
		
		
		}
		
		//출력 
		System.out.println(grade);

	}

}
