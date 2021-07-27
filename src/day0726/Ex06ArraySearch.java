package day0726;

import java.util.Scanner;

public class Ex06ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//여러명의 다양한 성을 가진 이름을 배열에저장
		String []names= {"김미자","이진","이효리","김진","홍길동","홍미라","손미나","김수진","손현수"};
		Scanner sc=new Scanner(System.in);
		int cnt;
		String search;
		/*
		 * 문제 : 성을 입력시 그 성씨를 가진사람과 총 인원수 출력
		 * 		  종료 라고 입력시 프로그램 종료
		 * (예)
		 * 검색할 성을 입력하시오 : 김
		 * 0: 김미자
		 * 3:김진
		 * 7:김수진
		 * 총 3명 검색
		 * 
		 * 검색할성을 입력하시오 : 박
		 * 박씨성을 가진 사람은 없어요!
		 * 
		 * 검색할 성을 입력하시오 : 종료
		 * 프로그램을 종료합니다!!!
		 * 
		 */
		while(true)
		{
			System.out.println("성씨를 입력");
			search=sc.nextLine();
			if(search.equals("종료"))
			{
				System.out.println("종료합니다");
				break;
			}
			boolean find=false;
			cnt=0;
			for(int i=0;i<names.length;i++)
			{
				if(names[i].startsWith(search))
				{
					cnt++;
					System.out.println("\t"+i+":"+names[i]);
					find=true;
				}
			}
			if(find)
				System.out.println("\t총"+cnt+"명 검색");
			else
				System.out.println(search+"성을 가진사람은 없습니다");
			System.out.println();
		}



	}

}
