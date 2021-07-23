package day0722;

public class Ex09GuguGaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [2]	[3]	[4].....[9]
		 * 2x1=2
		 */
		for(int dan=2;dan<=9;dan++)
		{
			System.out.print("** "+dan+"단 **\t");
		}
		System.out.println();
		System.out.println();
		for(int i=1;i<=9;i++)
		{
			for(int dan=2;dan<=9;dan++)
			{
				System.out.print(dan+" x "+i+" = "+dan*i+"\t");
			}
			System.out.println();
		}
		
	}

}
