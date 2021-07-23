package day0722;

import java.util.Random;
import java.util.Scanner;

public class Ex19HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Random클래스 사용
		 * 1~100사이의 임의의 난수를 변rnd애 저장후
		 * 그 숫자 알아맞추기
		 * (예)
		 * 50이라는 난수가 rnd에 저장되어있다 할경우
		 * 1:40
		 * 40보다 큽니다
		 * 2:70
		 * 70보다 작습니다
		 * 3:50
		 * 짝짝짝.정답입니다(출력후 while문 빠져나가기)
		 */
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		int rnd;
		int su,sum;

		Exit:
			while(true)
			{
				sum=1;
				rnd=r.nextInt(100)+1;

				while (true)
				{
					System.out.println(sum+":");
					su=Integer.parseInt(sc.nextLine());
					if(rnd == su)
						break;
					if(rnd > su)
						System.out.println(su+"보다 큽니다");
					if(rnd < su)
						System.out.println(su+"보다 작습니다");
					sum++;
				}
				System.out.println("짝짝짝.정답입니다.");
				System.out.println("계속하려면 y를 눌러주세요");
				char ans=sc.nextLine().charAt(0);
				if(ans == 'y' || ans == 'Y')
				{
					System.out.println("새로운 난수를 발생합니다");
					continue Exit;//바깥쪽 while문의 조건식으로 이
				}else {
					System.out.println("**종료**");
					break Exit;
				}
			}
	}

}
