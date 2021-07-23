package day0720;

import java.util.Scanner;

public class Ex14Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String sang;
		int su,dan,dc;
		System.out.println("상품명과 수량, 단가를 입력");
		sang=sc.nextLine();
		su=sc.nextInt();
		dan=sc.nextInt();
		System.out.println("상품 : "+sang);

		System.out.println("수량 : "+su+"개");

		System.out.println("단가 : "+dan+"원");
		
		System.out.println("총금액 : "+dan*su+"원");
		if (su>=5)
			{
			dc=dan*su*9/10;
			System.out.println("DC된 금액 : "+dc);
			}
			
		
		

	}

}
