package day0722;

import java.util.Scanner;

class Ex17While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	점수를 반복해서 입력하다가 q나 Q를 입력하면
		 * 	while문을 빠져나온후 총 갯수,총점,평균을 구해서 출력하시오 
		 */
		Scanner sc=new Scanner(System.in);
				String score;
		int sum=0,cnt=0;
		double avg;
		while(true)
		{
			System.out.println("점수 입력");
			score=sc.nextLine();
			//입력한 문자열의 첫글자가 q 거나 Q면 반복문을 빠져나가기
			if(score.charAt(0)=='q' || score.charAt(0)=='Q')
				break;
			cnt++;
			sum+=Integer.parseInt(score);//정수로 변환후 함계변수에 더하기
		}
		//평균은 총점을 갯수로 한번만 나누면 되므로 나와서 계산해도 된다
		avg=(double)sum/cnt;//둘다 정수타입이므로 정확하게 나오게 하기위해서 double로 형변환
		System.out.println("**결과 출");
		System.out.println("점수 갯수 : "+cnt);
		System.out.println("총점 : "+sum);
		System.out.printf("평균 : %.1f\n",avg);

	}

}
