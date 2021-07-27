package day0726;

import java.util.Scanner;

public class Ex14lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 금액을 입력하면 금액에 해당하는 로또 숫자 발생
		 * 1000	원 미만이면 부족하다는 메세지 출력후 종료
		 */
		Scanner sc=new Scanner(System.in);
		int money;
		int []lotto= new int[6];
		System.out.println("로또를 구입할 금액 입력");
		money=sc.nextInt();
		if(money<1000)
		{
			System.out.println("돈이 부족해요!!!종료합니다");
			return;
		}
		//로또발생 횟숫 구하기
			int cnt=money/1000;
			int mod=money%1000;
			
			System.out.println("총 "+cnt+"회의 로또 발생!");
			System.out.println("거스름돈 :"+mod+"원");
			
			for(int i=1;i<=cnt;i++)
			{
				//각횟수별 로또 숫자 구하기
				for(int n=0;n<lotto.length;n++)
				{
					lotto[n]=(int)(Math.random()*45)+1;
					//중복숫자 체크
					for(int m=0;m<n;m++)
					{
						if(lotto[n]==lotto[m])
						{
							n--;
							break;
						}
					}
				}
				//오름차순 정렬
				for(int n=0;n<lotto.length;n++)
				{
					for(int m=n+1;m<lotto.length;m++)
					{
						if(lotto[n]>lotto[m])
						{
							int box=lotto[n];
							lotto[n]=lotto[m];
							lotto[m]=box;
						}
					}
				}
				//출력
				System.out.printf("%2d 회 : ",i);
				for(int n=0;n<lotto.length;n++)
				{
					System.out.printf("%4d",lotto[n]);
				}
				System.out.println();
			}

	}

}
