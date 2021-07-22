package day0722;

public class Ex01MuitFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 아래 다중 for문은 i 가 1일j가 4번 반복, 다시 i가 2일때 
		 * j는 다시 반복 ...이런식으로 이중으로 반복되는 구조이
		 */
		for(int i=1;i<=3;i++)
		{
			System.out.println(i+":Happy");
			for(int j=1;j<=4;j++)
			{
				System.out.println("\t"+j+" :Java");
			}
			System.out.println();
		}

	}

}
