package day0721;

import java.util.Scanner;

public class Ex02If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3과목의 점수를 입력후 평균을 구하고
		 * 평균이 60 이상이면서 각 과목이 모두 40 이상이면
		 * "당신은 합격입니다"라고 출력
		 * 아닐경우 "당신은 불합격입니다"라고 출력하시오
		 * 3과목 점수와 평균도 (소숫점 1자리) 출력하시오.
		 */
		
		//변수 선언
		Scanner sc=new Scanner(System.in);
		int kor,eng,mat;
		double avg;
		System.out.println("국어과목의 점수 입력");
		kor=sc.nextInt();
		System.out.println("영어과목의 점수 입력");
		eng=sc.nextInt();
		System.out.println("수학과목의 점수 입력");
		mat=sc.nextInt();
		
		avg=(kor+eng+mat)/3.0;
		System.out.printf("평균=%.1f\n",avg);
		if(avg>=60 && kor>=40 && eng>=40 && mat>=40)
			System.out.println("당신은 합격입니다");
		else 
			System.out.println("당신은 불합격입니다");
		
		
		
		
	}

}
