package day0722;

public class Ex10While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("while 문은 선조건,di~while은 후조건");
		int a=10;
		System.out.println("while");
		while(a<10)//조건 자체가 false인 경우 한번도 실행안함 
		{
				System.out.println(a++);
		}
		System.out.println("-------------");
		System.out.println("do while");
		int b=10;
		do {
			System.out.println(b++);
		}while(b<10);//먼저 실행후 조건비교하기 때문에 최소 한번은 실행 

	}

}
