package day0726;

public class Ex09SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []colors= {"green","red","yellow","gray","blue","white"};
		
		for(int i=0;i<colors.length;i++)
		{
			for(int y=i+1;y<colors.length;y++)
			{
				if(colors[i].compareTo(colors[y])>0)
				//if(colors[i].compareTo(colors[y])>colors[y].compareTo(colors[i]))
				{
					String box=colors[i];
					colors[i]=colors[y];
					colors[y]=box;
				}
			}
			System.out.println(i+"=>"+colors[i]);
		}
		
		

	}

}
