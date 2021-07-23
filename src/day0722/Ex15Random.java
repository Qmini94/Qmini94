package day0722;

public class Ex15Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자바에서 난수를 구하는방법 두가지
		 * 1.Math.random() 메서드를 이용하는 방법
		 * 2.Random 이라는 클래스를 생성해서 구하는 방법 
		 */
		System.out.println("기본 난수 5개 발생");
		for(int i=1;i<=5;i++)
		{
			double a=Math.random();
			System.out.println(a);
		}
		System.out.println("--------------");

		System.out.println("0~9 사이의 난수 5개 발생");
		for(int i=1;i<=5;i++)
		{
			int a=(int)(Math.random()*10);//0~9
			System.out.println(a);
		}
		System.out.println("--------------");
		
		System.out.println("기본 난수 5개 발생");
		for(int i=1;i<=5;i++)
		{
			 int a=(int)(Math.random()*26)+65;
			System.out.println(a);
		}
		System.out.println("--------------");
		
		System.out.println("기본 난수 5개 발생");
		for(int i=1;i<=5;i++)
		{
			int a=(int)(Math.random()*26)+65;
			System.out.println((char)a);
		}
		System.out.println("--------------");



	}

}
