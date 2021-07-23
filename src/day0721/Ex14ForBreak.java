package day0721;

public class Ex14ForBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문에서 break를 만나면 제일 가까운 반복문을 빠져나간
		for(int i=1;i<=10;i++)
		{
			if(i%5==0)
				break;//5에서 빠져나온다 
			System.out.print(i+" ");
		}
		System.out.println();
		
		//continue : for문에서 continue	를 만나면 증감식으로 이동한다
		for(int i=1;i<=10;i++)
		{
			if(i%5==0)
				continue;//5의 배수일경우 증감식으로 이동 (i++)
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
