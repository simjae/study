/*
 1.자바가 제공하는 기본 타입 (시스템타입) 자료형>>8가지 
 2.8가지 기본타입을 [값을 저장]하는 ㅏ입
 3.숫자 >> 정수 >> [음의 정수 , 0 , 양의정수) >> byte (-128 ~127)
 									  >> char (한문자를 표현하는 타입) >> 'A','가'
 									  >> 한글 1자 2byte 
 									  >> 영문자 , 특수문자 , 공백1byte
 									  >> 협의 >> char(2byte)(한글, 영문, 특수문자, 공백) 상관없이 한글자 
 									  >> 국가간 협의 (unicode)>>아스키 코드표
 									>> short(c언어의 호환성 2byte)
 							  		>> int (-21억 ~ 21억 : 4byte) *** Java 정수의 연산의 기본타빙***
 									>>long (8byte)
 	>>실수(부동소수점) 					>>float (4byte)
 									>>double(8byte) >> 정밀도 (표현범위가 크다)*** Java 실수 연산의 기본타입이다.
 논리  >> 참, 거짓 ture, false 			>> boolean (프로그램의 논리적인 표현 흐름제어)
 
 								
 *** 문자열의 표현 >> "홍길동" , Hello"
 String name = "홍길동"
 그럼에도 불구하고... 
 다른 이야기를 하기전까지 String 문자열을 담을수 있는 타입 
 int, double 처럼 사용하세요
 그래야 삶이 편안해요.. 당분간만 									  
 						
 									  
자바는 크게 
1.값 타입                  : 8가지 기본타입 :int i =100; int j = i;                ->vlaue type
2.참조 타입(주소값)   : 클래스 , 배열, 변수에 값이 저장되는 것이 아니라 주소값 저장(참조값) ->ref type 
 									  
 									  
 									  
 */
//class == 설계도 == 타입 (type)
class Car{ //Car Type 이다, Car 설계도이다. >> 구체화된 산물 >> 객체화 (메모리)
	String color; //instance 
	int window;
}




public class Ex03_DataType {

	public static void main(String[] args) {
		String str = "홍길동";
		int age =100;
		
		Car c;//c는 main 함수안에 있는 지역 변수 
		//System.out.println(c); 지역변수 초기화  x
		// c라는 변수의 초기화 >> 주소를 가지게 하는것 >>new 연산자를 통해서 만들어진 주소가 할당되게 하는것 
		c = new Car();
		System.out.println(c);//Car@15db9742
		
		//선언과 초기화 
		//참조값의 초기화는 주소값을 갖는다. 
		Car c2 =  new Car();
		c2.window = 100;
		c2.color = "blue";
		//System.out.println(c2);
		//System.out.println(c2.window);
		//System.out.println(c.window);
		
		int i = 10;
		int j = 20;
		j = 20;
		
		int k;
		k = j;//POINT[값 할당]
		System.out.println("k:" + k );
		k = 300;
		System.out.println("k:" + j );
		System.out.println("j:" + j );
		
		
		//int p,g,q;
	
		// 이런경우라면 Array :int[] arr = new int[3];
		
		//int(-21억 ~21억 )
		//Today Point
		//literal >>있는 그대로 
		//정수 리터럴 : [기본값 default int 범위******] 
		//int p = 3100000000;
		long l = 3100000000L;// 접미사여서 가능
		long l2 =100; // int 정수 범위여서 가능 
		
		//int p2 = 100000000L;  //Type mismatch: cannot convert from long to int(변환불가)
		
		
		//char : 2byte 정수값 
		//한문자를 표현하는 자료형 
		//Today Point /
		//문자열 : "가", "홍길동" >> String str  = "가나다라마바 "
		//문자 (한):'A'	>> char ch = 'A'
		char single = '가';
		System.out.println(single);
		char ch = 'A';
		System.out.println(ch);	
		//char 문자를 저장하지만 내부적으로 정수값을 가지고있다 (아스키코드표)
		//casting(타입변환)
		int intch ='A';// 내부적으로 자동(암시적)형변환
		System.out.println("intch : " + intch);
		
		System.out.println((int)ch);
		
		char ch2 ='a';
		System.out.println(ch2);
		int intch2  = (int)ch2;
		System.out.println(intch2);
		
		
		int intch3 = 65;
		char ch3 = (char)intch3;
		System.out.println(ch3);
		
		//속지말자[값을 보지말고 값이 가지는 타입을 보자]
		//강제적 형변환 (명시적 형변환) >> (char),(int)
		//Key Point : 65라는 숫자가 char 타입 속하는 경우 (데이터 손실 없이 할당) 
		//int intch3 = 99999999;
		//큰것을 작은것으로 강제 [데이터 손실]
		
		int intch4 = ch3; // 형변환..자동으로.. 컴파일러 
		//자동형변환
		//int intch4 =(int)ch3 컴파일러가 코드 재생산
		System.out.println(intch4);
		
		
		
	}

}












