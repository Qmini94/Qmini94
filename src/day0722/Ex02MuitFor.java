package day0722;

public class Ex02MuitFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("다중 for문 break 연습 2");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println(i+":"+j);
			}
			if(i==2)
				break;//for i 영역, i 반복문을 빠져나온다 
			System.out.println();
		}

	}

}
