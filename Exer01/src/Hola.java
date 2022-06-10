/*
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

public class Hola {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
	}
}
		
		변수타입 변수명 (초깃값)
		int i=5;
		
		정수: byte, char, short, int, long
		실수형: float j=3.14 float, double
		문자열형: String "반드시 큰따옴표"
		(문자형: char) '작은따옴표'
		논리형: boolean true/false

		System.out.println("권보경");
		int i=127;
		long l=12121212L;
		float pi=3.14159f;
		String str="Hello";
		boolean b=true;
		
		Stack Overflow.com

		JVM: Java Virtual Machine(java 실행)
		JRE: Java Runtime Environment
		JNC Java Native Code
		JDK: Java Development Kit
		IDE: Integrated Development Environment
			Visual Studio Code/Eclipse/Xcode/Android Studio 등
		.java->(compiler, javac.exe)->.class->JRE(java.exe)->windows
		
		JAVA 설치
		1. JAVA_HOME 환경 변수 생성(C:\Program Files\Java\jdk-18.0.1_301)
		2. 환경변수 Path에 %JAVA_HOME%\bin 추가
		
		연산자(Operator)
		산술연산자(Arithmetic Operator): + - * / % ++ -- += -= *= /* %=
		비교연산자(Comparative Operator): == != > < >= <=
		논리연산자(Logical Operator): && || !
		
		숫자 비교 -> ==
		문자열 비교 -> .equals()
		
		
		String name="Superman";
		System.out.println(name); //ln은 줄바꿈
		System.out.println("name");
		boolean b=true;
		System.out.println(b);
		int i=128;
		System.out.println(i);
		String a="맥주 네 캔";
		System.out.println(a);
		float j=4.56545f;
		System.out.println(j);
		
		int i=0, j=5, x=0;
		x=i%j;
		String str="John";
		if(!str=="John") //같지 않으면
		
		int i=10, j=5, x=0;
		if(i<j) {x=i;} else {x=j;} //x=(i<j)?i:j;
		if(i<j) {x=i;} else if (i>j) {x=j;} else {x=0;} //x=(i<j)?i:((i>j)?j:0);
		
		System.out.println(3+"x"+1+"="+(3*1));
		System.out.println(3+"x"+2+"="+(3*2));
		System.out.println(3+"x"+3+"="+(3*3));
		System.out.println(3+"x"+4+"="+(3*4));
		System.out.println(3+"x"+5+"="+(3*5));
		System.out.println(3+"x"+6+"="+(3*6));
		System.out.println(3+"x"+7+"="+(3*7));
		System.out.println(3+"x"+8+"="+(3*8));
		System.out.println(3+"x"+9+"="+(3*9));
		
		Scanner s=new Scanner(System.in);
		
		String answer=s.nextLine();
		System.out.println("answer is "+answer);
		answer=s.nextLine(); //재선언 불가능, 재활용 가능
		System.out.println("answer is "+answer);
		
		int age=Integer.parseInt(s.nextLine()); //숫자로 바꾸기
		System.out.println("age is "+answer);
		
		
		int dan=Integer.parseInt(s.nextLine());
		int j;
		for(j=1;j<10;j++) {
			String str=dan+"x"+j+"="+(dan*j);
			System.out.println(str);	
		}
		
		int dan=Integer.parseInt(s.nextLine());
		
		int a,b,c,d;
		int a=b=c=d=dan; 불가
		int a=dan,b=dan,c=dan,d=dan; 가능
		a=b=c=d=dan; //d>c>b>a 순으로 처리됨
		
		int x=Integer.parseInt(s.nextLine());
		if(x>10) {
			System.out.println("입력한 값이 10보다 큽니다");
		} else if(x>=5) {
			System.out.println("입력한 값이 5와 10 사이의 숫자입니다");
		} else {
			System.out.println("입력한 값이 5보다 작습니다");
		}
		
		int x=Integer.parseInt(s.nextLine());
		int y=0;
		while(x>=0) {
			y=y+x;
			x--;
		}
		System.out.println(y);
		
		
		int sum=0;
		int x=Integer.parseInt(s.nextLine());
		int y=Integer.parseInt(s.nextLine());
		
		if(y>=x) {
			while(x<=y) {
				sum=sum+x;
				x++;
			}
		} else if(y<x) {
			while(y<=x) {
				sum=sum+y;
				y++;
			}
		}
		System.out.println(sum);
			
			
		int x=1, y=0, sum=0;
		Scanner s= new Scanner(System.in);
		
		int answer = Integer.parseInt(s.nextLine()) ;
		int answer1 = Integer.parseInt(s.nextLine());
		
		if(answer<answer1) {
			x=answer;
			y=answer1;
		}
		else{
			y=answer;
			x=answer1;
		}
		
		while(x<=y) {
			sum+=x;
			System.out.println(x+", "+sum);
			x++;
		}
			
			
		int x=Integer.parseInt(s.nextLine());
		int y=Integer.parseInt(s.nextLine());
		int sum=0;
		
		if(x>y) {
			int temp=x;
			x=y;
			y=temp;
		}
		
		while(x<=y) {
			sum=sum+x;
			x++;
		}
		
		System.out.println(sum);
		
		for(int i=0; i<n; i++) //변수 선언 꼭 해줘야 함
		
		int i,j;
		for(i=2;i<10;i++) {
			for(j=1;j<10;j++) {
				String str=i+"x"+j+"="+(i*j);
				System.out.println(str);
			}
		}
		
		System.out.println(2);
		int i;
		int p;
		for(p=2;p<=1000;p++) {
			for(i=2;i<p;i++) {
				if(p%i==0) break;
				if(i==p-1) System.out.println(p);
			}
		}
		
		int i;
		int p;
		for(p=2;p<=1000;p++) {
			boolean flag=false;
			for(i=2;i<p;i++) {
				if(p%i==0) flag=true;
			}
			if(flag==false) {
				System.out.println(p);
			}
		}
		
		int i;
		int p;
		for(p=2;p<=1000;p++) {
			for(i=2;i<=p;i++) {
				if(p%i==0 && i!=p) break;
				if(i==p) System.out.println(p);
			}
		}
		
		int i;
		int p;
		for(p=2;p<=1000;p++) {
			for(i=2;i<=p;i++) {
				if(i==p) System.out.println(p);
				if(p%i==0) break;
			}
		}
				
		
		int x=1;
		int y=1;
		int temp=0;
		System.out.println(x);
		while(y<=1000) {
			System.out.println(y);
			temp=y;
			y=y+x;
			x=temp;
		}
		
		javascript:
		let ar=[1,3,"Hello",{name:"John"}];
		let ar[];
			
		java:
		int ar[]; int[] ar; //배열 선언
		int[] ar=null; //배열 초기화
		ar=new int[] {10,15,20,35,74,99}; //배열값 저장
		int ar[]= {10,15,20,35,74,99}; int[] ar= {10,15,20,35,74,99}; //배열 선언 & 초기값 저장
		
		String[] arName= {"John","James","Jacob","Jason"}; //문자열 배열
		
		float[] arReal= {3.14f,1.74f,12.5f};

		
		String[] arName=new String[5]; // 배열 길이 5로 고정
		arName[0]="John";
		arName[1]="James";
		arName[2]="Jacob";
		arName[3]="Jason";
		arName[4]="Johanson";
		arName[5]="J"; Array Index Out of Bound 에러남
		
		for(int i=0; i<arName.length; i++) {
			System.out.println(arName[i]);
		} //배열 찍기
		
		for( String name : arName ) {
			System.out.println(name);
		} //위와 같은 식, JavaScript에서는 for( name in arName ){}
		
		for(int i=0; i<arName.length; i++) {
			String str=arName[1];
			System.out.println(str);
		} //arName의 값을 str에 넣음
		
		ArrayList: JavaScript의 배열과 똑같음
		
		int ar[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}}; //2차원 배열, n차원 배열까지 가능
		System.out.println(ar[1][2]); //6
		
		<String>,<Integer> 안 붙이고 ArrayList만 쓰면 타입 제한 없이 입력 가능
		
		
		ArrayList<String> arName=new ArrayList<String>();
		//문자열만 저장되는 배열, 보통 괄호 안에 숫자 생략하고 빈 배열 선언함
		arName.add("John");//add 할 때마다 길이가 늘어남
		arName.add("James");
		arName.add("Jacob");
		arName.add("Jason");
		arName.add("Johanson");
		arName.add("Jefferson");
		for(int i=0;i<arName.size();i++) {
			String str=arName.get(i);
			System.out.println(str);
		}
		arName.remove("James");
		arName.remove(1);//James 삭제, arrayList 길이 1 줄어들고 index 새로 부여됨
		arName.clear();//내용 전체 지움
		
		ArrayList<String> arStudent=new ArrayList<String>();
		String name=s.nextLine();
		while(!name.equals("")) {
			arStudent.add(name);
			name=s.nextLine();
		}
		for(int i=0;i<arStudent.size();i++) {
			System.out.println(arStudent.get(i));
		}

		
		ArrayList<String> arMenu=new ArrayList<String>();
		ArrayList<Integer> arPrice=new ArrayList<Integer>();
		String menu=s.nextLine();
		while(!menu.equals("")) {
			arMenu.add(menu);
			int price=Integer.parseInt(s.nextLine());
			arPrice.add(price);
			menu=s.nextLine();
		}
		for(int i=0;i<arMenu.size();i++) {
			System.out.println(arMenu.get(i)+", "+arPrice.get(i));
		}
		
		
		ArrayList<String> arName=new ArrayList<String>();
		ArrayList<Integer> arMath=new ArrayList<Integer>();
		ArrayList<Integer> arEn=new ArrayList<Integer>();
		int mathTotal=0;
		int enTotal=0;

		String name=s.nextLine();
		while(!name.equals("")) {
			arName.add(name);
			int math=Integer.parseInt(s.nextLine());
			arMath.add(math);
			mathTotal+=math;
			int en=Integer.parseInt(s.nextLine());
			arEn.add(en);
			enTotal+=en;
			name=s.nextLine();
		}
		
		for(int i=0;i<arName.size();i++) {
			System.out.println(arName.get(i)+", "+arMath.get(i)+", "+arEn.get(i));
		}
		
		int mathAvg=mathTotal/(arName.size());
		int enAvg=enTotal/(arName.size());
		
		System.out.println("수학점수 "+mathTotal+" "+mathAvg);
		System.out.println("영어점수 "+" "+enTotal+" "+enAvg);
		
public enum Week {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}
		
		System.out.println(Week.THURSDAY);
		
		
		javascript 함수(function)
		
		반환값이 있는 함수:
		
		function plus(a,b){
			let c=a+b;
			return c;
		}
		x=plus(3,5)	 	
				
		반환값이 없는 함수: 
			
		function plus(a,b) {
			let c=a+b;
			document.write(c);
		}
		
		function plus(a,b) {
			let c=a+b;
			document.write(c);
			return;
		}
		
		plus(3,5)

		
						 
		java 메소드(method)
		
		반환값이 있는 함수:
		
		int plus(int a,int b) {
			int c=a+b;
			return c;
		}
		
		int x=plus(3,5);
		
		반환값이 없는 함수:
		
		void plus(int a,int b) {
			int c=a+b;
			System.out.println(c);
		}
		
		void plus(int a,int b) {
			int c=a+b;
			System.out.println(c);
			return;
		}
		
		plus(3,5);
		
		
		int x=Integer.parseInt(s.nextLine());
		int y=Integer.parseInt(s.nextLine());
		int z=plus(x,y);
		System.out.println(z);
		minus(x,y);
	}
	
	static int plus(int a,int b) {
		int c=a+b;
		return c;
	}
	
		
	static void minus(int a, int b) {
		int c=a-b;
		System.out.println(c);
		
		
		int x=Integer.parseInt(s.nextLine());
		int w=factorial(x);
		System.out.println(w+" is the factorial of "+x);
		w=accum(x);
		System.out.println(w);
	}
	

	static int factorial(int a) {
		if(a==1) return 1;
		else return a*factorial(a-1);
	}
	
	static int accum(int a) {
		if(a==1) return 1;
		else return a+accum(a-1);
		
		재귀함수: 트리 구조에 적합함, 댓글 대댓글 표시할 때 사용
		
		
		객체지향 프로그래밍 언어의 4가지 특징
		1. 캡슐화: 클래스 안에 동작과 속성을 보관
			외부에서 필드에 직접 접근 금지, 메소드를 통해서만 접근
			접근 제한자(Access Modifier) - Public, Protected, Default, Private
		2. 다형성: 매개변수의 갯수와 타입이 다른 동명의 메소드를 사용할 수 있음
			생성자 오버로딩(Constructor Overloading)
			메소드 오버로딩
		3. 상속: 부모 객체가 자식 객체에게 속성/동작을 상속함
		4. 추상화: 추상클래스/인터페이스로 구현
		
		
		int plus(int a,int b){
			int c=a+b;
			return c;
		}
		int plus(int a,int b,int c) {
			int d=a+b+c;
			return d;
		}
		float plus(float a,float b){
			float c=a+b;
			return c;
		}
		
		=>메소드 이름 같아도 됨
		
		
		int x=Integer.parseInt(s.nextLine());
		int y=Integer.parseInt(s.nextLine());
		com(x,y);
	}
	
	static void com(int x,int y) {
		
		int a=1;
		int b=1;
		
		if(y>x) {
			int temp=y;
			y=x;
			x=temp;
		}
		
		for(int i=y; i>=2; i--) {
			if(x%i==0 && y%i==0) {
				a=i;
				x=x/a;
				y=y/a;
			}
		}
		b=a*x*y;
		
		System.out.println("최대공약수: "+a+", "+"최소공배수: "+b);
		
		
		
		ArrayList<String> arAst=new ArrayList<String>();
		String str="";
		
		for(int i=0;i<10;i++) {
			str+="*";
			arAst.add(str);
		}
		
		for(int i=0;i<9;i++) {
			System.out.println(arAst.get(i));
		}
		
		for(int i=9;i>=0;i--) {
			System.out.println(arAst.get(i));
		}
		
		
		
		int x=Integer.parseInt(s.nextLine());
		int i,j;
		for(j=0;j<(x*2);j++) {
			if(j<=x) {
				for(i=0;i<j;i++) {
					System.out.print("*");
				}
			}
			else if(j>x) {
				for(i=(x*2)-j;i>0;i--) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		
public class Student {
	//속성(변수)<-필드(field):멤버변수
	//동작(메소드)<-메소드(method):멤버함수
	
	String name;
	String gender;
	
}

public class Car {
	String color;
	String model;
	String company;
	int max_speed;
	int speed;
	int person; //탑승가능인원
	int fuel; //남은 연료량
	int max_fuel; //연료탱크 용량
	
	void run(int speed) {
//		int speed;
		this.speed=speed; 
		//this는 해당 객체를 가리킴
	}
	void stop() {
		speed=0;
	}
	void turn_left() {
		
	}
	void turn_right() {
		
	}
	void refueling(int x) {
		fuel+=x;
	}
}


public class StudentExample {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name="홍길동";
		s1.gender="남성";
	
		Student s2 = new Student();
		s2.name="허난설헌";
		s2.gender="여성";
				
		System.out.println("s1.name:"+s1.name+",s1.gender="+s1.gender);
		System.out.println("s2.name:"+s2.name+",s2.gender="+s2.gender);
		
		Car seltos=new Car();
		seltos.max_speed=220;
		seltos.speed=0;
		seltos.person=5;
		seltos.model="Nobless 1.6 GTI 2WD";
		seltos.company="Kia";
		System.out.println("seltos speed="+seltos.speed);
		seltos.run(60);
		System.out.println("seltos run speed="+seltos.speed);
		
		Student s1=new Student();
//		s1.max_speed=120; error
		
	}
}



public class Member {
	String name;
	String gender;
	String jobTitle;
	String mobile;
	
	
	Member(String x){
		this.name=x;
	}
	
	
	Member(String n, String m){
		this.name=n;
		//this(n); member 생성자 중 변수가 1개인 생성자 호출
		this.mobile=m;
	}
	void setName(String n) {
		this.name=n;
	}
	void setMobile(String m) {
		this.mobile=m;
		this.setName("Hello"); // this를 써주면 좋음
	}
	
	Member(){
		this.name=null;
		this.mobile=null; //값 초기화
	}
	
	int sum2(int ... a) { //배열 개수 모를 때
		for(int i=0; i<a.length; i++) {
		}
	}
	
}



public class HrmMain {

	public static void main(String[] args) {
	
		생성자(constructor): new 연산자가 사용될 때 자동호출되는 메소드
			클래스와 동명
			반환값이 없음

		Member m1=new Member("John","77778888");
		System.out.println(m1.name+", "+m1.mobile);
		
		Member m=new Member();
		m.name="권보경";
		m.gender="여성";
		m.jobTitle="student";
		m.mobile="01097307547";
		System.out.println(m.name+", "+m.gender+", "
				+m.jobTitle+", "+m.mobile);
		
		Member m2=new Member();
		m2.name="박재형";
		m2.gender="남성";
		m2.jobTitle="teacher";
		m2.mobile="12345678";
		System.out.println(m2.name+", "+m2.gender+", "
				+m2.jobTitle+", "+m2.mobile);
	}

}



public class Marine {

	int defense;
	int attack;
	public static void main(String[] args) {
		Marine m1=new Marine();
		
		m1.defense=100;
		m1.attack=10;
		
		Marine m2=new Marine();
		m2.defense=10;
	}
}


	생성자 호출
		초기화: this();
		값 호출: this("Blue");
		
		
	정적 멤버
		static 멤버는 인스턴스 호출 없이 바로 사용 가능
		static field: 모든 객체(인스턴스)가 공동으로 사용하는 값이 상수이면
			정적 필드로 정의하는 게 낫다(메모리 절약, 속도 개선)
			
	패키지 = 폴더
	import: 다른 패키지 내에 있는 클래스를 가져다 사용할 때
	import 부모패키지.자식패키지.클래스명;
		
	Getter/Setter
		class 생성 시 마우스 우클릭->source->getter/setter
		캡슐화/은닉을 위해
	
	생성자 만들기
		마우스 우클릭(floating menu)->source->generate constructor using fields
	`
	Overriding(재정의): 동명의 메소드를 자식이 재정의하면 부모의 (동명) 메소드가 무시됨
	
	super(): 부모 클래스 생성자 호출
	super.xxx(): 부모 클래스 메소드 호출
	
	
	접근제한자(Access Modifier)
		public: 누구나 접근 가능
			클래스명은 기본적으로 public으로 선언함
		private: 클래스 내에서만 접근 가능(외부 접근 불가)
			클래스의 필드는 기본적으로 private으로 선언함
		default: 같은 패키지 내에서 모두 접근 가능(기본 설정)
		protected: default+다른 패키지의 자식 클래스만 접근 가능
	
	추상 메소드
		자식 클래스에서 반드시 본체(실행 코드)가 작성되어야 함
		(추상 클래스의) 일반 메소드는 자식 클래스에서 재정의하지 않아도 됨
	
	추상 클래스: 필드, 생성자, 일반 메소드, 추상 메소드
	
	인터페이스: 필드x(상수 선언o), 생성자x, 
		일반(디폴트) 메소드o, 추상 메소드o, 정적 메소드o
	
	
public class Calculator {
	String color;
	String model;
	String company;
	int max_speed;
	int fuel;
	
	public Calculator(){};
	
	public Calculator(String color, String model, String company, int max_speed, int fuel) {
		this.color = color;
		this.model = model;
		this.company = company;
		this.max_speed = max_speed;
		this.fuel = fuel;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getMax_speed() {
		return max_speed;
	}
	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

}



public class CalculatorExample {

	public static void main(String[] args) {
		Calculator seltos = new Calculator("red","seltos","KIA",220,40);
	}
}

	상속
		클래스: 단일 상속만 가능, 다중 상속 불가능 
		인터페이스: 다중 상속 가능
			class D implements iA, iB
	
	
	클래스는 데이터 타입과 비슷함
	
	public class A {
		B b1;
		int price;
		String name;
		
		A() {
			 this.b1 = new B();
		}
		
		
	public class shop {
		interface Remote Control {
			중첩 인터페이스
		}
		class Sales {
			중첩 클래스
		}
	}
	
	예외 처리
		try-catch: 예외를 감싸서 처리
		throw declaration: 예외를 호출한 클래스에 떠넘김
		
	- Thread 클래스로부터 직접 생성(Runnable 
		*/
		


	
		
		
		


