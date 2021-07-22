package day0720;

public class Ex01DateType {

	public static void main(String[] args) {
		
		boolean flag=false;//true,false 두가지 
		char ch1='A'; //자바에서 char 는 2바이트(한글자만 넣을수 있음) 
		char ch2='가';//한글 한글자는 2바이트 차지함(언어는 char가 1byte라 한글넣을수없음) 
		String str="Happy";//문자을 큰따옴표로 값을 준다 
		String str2=new String("Good");//String 은 클래스탑이므로 new로 생성해서 넣어도 된다. 
		float f=123.456789f;//float 타입은 숫자뒤에 반드시 f를 붙인다. 
		double d=123.456789;//
		System.out.println("출력 #1");
		System.out.println("flag="+flag);
		System.out.println("not flag="+!flag);//논리연산자 not(!)
		System.out.println("ch1="+ch1);
		System.out.println("ch2="+ch2);
		System.out.println("str="+str);
		System.out.println("str2="+str2);
		System.out.println("f="+f);//정밀도 8자리 
		System.out.println("d="+d);//정밀도 15자리 
		
		//출력함수중 printf(jdk5에서 추가된 기능)-변환기호를 이용해서 출력하는 메서드 
		//정수 :%d, 실수 :%f, 문자 :%c, 문자열 :%s
		//제어문자열: \n:줄넘김, \t:탭(다음탭 위치에 출력) 
		System.out.println("----------------");
		System.out.printf("ch1=%c\n",ch1);
		System.out.printf("sh2=%c\n",ch2);
		System.out.printf("str=%s\n",str);
		System.out.printf("str2=%s\n",str2);
		System.out.printf("f=%f\n",f);
		System.out.printf("d=%f\n",d);
		System.out.printf("d=%10.2f\n",d);//전체자릿수 10자리, 소숫점자리 2자리 
		System.out.printf("d=%-10.2f#\n",d);//전체자릿수 10자리,소숫점 자릿수 2자리(왼쪽부터출력) 
		System.out.printf("d=%.1f\n",d);//소숫점 자릿수 1자리 

	}

}
