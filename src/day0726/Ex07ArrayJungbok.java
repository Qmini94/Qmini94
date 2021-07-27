package day0726;

import java.util.Random;

public class Ex07ArrayJungbok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int []data=new int[20];
		/*
		 * 배열에 1부터 50사이의 난수를 구해서 넣은후
		 * 한줄에 5개씩 출력하시오
		 * 단,같은 숫자일 경우 그 배열번지는 다시 구하세요(중복체크)
		 * 
		 * (결과 예)
		 * 0:5   1:12   2:45    3:39	4:50
		 * 5:23	....................
		 */
		for(int i=0;i<data.length;i++)
		{
			data[i]=r.nextInt(50)+1;
			//중복처리
			for(int j=0;j<i;j++)
			{
				if(data[i]==data[j])
				{
					i--;//다시 그번지수에 난수를 구하기 위해서 1을 뺀다
					break;
				}
			}

		}
		for(int i=0;i<data.length;i++)
		{
			System.out.print(i+":"+data[i]+"\t");
			if((i+1)%5==0)
				System.out.println();
		}

	}

}
