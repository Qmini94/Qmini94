package day0726;

import java.util.Scanner;

public class Ex11Munjae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String []ddi{원숭이,닭 ....}12개의 띠를 배열 저장
		 * 태어난 년도를 입력하면 해당년도와 함께 띠를 출력
		 * 23일 7번문제 참조
		 */
		String []ddi={"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","소","양"};
		Scanner sc=new Scanner(System.in);
		int y;
		while(true)
		{
			System.out.println("태어난년도 입력");
			y=sc.nextInt();
			for(int i=0;i<ddi.length;i++)
			{

					if(ddi[i]==ddi[y%12])
					{
						System.out.println(y+"년생은 "+ddi[i]+"띠입니다");
					}
				
			}

		}

	}

}
