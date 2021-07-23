package day0720;

public class Ex02DateType {

	public static void main(String[] args) {
		//byte 는 1byte 의 수형 타입으로 -128~127
		byte a= 127;
		byte b= (byte)200;//오류가 방생하므로 강제로 형변환 시도해보자 
		
		System.out.println(a);
		System.out.println(b);//-56,큰값을 작은 타입으로 형변환을 할경우 값손실이 발생 
		
		//강제형변환(cast 연산자) 를 올바르게 사용하는 경우
		int x=7;
		int y=4;
		System.out.println(x/y);//정수끼리의 계산결과는 무조건 정수 int 타입 
		System.out.println((double)x/y);//수식중 한개라도 double이 있을경우 결과는 double타입 
		
		//묵시적 형변환은 자동으로 결정되는 타입 
		//String+int=String
		//double+int=double
		//long+short=long
		//char+int=int
		
		//char 는 내부적으로 아스키코드(ascii code)의 값으로 인식 
		System.out.println("Happy"+5+6);//앞에서부터 더해진다 
		System.out.println("Happy"+(5+6));//괄호부분이 먼저 더해진다 
		System.out.println('A'+3);  //A의 아스키값은 65
		System.out.println(2+'b'); //b의 아스키값은 98
		System.out.println('a'+'b'); //a의 아스키 값은 97

	}

}
