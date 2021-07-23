package day0722;

public class Ex05MultFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("** 다중 for 문으로 star(*) 출력하기");
		for(int i=1;i<=5;i++)//행갯수 
		{
			for(int j=1;j<=5;j++)//열갯수 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)//행갯수 
		{
			for(int j=5;j>=i;j--)//열갯수 (i값 만큼만 반복)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}
	

}
