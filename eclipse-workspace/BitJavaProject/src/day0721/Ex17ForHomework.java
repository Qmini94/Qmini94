package day0721;

import java.util.Scanner;

public class Ex17ForHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//총 10개의 다양한 숫자를 입력받아 양수의 갯수와 음수의 갯수를 구하시오 
		Scanner sc=new Scanner(System.in);

		int su,sum=0,ss=0;
		for(int i=1;i<=10;i++)
			{
			
			System.out.print(i+" ");
			su=sc.nextInt();
			if(0<su) {
				ss++;

			}
			else if(0>su){
				sum++;
			}
			}
		System.out.println("양수의 갯수 :"+ss+"  음수의 갯수 :"+sum);
	}

}
