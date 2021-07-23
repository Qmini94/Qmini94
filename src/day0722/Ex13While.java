package day0722;

import java.util.Scanner;

public class Ex13While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while문에서 continue를 만나면 조건식으로 이동한다
		//조건식이 true인경우 첫번째둘의 코드부터 가시 실행된다
		
		/*
		 * 점수를 입력받는데 1~100이 아닌경우 다시 입력받기
		 * 그리고 제대로 입력된 점수의 갯수 구하기
		 * 점수가 0이면 while문을 빠져나온다<제일먼저  
		 */
		Scanner sc=new Scanner(System.in);
		int score;
		int cnt=0;
		while(true)
		{
			System.out.println("점수 입력");
			score=sc.nextInt();
			if(score==0)
				break;//0을 입력시 반복문을 빠져나가서 갯수 출력 
			if(score<1 || score>100)
				continue;//조건식으로 이동인데 조건이 true임으로 첫줄부터 다시 실행 
			
			//제대로 입력시 갯수 증가
			cnt++;
			System.out.println("입력된 점수는 "+score+"입니다");
		}
		System.out.println("입력된 점수의 갯수: "+cnt);
		
	}

}
