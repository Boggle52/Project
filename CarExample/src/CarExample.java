
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		Tire tire1 = new HankookTire();
		Tire tire2 = new KumhoTire();
		
		System.out.println(tire1 instanceof HankookTire);
		System.out.println(tire1 instanceof KumhoTire);
		System.out.println(tire1 instanceof Tire);
		
		for(int i=0; i<5; i++) {
			int nPunkTire=car.run();
			switch(nPunkTire) {
//			case 1:
//				System.out.println("앞왼쪽을 HankookTire로 교체");
//				car.frontLeft=new HankookTire(15, "앞왼쪽");
//				break;
//			case 2:
//				System.out.println("앞오른쪽을 KumhoTire로 교체");
//				car.frontRight=new KumhoTire(13, "앞오른쪽");
//				break;
//			case 3:
//				System.out.println("뒤왼쪽을 HankookTire로 교체");
//				car.rearLeft=new HankookTire(14,"뒤왼쪽");
//				break;
//			case 4:
//				System.out.println("뒤오른쪽을 KumhoTire로 교체");
//				car.rearRight=new KumhoTire(17,"뒤오른쪽");
			
			case 1:
			System.out.println(car.tires[nPunkTire-1].location+"을 HankookTire로 교체");
			car.tires[nPunkTire-1]=new HankookTire(15, "앞왼쪽");
			break;
		case 2:
			System.out.println(car.tires[nPunkTire-1].location+"을 HankookTire로 교체");
			car.tires[nPunkTire-1]=new KumhoTire(13, "앞오른쪽");
			break;
		case 3:
			System.out.println(car.tires[nPunkTire-1].location+"을 HankookTire로 교체");
			car.tires[nPunkTire-1]=new HankookTire(14,"뒤왼쪽");
			break;
		case 4:
			System.out.println(car.tires[nPunkTire-1].location+"을 HankookTire로 교체");
			car.tires[nPunkTire-1]=new KumhoTire(17,"뒤오른쪽");
			
				break;
			}
			System.out.println("-----------------------------------------");
		}
		System.out.println("잘 달렸습니다.");
	}

}
