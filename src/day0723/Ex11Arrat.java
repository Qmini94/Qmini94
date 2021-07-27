package day0723;

public class Ex11Arrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1=new int[5];//0으로 초기갑이 들어간다 
		arr1[1]=10;
		arr1[4]=34;
		for(int n:arr1)
			System.out.println(n);
		
		System.out.println();
		//방법2 
		int []arr2= {23,11,56,77,13,9};//선언시 갑 직접 할당
		System.out.println("배열갯수:"+arr2.length);
		System.out.println("출력 #1");
		for(int i=0;i<arr2.length;i++)
			System.out.printf("%5d",arr2[i]);
		System.out.println();
		System.out.println("출력 #2");
		for(int a:arr2)
			System.out.printf("%5d",a);

	}

}
