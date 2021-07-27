package day0726;

import java.util.Scanner;

public class Ex03Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 입력할 인원수를 먼저 입력후 그 인원수만큼 이름과 점수를 입력한후
		 * 입력한 데이터도 출력하고 전체 합계와 평균을 구하시오
		 */
		int num;
		String []name;
		int []score;
		int tot=0;
		double avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("인원수를 입력하시오");
		num=Integer.parseInt(sc.nextLine());
		name=new String[num];
		score=new int[num];

		for(int i=0;i<num;i++)
		{
			System.out.println(i+"번지 이름");
			name[i]=sc.nextLine();
			System.out.println(i+"번지 점수");
			score[i]=Integer.parseInt(sc.nextLine());
			tot+=score[i];
		}
		avg=(double)tot/num;
		System.out.println("번호\t이름\t점수\t");
		System.out.println("-----------------------------");
		for(int i=0;i<num;i++)
		{
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]);
		}
		System.out.println("------------------------------");
		System.out.println("총점 :"+tot);
		System.out.println("평균 :"+avg);





	}

}
