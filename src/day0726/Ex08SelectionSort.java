package day0726;

public class Ex08SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자정렬
		int []data= {3,5,4,2,1};
		
		//오름차순 정렬 로직
		for(int i=0;i<data.length;i++)
			{

			for(int y=i+1;y<data.length;y++)
				if(data[i]>data[y])//오름차순정렬
				//if(data[i]<data[y])내림차순정렬
				{
					int box=data[i];
					data[i]=data[y];
					data[y]=box;
				}
			System.out.println(i+"->"+data[i]);

			}
		
		//출력
//		for(int i=0;i<data.length;i++)
//		{
//			System.out.println(i+"->"+data[i]);
//		}

	}

}
