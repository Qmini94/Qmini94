package day0721;

public class Ex11For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**다양한 방법으로 알파벳 대문자 출력하기");
		for(int i=65;i<=90;i++)
		{
			System.out.print((char)i+" ");
		}
		System.out.println();
		for(int i=65;i<=90;i++)
		{
			System.out.printf("%c ",i);
		}
		System.out.println();
		for(char a='A';a<='Z';a++)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		

	}

}
