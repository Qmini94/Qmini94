package day0722;

public class Ex03MultFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("다중 for문 continue 연습 1");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j==2)
					continue;
				System.out.println(i+":"+j);
			}
			System.out.println();
		}

	}

}
