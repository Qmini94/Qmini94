package day0722;

public class Ex04MultForLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exit: //레이블, 이름은 자기 마음대로
			for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=4;j++)
				{
					System.out.println(i+":"+j);
					if(j==3)
						break Exit;//바깥쪽 for문을 빠져나간다 
				}
			}
		System.out.println("다중 for문 레이블을 이용한 continue");
		Loop:
			for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=4;j++)
				{
					if(j==3)
						continue Loop;
					System.out.println(i+":"+j);
				}
				System.out.println();
			}
	}

}


