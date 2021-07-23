package day0720;

public class Ex03DateType {

	public static void main(String[] args) {

			char a='A';
			int b=98;
			System.out.println(a);
			System.out.println((int)a);
			System.out.println(b);
			System.out.println((char)b);
			System.out.println(a+3);
			System.out.println((char)(a+3));
			System.out.println(b+2);
			System.out.println((char)(b+2));
			
			System.out.printf("%c %c %c %c %c\n",72,101,108,108,111);//Hello 출력 
			
			
			//메인 파라미터값으로 3과목의 점수를 읽어서 총점과 평균(소숫점이하 2자리)로 출력 
			int kor=Integer.parseInt(args[0]);
			int eng=Integer.parseInt(args[1]);
			int mat=Integer.parseInt(args[2]);
			int tot=kor+eng+mat;
			int count =3;//3과목을 의미하는 변수값 
			double avg1=tot/count;//결과는 무조건 int
			double avg2=(double)tot/count;//결과는 double 
			System.out.printf("국어=%d,영어=%d,수학=%d\n",kor,eng,mat);
			System.out.println("총점="+tot);
			System.out.println("평균1="+avg1);
			System.out.println("평균2="+avg2);
			System.out.printf("평균3=%.2f\n",avg2);//소숫점이하 2자리로 출력 
			
	}

}
