package day0721;

import java.util.Scanner;

public class Ex18ForHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자를 입력시 팩토리알 값을 구하시오
		//예 5입력시 5!=120
		Scanner sc=new Scanner(System.in);
		int su,sum=1;
		System.out.println("숫자 입력");
		su=sc.nextInt();
		for(int i=1;i<=su;i++)
			sum=sum*i;
		System.out.println(su+"!="+sum);
			

	}

}
