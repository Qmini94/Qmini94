package day0720;

public class Ex06Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감연산자(단항) : ++,
		int m=5,n=5;
		//다른 연산자없이 사용할경우에는 전치,후치 결과가 같
		++m;//1 증가 
		n++;//1 증가 
		System.out.println(m+","+n);
		int a=++m;//전치일경우에는 먼저 증가후 대
		int b=n++;//후치일경우는 먼저 대입후 증
		System.out.println("m="+m);
		System.out.println("n="+n);
		System.out.println("a="+a);
		System.out.println("b="+b);//이것만 6
		
		int x=3;
		System.out.println(x++);//출력후 증가(3출력후 메모리에는 4로 저장)
		System.out.println(++x);//먼저 증가후 출력 
		
		int y=3;
		System.out.println(++y);//먼저 증가후 증가 
		System.out.println(y++);//먼저 출력후 증가(메모리에는 5로 저장)
		
		a=b=m=n=5; //대입연산자는 우측에서 좌측으로 대입 
		a*=++b-m--*++n;//전치 증감이 먼저 된후 곱하기 
		System.out.println(a);//-120
		
		
		
		

	}

}
