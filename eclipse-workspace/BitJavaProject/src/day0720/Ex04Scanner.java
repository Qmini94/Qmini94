package day0720;

import java.util.Scanner;

public class Ex04Scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//키보드로부터 읽기 위한 선언문 
		//변수 선언 
		String name;
		int age;
		String blood;
		
		//키보드로부터 입력받기
		System.out.println("이름을 입력하세요");
		name=sc.nextLine();//한줄을 읽는다(공백사용가능)
		System.out.println("나이를 입력하세요");
		age=sc.nextInt();//나이는 숫자형태로 읽는다
		//나이입력후 멘터를 누르면 그엔터가 키보드 버퍼로 저장되서
		//다음 문자열 읽을경우 먼저 읽어버리는 문제가 발생한다
		//그래서 형랙형을 읽기전에 엔터를 읽어서 없애버린다 
		sc.nextLine();
		
		System.out.println("혈액형을 입력하세요");
		blood=sc.nextLine();
		//출력 
		System.out.println(name+"님의 나이는 "+age+"세 입니다");
		System.out.println(name+"님의 혈액형은 "+blood+"입니다");
		System.out.println(name+"님의 혈액형은 "+blood.toUpperCase()+"입니다");
		
		
	}

}
