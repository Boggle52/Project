
public class Car {
//	Tire frontLeft;
//	Tire frontRight;
//	Tire rearLeft;
//	Tire rearRight;
//	
//	
//	public Car() {
//		this.frontLeft=new Tire(6,"앞왼쪽");
//		this.frontRight=new Tire(2,"앞오른쪽");
//		this.rearLeft=new Tire(3,"뒤왼쪽");
//		this.rearRight=new Tire(4,"뒤오른쪽");
//	}
//	
//	int run() {
//		System.out.println("차가 달립니다.");
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
		this.tires[0] = new Tire(6,"앞왼쪽");
		this.tires[1] = new Tire(2,"앞오른쪽");
		this.tires[2] = new Tire(3,"뒤왼쪽");
		this.tires[3] = new Tire(4,"뒤오른쪽");
	}
	
	int run() {
		System.out.println("차가 달립니다.");
		for(int i=0; i<this.tires.length; i++) {
			if(!this.tires[i].roll()) { this.stop(); return i+1;}
		} //return되면 run 메소드 자체가 끝남
		return 0;
	}
	
	void stop() {
		System.out.println("차가 멈춥니다.");
	}
}

