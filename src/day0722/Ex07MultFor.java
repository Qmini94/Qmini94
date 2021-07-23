package day0722;

public class Ex07MultFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1****
		 * *2***
		 * **3**
		 * ***4*
		 * ****5
		 */
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
				System.out.print("*");
			for(int j=i;j<=i;j++)
				System.out.print(i);
			for(int j=i;j<=4;j++)
				System.out.print("*");
			
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=5;i++)//위코드와 같
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print(i);
				else
					System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<i;j++)
				System.out.print((char)('A'+j));
			
			System.out.println();
		}
		
		
		/*
		 * A
		 * AB
		 * ABC
		 * ABCD
		 * ABCDE
		 */

	}

}
