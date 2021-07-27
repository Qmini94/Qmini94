package day0723;

import java.util.Scanner;

public class Ex12Munjae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []arr2= {23,11,56,77,13,9,1,6,90,34,22};
		int inp;
		while(true)
		{
			System.out.println("숫자입력");
			inp=sc.nextInt();
			if(0 == inp)
				break;
			boolean find=false;//반복문 안에서 찾앗을경우 true로 변경할것
			//배열 갯수만큼 반복해서 입력한 숫자찾기
			for(int i=0;i<arr2.length;i++) {
				if(arr2[i] == inp)	
				{
					find=true;//찾았다는 의미로 true로 변경
					System.out.println("입력값:"+inp);
					System.out.println(inp+"는 "+(i+1)+"번째에 있어요!");
				}
			}
			if(!find)	//find==false
			{
				System.out.println(inp+"은 없습니다");
			}

		}
		System.out.println("종료합니다.");

		/*
		 * 문제: 숫자 inp를 입력받아 배열에 몇번째에 있는지 출력하고
		 * 없을경우 "없습니다"라고 출력하시오 (반복해서 입력하다가 0입력시 종료)
		 * (예)
		 * 입력값 :11
		 * 11은 2번째에 있어요!
		 * 입력값:100
		 * 100은 없습니다
		 * .
		 * .
		 * .
		 * 입력값:0
		 * 종료합니다.(프로그램 종료) 
		 */



	}

}
