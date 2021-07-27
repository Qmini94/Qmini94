package day0726;

import java.util.Scanner;

public class Ex13Munjae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[]alpha=new int[26];
		 * 영문 문장을 입력후 분석하여 각 알파벳의 갯수를 구한후 출력하시오
		 * (예)Have a Nice Day!Goooooooood!
		 * A;3   b:0....Z:0
		 * (한줄에 알파벳 7개씩 출력)
		 * (힌트)문자열에서 한글자씩  추출charAt을 사용 
		 * 추출한글자가 B 일경우 alpha[1]++
		 * alpha['B'-'A']++
		 */
		Scanner sc=new Scanner(System.in);
		int []alpha=new int[26];//0으로초기화
		String msg;
		System.out.println("영문 문장 입력");
		msg=sc.nextLine();
		//각 글자를 추출하여 a(A)면 0번지 증가....
		for(int i=0;i<msg.length();i++)
		{
			//i번지에 해당하는 char 글자 추출
			char ch=msg.charAt(i);
			if(ch>='A' && ch<='Z')
				alpha[ch-'A']++;//대문자인경우 'A'를 뺴면 0~25의 값이 발생
			else if(ch>='a' && ch<='z')
				alpha[ch-'a']++;//소문자인경우 'a' 를 뺴면 0~25의 값이 발생
		}
		//한줄에 7개씩 배열값 출력하기
		for(int i=0;i<alpha.length;i++)
		{
			System.out.print((char)('A'+i)+":"+alpha[i]+"\t");
			//7개마다 라인넘기기
			if((i+1)%7==0)
				System.out.println();
		}

	}

}
