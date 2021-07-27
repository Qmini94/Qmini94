package day0726;

public class Ex01Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 배열
		String []str1= {"장미꽃","안개꽃","다알리아","국화꽃","후리지아"};
		String []str2=new String[5];//
		str2[0]="빨간색";
		str2[2]="노랑색";
		str2[4]="분홍색";
		
		//출력 1(변수 i를 이용해서 출력)
		System.out.println("str1 출력 #1");
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]+" ");
		}
		System.out.println();
		System.out.println("str1 출력 #2");
		for(String s:str1)
			System.out.println(s+" ");
		System.out.println();
		
		System.out.println("str2 출력 #1");
		for(int i=0;i<str2.length;i++)
		{
			System.out.println(str2[i]+" ");
		}
		System.out.println();
		System.out.println("str2 출력 #2");
		for(String ss:str2)
			System.out.println(ss+" ");
		System.out.println();
		
		

	}
}
