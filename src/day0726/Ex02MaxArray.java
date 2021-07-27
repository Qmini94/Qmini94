package day0726;

public class Ex02MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data= {12,34,64,74,24,52,83,65,46,75,76,54,23};
		int max,min;
		//일단 첫번쨰 데이타를 max와 min에 저장한다
		max=data[0];
		min=data[0];
		
		//1번지부터 끝까지 비교하며 더 큰값이나오면 max값변경
		for(int i=1;i<data.length;i++)
		{
			if(max<data[i])
				max=data[i];
			if(min>data[i])
				min=data[i];
		}
		System.out.println("최대값 :"+max);
		System.out.println("최소값 :"+min);

	}

}
