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
		
		����Ÿ�� ������ (�ʱ갪)
		int i=5;
		
		����: byte, char, short, int, long
		�Ǽ���: float j=3.14 float, double
		���ڿ���: String "�ݵ�� ū����ǥ"
		(������: char) '��������ǥ'
		����: boolean true/false

		System.out.println("�Ǻ���");
		int i=127;
		long l=12121212L;
		float pi=3.14159f;
		String str="Hello";
		boolean b=true;
		
		Stack Overflow.com

		JVM: Java Virtual Machine(java ����)
		JRE: Java Runtime Environment
		JNC Java Native Code
		JDK: Java Development Kit
		IDE: Integrated Development Environment
			Visual Studio Code/Eclipse/Xcode/Android Studio ��
		.java->(compiler, javac.exe)->.class->JRE(java.exe)->windows
		
		JAVA ��ġ
		1. JAVA_HOME ȯ�� ���� ����(C:\Program Files\Java\jdk-18.0.1_301)
		2. ȯ�溯�� Path�� %JAVA_HOME%\bin �߰�
		
		������(Operator)
		���������(Arithmetic Operator): + - * / % ++ -- += -= *= /* %=
		�񱳿�����(Comparative Operator): == != > < >= <=
		��������(Logical Operator): && || !
		
		���� �� -> ==
		���ڿ� �� -> .equals()
		
		
		String name="Superman";
		System.out.println(name); //ln�� �ٹٲ�
		System.out.println("name");
		boolean b=true;
		System.out.println(b);
		int i=128;
		System.out.println(i);
		String a="���� �� ĵ";
		System.out.println(a);
		float j=4.56545f;
		System.out.println(j);
		
		int i=0, j=5, x=0;
		x=i%j;
		String str="John";
		if(!str=="John") //���� ������
		
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
		answer=s.nextLine(); //�缱�� �Ұ���, ��Ȱ�� ����
		System.out.println("answer is "+answer);
		
		int age=Integer.parseInt(s.nextLine()); //���ڷ� �ٲٱ�
		System.out.println("age is "+answer);
		
		
		int dan=Integer.parseInt(s.nextLine());
		int j;
		for(j=1;j<10;j++) {
			String str=dan+"x"+j+"="+(dan*j);
			System.out.println(str);	
		}
		
		int dan=Integer.parseInt(s.nextLine());
		
		int a,b,c,d;
		int a=b=c=d=dan; �Ұ�
		int a=dan,b=dan,c=dan,d=dan; ����
		a=b=c=d=dan; //d>c>b>a ������ ó����
		
		int x=Integer.parseInt(s.nextLine());
		if(x>10) {
			System.out.println("�Է��� ���� 10���� Ů�ϴ�");
		} else if(x>=5) {
			System.out.println("�Է��� ���� 5�� 10 ������ �����Դϴ�");
		} else {
			System.out.println("�Է��� ���� 5���� �۽��ϴ�");
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
		
		for(int i=0; i<n; i++) //���� ���� �� ����� ��
		
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
		int ar[]; int[] ar; //�迭 ����
		int[] ar=null; //�迭 �ʱ�ȭ
		ar=new int[] {10,15,20,35,74,99}; //�迭�� ����
		int ar[]= {10,15,20,35,74,99}; int[] ar= {10,15,20,35,74,99}; //�迭 ���� & �ʱⰪ ����
		
		String[] arName= {"John","James","Jacob","Jason"}; //���ڿ� �迭
		
		float[] arReal= {3.14f,1.74f,12.5f};

		
		String[] arName=new String[5]; // �迭 ���� 5�� ����
		arName[0]="John";
		arName[1]="James";
		arName[2]="Jacob";
		arName[3]="Jason";
		arName[4]="Johanson";
		arName[5]="J"; Array Index Out of Bound ������
		
		for(int i=0; i<arName.length; i++) {
			System.out.println(arName[i]);
		} //�迭 ���
		
		for( String name : arName ) {
			System.out.println(name);
		} //���� ���� ��, JavaScript������ for( name in arName ){}
		
		for(int i=0; i<arName.length; i++) {
			String str=arName[1];
			System.out.println(str);
		} //arName�� ���� str�� ����
		
		ArrayList: JavaScript�� �迭�� �Ȱ���
		
		int ar[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}}; //2���� �迭, n���� �迭���� ����
		System.out.println(ar[1][2]); //6
		
		<String>,<Integer> �� ���̰� ArrayList�� ���� Ÿ�� ���� ���� �Է� ����
		
		
		ArrayList<String> arName=new ArrayList<String>();
		//���ڿ��� ����Ǵ� �迭, ���� ��ȣ �ȿ� ���� �����ϰ� �� �迭 ������
		arName.add("John");//add �� ������ ���̰� �þ
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
		arName.remove(1);//James ����, arrayList ���� 1 �پ��� index ���� �ο���
		arName.clear();//���� ��ü ����
		
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
		
		System.out.println("�������� "+mathTotal+" "+mathAvg);
		System.out.println("�������� "+" "+enTotal+" "+enAvg);
		
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
		
		
		javascript �Լ�(function)
		
		��ȯ���� �ִ� �Լ�:
		
		function plus(a,b){
			let c=a+b;
			return c;
		}
		x=plus(3,5)	 	
				
		��ȯ���� ���� �Լ�: 
			
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

		
						 
		java �޼ҵ�(method)
		
		��ȯ���� �ִ� �Լ�:
		
		int plus(int a,int b) {
			int c=a+b;
			return c;
		}
		
		int x=plus(3,5);
		
		��ȯ���� ���� �Լ�:
		
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
		
		����Լ�: Ʈ�� ������ ������, ��� ���� ǥ���� �� ���
		
		
		��ü���� ���α׷��� ����� 4���� Ư¡
		1. ĸ��ȭ: Ŭ���� �ȿ� ���۰� �Ӽ��� ����
			�ܺο��� �ʵ忡 ���� ���� ����, �޼ҵ带 ���ؼ��� ����
			���� ������(Access Modifier) - Public, Protected, Default, Private
		2. ������: �Ű������� ������ Ÿ���� �ٸ� ������ �޼ҵ带 ����� �� ����
			������ �����ε�(Constructor Overloading)
			�޼ҵ� �����ε�
		3. ���: �θ� ��ü�� �ڽ� ��ü���� �Ӽ�/������ �����
		4. �߻�ȭ: �߻�Ŭ����/�������̽��� ����
		
		
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
		
		=>�޼ҵ� �̸� ���Ƶ� ��
		
		
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
		
		System.out.println("�ִ�����: "+a+", "+"�ּҰ����: "+b);
		
		
		
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
	//�Ӽ�(����)<-�ʵ�(field):�������
	//����(�޼ҵ�)<-�޼ҵ�(method):����Լ�
	
	String name;
	String gender;
	
}

public class Car {
	String color;
	String model;
	String company;
	int max_speed;
	int speed;
	int person; //ž�°����ο�
	int fuel; //���� ���ᷮ
	int max_fuel; //������ũ �뷮
	
	void run(int speed) {
//		int speed;
		this.speed=speed; 
		//this�� �ش� ��ü�� ����Ŵ
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
		s1.name="ȫ�浿";
		s1.gender="����";
	
		Student s2 = new Student();
		s2.name="�㳭����";
		s2.gender="����";
				
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
		//this(n); member ������ �� ������ 1���� ������ ȣ��
		this.mobile=m;
	}
	void setName(String n) {
		this.name=n;
	}
	void setMobile(String m) {
		this.mobile=m;
		this.setName("Hello"); // this�� ���ָ� ����
	}
	
	Member(){
		this.name=null;
		this.mobile=null; //�� �ʱ�ȭ
	}
	
	int sum2(int ... a) { //�迭 ���� �� ��
		for(int i=0; i<a.length; i++) {
		}
	}
	
}



public class HrmMain {

	public static void main(String[] args) {
	
		������(constructor): new �����ڰ� ���� �� �ڵ�ȣ��Ǵ� �޼ҵ�
			Ŭ������ ����
			��ȯ���� ����

		Member m1=new Member("John","77778888");
		System.out.println(m1.name+", "+m1.mobile);
		
		Member m=new Member();
		m.name="�Ǻ���";
		m.gender="����";
		m.jobTitle="student";
		m.mobile="01097307547";
		System.out.println(m.name+", "+m.gender+", "
				+m.jobTitle+", "+m.mobile);
		
		Member m2=new Member();
		m2.name="������";
		m2.gender="����";
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


	������ ȣ��
		�ʱ�ȭ: this();
		�� ȣ��: this("Blue");
		
		
	���� ���
		static ����� �ν��Ͻ� ȣ�� ���� �ٷ� ��� ����
		static field: ��� ��ü(�ν��Ͻ�)�� �������� ����ϴ� ���� ����̸�
			���� �ʵ�� �����ϴ� �� ����(�޸� ����, �ӵ� ����)
			
	��Ű�� = ����
	import: �ٸ� ��Ű�� ���� �ִ� Ŭ������ ������ ����� ��
	import �θ���Ű��.�ڽ���Ű��.Ŭ������;
		
	Getter/Setter
		class ���� �� ���콺 ��Ŭ��->source->getter/setter
		ĸ��ȭ/������ ����
	
	������ �����
		���콺 ��Ŭ��(floating menu)->source->generate constructor using fields
	`
	Overriding(������): ������ �޼ҵ带 �ڽ��� �������ϸ� �θ��� (����) �޼ҵ尡 ���õ�
	
	super(): �θ� Ŭ���� ������ ȣ��
	super.xxx(): �θ� Ŭ���� �޼ҵ� ȣ��
	
	
	����������(Access Modifier)
		public: ������ ���� ����
			Ŭ�������� �⺻������ public���� ������
		private: Ŭ���� �������� ���� ����(�ܺ� ���� �Ұ�)
			Ŭ������ �ʵ�� �⺻������ private���� ������
		default: ���� ��Ű�� ������ ��� ���� ����(�⺻ ����)
		protected: default+�ٸ� ��Ű���� �ڽ� Ŭ������ ���� ����
	
	�߻� �޼ҵ�
		�ڽ� Ŭ�������� �ݵ�� ��ü(���� �ڵ�)�� �ۼ��Ǿ�� ��
		(�߻� Ŭ������) �Ϲ� �޼ҵ�� �ڽ� Ŭ�������� ���������� �ʾƵ� ��
	
	�߻� Ŭ����: �ʵ�, ������, �Ϲ� �޼ҵ�, �߻� �޼ҵ�
	
	�������̽�: �ʵ�x(��� ����o), ������x, 
		�Ϲ�(����Ʈ) �޼ҵ�o, �߻� �޼ҵ�o, ���� �޼ҵ�o
	
	
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

	���
		Ŭ����: ���� ��Ӹ� ����, ���� ��� �Ұ��� 
		�������̽�: ���� ��� ����
			class D implements iA, iB
	
	
	Ŭ������ ������ Ÿ�԰� �����
	
	public class A {
		B b1;
		int price;
		String name;
		
		A() {
			 this.b1 = new B();
		}
		
		
	public class shop {
		interface Remote Control {
			��ø �������̽�
		}
		class Sales {
			��ø Ŭ����
		}
	}
	
	���� ó��
		try-catch: ���ܸ� ���μ� ó��
		throw declaration: ���ܸ� ȣ���� Ŭ������ ���ѱ�
		
	- Thread Ŭ�����κ��� ���� ����(Runnable 
		*/
		


	
		
		
		


