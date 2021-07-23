package day0721;

import java.util.Scanner;

public class Ex13Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * 구구단 dan을 입력받은후 2~9가 아닐경우에는
		 * "잘못 입욕했어요. 종료합니다"출력후 프로그램 종료
		 * 그 이외에는 구구단 출력 (예) 5입력시
		 * **5단**
		 * 5 x 1 =5
		 * 5 x 2 =10
		 * ......
		 */
		int dan;
		dan=sc.nextInt();
		if(dan<2 || dan>9)
		{
			System.out.println("잘못된 숫자입니다.종료합니다");
			return;
		}
		System.out.println("**"+dan+"단 **");
		for(int i=1;i<=9;i++)
		{
			//System.out.printf("%d x %d = %2d\n",dan,i,dan*i);
			System.out.println(dan+"x"+i+"="+dan*i);
		}

			

	}

}
