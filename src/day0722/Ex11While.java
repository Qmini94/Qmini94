package day0722;

public class Ex11While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		while(n<10)
		{
			System.out.println(n++);
		}
		System.out.println();
		n=1;
		while(n<10)
		{
			System.out.println(++n);
		}
		System.out.println();
		n=1;
		//1부터10까지 
		while(true)
		{
			System.out.println(n++);
			if(n>10)
				break;//11이 되면 빠져나온다 
		}

	}

}
