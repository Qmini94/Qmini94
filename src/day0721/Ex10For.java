package day0721;

public class Ex10For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 100까지의 합 구하기	
		int sum=0;
		for(int i=1;i<=100;i++)
			sum+=i;//sum=sum+1
		System.out.println("sum="+sum);
		
		//1부터 100까지의 숫자중 짝수의 합과 홀수의 합을 나눠서 출력 
		int esum=0;//짝수 구할 변수
		int osum=0;//홀수 구할 변수
		for(int i=1;i<=100;i++)
			if(i%2==0)
			{
				esum+=i;
			}
		System.out.println("esum="+esum);
		for(int i=1;i<=100;i++)
			if(i%2==1)
			{
				osum+=i;
			}
		System.out.println("osum="+osum);

	}

}
