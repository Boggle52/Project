
public class Car {
//	Tire frontLeft;
//	Tire frontRight;
//	Tire rearLeft;
//	Tire rearRight;
//	
//	
//	public Car() {
//		this.frontLeft=new Tire(6,"�տ���");
//		this.frontRight=new Tire(2,"�տ�����");
//		this.rearLeft=new Tire(3,"�ڿ���");
//		this.rearRight=new Tire(4,"�ڿ�����");
//	}
//	
//	int run() {
//		System.out.println("���� �޸��ϴ�.");
//		//this.frontLeft.roll()==false
//		if(!this.frontLeft.roll()) { this.stop(); return 1; }
//		if(!this.frontRight.roll()) { this.stop(); return 2; }
//		if(!this.rearLeft.roll()) { this.stop(); return 3; }
//		if(!this.rearRight.roll()) { this.stop(); return 4; }
//		return 0;
//	}
	
	Tire[] tires;
	
	Car(){
		this.tires = new Tire[4];
		this.tires[0] = new Tire(6,"�տ���");
		this.tires[1] = new Tire(2,"�տ�����");
		this.tires[2] = new Tire(3,"�ڿ���");
		this.tires[3] = new Tire(4,"�ڿ�����");
	}
	
	int run() {
		System.out.println("���� �޸��ϴ�.");
		for(int i=0; i<this.tires.length; i++) {
			if(!this.tires[i].roll()) { this.stop(); return i+1;}
		} //return�Ǹ� run �޼ҵ� ��ü�� ����
		return 0;
	}
	
	void stop() {
		System.out.println("���� ����ϴ�.");
	}
}

