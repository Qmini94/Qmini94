package day0721;

public class Ex09For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<=10;i++)
			System.out.println(i+"  ");
		System.out.println("\n빠져나온후의 i값"+i);
		
		int a=10;
		for(;a<=50;a+=5)//초기값을 반복문 바깥에서 주었을경우 생략가능(;는 써야한다)
			System.out.println(a+"  ");
		System.out.println("\n빠져나온후의 값:"+a);
		
		//Hello 를 5번 출력 
		//for(int n=1; n<=5;n++)
		for(int n=5;n>=1;n--)
			System.out.println("Hello");
		
		
		System.out.println("1부터 10까지의 숫자중 짝수만 출력하기");
			for(int n=1;n<=10;n++)
			{
				if(n%2==0)
					System.out.println(n+"  ");
			}
				
		
		
		System.out.println("**  종료  **");
		
			

	}

}
