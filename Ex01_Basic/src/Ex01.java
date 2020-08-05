
public class Ex01 {

	public static void main(String[] args) {
		Test t = new Test();
		t.print();
		//수업
		int lv = 100;//local
		System.out.println("lv 지역변수 :" + lv);
		
		//Ex02_Variable 
		//javac Exo2_Variable.java >> Exo2_Variable.class 생성
		//java Exo2_Variable 실행
		//이클립스 통합 개발툴 (ctrl +F11 컴파일 >>실행 )
		//1.지역변수는 반드시 초기화를 하고 사용(변수에 처음값을 할당 초기화)
		//2.약속>> main도 함수다(main안에 쓰는 변수는 초기화필요) >>초기화 

		int number = 0;//선언과 동시에 초기화 
		number = 100;
		number = 200; 
		System.out.println("number :" + number);
		
		int a ;// 선언 
		
		
		
	}
}


/* 변수가 선언되는 위치 ( scope : 유효범위 )
1. instance variable :객체변수 >> class person {int age }
2. local varialbe 지여견수 (지역 : 함수안) >> class person {public void run() {int speed }}
3. 함수안에 if 블럭 , for 블럭안에 있는 변수도 블럭안에 있음 
*

*/
class Test{
	int lv;//초기화 > 100
		//instance variable
		//이변수는 초기화를 하지 않아도 된다(내부적으로 기본값 : default)
	int window; //기본값 > 0
	//초기화 :변수가 처음 값을 갖는것 (할당을 통해서)
	//질문 : window 변수는 초기화를 하지않아도 사용가능???
	//window 아파트의 창문의 갯수 
	//hint 설계도는 하나 ... 설계도를 기반으로 아파트를 여러개 ... 아파트 마다 창문의 갯수가 다를 수 있다
	//아파트마다 (객체) 창문의 개수를 다르게 가져가겠다. 
	
	//Test 삼성아파트 = new Test();
	//삼성아파트.window = 4;
	
	//Test 삼성아파트 = new Test();
	//삼성아파트.window = 2;
	
	
	Test(){// 생성자 함수(특수한 함수) 객체가 생성될때 자동으로 호출되는 함수 : 객체생성과 동시에 : constructor
		System.out.println("나는 생성장");
	
	}
	Test(int data){//오버로딩 : overloading : 하나의 이름으로 여러가지 기능을 수행
				   //자동으로 호출되는 함수 : 아파트가 지어질때 	
		window = data;//창문의 개수 강제 초기화 
		
	}
	void write() {//기능 행위 method 
		int num;//선언
		// local variable
		//The local variable num may not have been initialized
		//당신이 만약에 지역변수를 사용하고 싶다면 전에 반드시 초기화를 해라 ..
		//write 함수가 호출되면 생성되고 함수가 종료되면 메모리가 지어진다. 
		num = 100;
		System.out.println(num);
		
		int age =15; 
		//지역변수는 사용하긱전에 반드시 초기화(값을 할당하는행위)를 해야한다.
		
	
	}
	
	void print() {
		//안에서 age 변수사용 (사용불가) 다른함수 .. 접근불가 
		//System.out.println(age);
		System.out.println(window);
	
	}
}
	
	
