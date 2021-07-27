package day0726;

import java.util.Scanner;

public class Ex04ArrayRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 입력할 인원수를 먼저 입력후 그 인원수만큼 이름과 점수를 입력한후
		 * 등수를 구한다
		 * 입력한 데이터와 등수를 출력하고 전체 합계와 평균을 구하시오
		 */
		int num;
		String []name;
		int []score;
		int []rank;
		int tot=0;
		double avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("인원수를 입력하시오");
		num=Integer.parseInt(sc.nextLine());
		name=new String[num];
		score=new int[num];
		rank=new int[num];

		for(int i=0;i<num;i++)
		{
			System.out.println(i+1+"번지 이름");
			name[i]=sc.nextLine();
			System.out.println(i+1+"번지 점수");
			score[i]=Integer.parseInt(sc.nextLine());
			tot+=score[i];
		}
		//등수구하기(다중for문)
		for(int i=0;i<num;i++)
		{
			rank[i]=1;
			for(int j=0;j<num;j++)
			{
				if(score[i]<score[j])
					rank[i]++;
			}
		}
		avg=(double)tot/num;
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("-----------------------------");
		for(int i=0;i<num;i++)
		{
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
		System.out.println("------------------------------");
		System.out.println("총점 :"+tot);
		System.out.println("평균 :"+avg);





	}

}
