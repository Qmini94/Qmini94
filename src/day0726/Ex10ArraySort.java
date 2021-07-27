package day0726;

public class Ex10ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []names= {"이효리","강호동","유재석","진"};
		int []age= {35,43,45,28};
		//이름의 오름차순으로 출력하고자 한다
		//정렬 for문을 작성하시오(이름을 바꿀떄 나이도 같이 바꿔야함)
		
		for(int i=0;i<names.length;i++)
		{
			for(int y=i+1;y<names.length;y++)
				if(names[i].compareTo(names[y])>0)
				{
					String box=names[i];
					names[i]=names[y];
					names[y]=box;
					
					//이름행 변경시 나이도 같이 변경
					int n=age[i];
					age[i]=age[y];
					age[y]=n;				}
		}
//		for(int i=0;i<age.length;i++)
//		{
//			for(int y=i+1;y<age.length;y++)
//				if(age[i]<age[y])
//				{
//					int box=age[i];
//					age[i]=age[y];
//					age[y]=box;
//				}
//		}
		
		//출력
		System.out.println("번호\t이름\t나이");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(i+1+"\t"+names[i]+"\t"+age[i]);
		}

	}

}
