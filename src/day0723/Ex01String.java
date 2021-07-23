package day0723;

public class Ex01String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String 객체에 대한 멤버 메서드 공부하기");
		String str1="apply";
		String str2="Apply";
		String str3="Have a Nice Day";
		String str4="    Happy day    ";
		System.out.println("str3의 길이 :"+str3.length());
		System.out.println("str4의 길이 :"+str4.length());
		System.out.println("앞뒤 공백 제거후 str4의 길이 :"+str4.trim().length());
		System.out.println("*"+str4.trim()+"*");
		System.out.println("str3에서 0번 문자:"+str3.charAt(0));
		System.out.println("str3에서 7번 문자:"+str3.charAt(7));
		System.out.println("str3에서 N의 인덱스:"+str3.indexOf('N'));
		System.out.println("str3에서 have추출:"+str3.substring(0,4));
		System.out.println(str3.substring(7,11));
		System.out.println("str3에서 Nice부터 끝까지 추출:"+str3.substring(7));
		//같으면 true 다르면 false
		System.out.println("문자열비교:"+str1.equals(str2));//대소문자까지 같아야 true
		System.out.println("문자열비교:"+str1.equalsIgnoreCase(str2));//대소문자 상관없이 true
		//a.compareTo(b)
		//a와 b가 같을경우 0
		//a가 작을경우 -값(알파벳 차이만큼 마이너스값)
		//a가 클경우 +값(알파벳 차이만큼 플러스값)
		System.out.println(str1.compareTo(str2));//32
		System.out.println(str1.compareTo(str1));//0
		System.out.println("computer".compareTo("comman"));//3(p와 m이 비교)
		System.out.println("hello".compareTo("hello"));//0
		System.out.println("apply".compareTo("banana"));//-1
		
		System.out.println("str3가 Have 로 시작하면 true:"+str3.startsWith("Have"));
		System.out.println("str3가 Have 로 시작하면 true:"+str3.startsWith("Happy"));
		System.out.println(str3.endsWith("Day"));//true
		
		
		//문자열 분리하는 메서드 spilt
		String str5="red,blue,green,black,pink";
		System.out.println("str5 를 컴마로 분리하여 출력하기");
		String []arr=str5.split(",");
		//출력
		for(String color:arr)//:for 문:배열이나 컬렉션에서 사용하는 for문
			System.out.println(color);
		System.out.println("str3을 소문자를 출력"+str3.toLowerCase());
		System.out.println("str3을 대문자를 출력"+str3.toUpperCase());
		String a=String.valueOf(100);//int->String
		String b=String.valueOf(12.3);//double->String
		String a2=100+"";//연산시 String이 있으면 결과는 String
		String b2=12.3+"";
		
		System.out.println("문자열의 일부를 변경");
		System.out.println(str3.replace('a', '*'));
		System.out.println(str3.replace("Nice", "Good"));
		
		
		

	}

}
