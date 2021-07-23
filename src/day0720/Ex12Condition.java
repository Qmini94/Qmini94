package day0720;

import java.util.Scanner;

public class Ex12Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 점수를 입력받아 90 이상이면 "참 잘했어요"
		 * 80 이상이면 "좀 더 노력하세요"
		 * 나머지는 "재시험!!"
		 */
		Scanner sc=new Scanner(System.in);
		int score;
		String mes;
		//점수입력 
		System.out.println("점수 입력");
		score =sc.nextInt();
		//if문으로 메시지 구현한뒤 출력 
		System.out.println("** if 문으로 구하기 **");
	
		if (score>90)
			mes="참 잘했어요";
		else if (score>80)
			mes="좀 더 노력하세요";
		else 
			mes="재시험";
		System.out.println(mes);
		//조건연상자로 메시지 구한뒤 출력 
		System.out.println("** 조건 연산자로 구하기 **");
		mes=score>=90?"참 잘했어요":score>=80?"좀더 노력하세요":"재시험";
		System.out.println(score+" 점의 평가는 "+mes);
		
	}

}
