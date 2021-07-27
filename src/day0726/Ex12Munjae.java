package day0726;

import java.util.Random;

public class Ex12Munjae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[]lotto=new int[6]
		 * lotto배열에 1~45사이의 난수를 발생시킨후 오름차순으로 출력하시오
		 * 단,중복숫자가 발생하면 다시 구하세요
		 */
		int[]lotto=new int[6];
		Random r=new Random();
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=r.nextInt(45)+1;
			for (int y=0;y<i;y++)
			{
				if(lotto[i]==lotto[y])
				{
					i--;
					break;
				}
			}
		}
		for(int i=0;i<lotto.length-1;i++)
		{
			for(int y=i+1;y<lotto.length;y++)
			{
				if(lotto[i]>lotto[y])
				{
					int box=lotto[i];
					lotto[i]=lotto[y];
					lotto[y]=box;	
				}
			}
		}
		for(int i=0;i<lotto.length;i++)
		{
			System.out.printf("%5d",lotto[i]);
		}
		
	}

}
