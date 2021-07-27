package day0723;

public class Ex10Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []ch;
		ch=new char[5];//배열 할당 ,자동초기화
		System.out.println("할당갯수 :"+ch.length);
		
		//초기값 출력 
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(i+":"+(int)ch[i]);
		}
		
		//배열에 값 넣기
		ch[0]='A';
		ch[1]=66;//B
		ch[2]=97;//a
		ch[3]='X';
		ch[4]=49;//숫자'1'
		
		System.out.println("출력 #1");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(i+":"+ch[i]);
		}
		System.out.println("출력 #2");
		for(char a:ch)
			System.out.println(a);

	}

}
