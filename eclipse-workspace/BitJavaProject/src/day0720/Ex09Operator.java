package day0720;

public class Ex09Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비교연산자, 논리연산자 연산자 연습 
		int kor=89, eng=100, mat=89;
		System.out.println(kor>eng);//false
		System.out.println(kor<eng && eng<mat);//false
		System.out.println(kor<eng || eng<mat);//true
		System.out.println(kor==mat);//true
		System.out.println(!(kor==mat));//false
		System.out.println(kor==eng && eng==mat);//false
		
		//대입연산자 연습
		int a=5;
		a+=3;//8
		System.out.println(a);
		a*=4;//32
		System.out.println(a);
		a-=5;//27
		System.out.println(a);
		a/=2;//13
		System.out.println(a);
		a%=3;//1
		System.out.println(a);
	}

}
