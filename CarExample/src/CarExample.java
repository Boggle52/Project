
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
//				System.out.println("�տ����� HankookTire�� ��ü");
//				car.frontLeft=new HankookTire(15, "�տ���");
//				break;
//			case 2:
//				System.out.println("�տ������� KumhoTire�� ��ü");
//				car.frontRight=new KumhoTire(13, "�տ�����");
//				break;
//			case 3:
//				System.out.println("�ڿ����� HankookTire�� ��ü");
//				car.rearLeft=new HankookTire(14,"�ڿ���");
//				break;
//			case 4:
//				System.out.println("�ڿ������� KumhoTire�� ��ü");
//				car.rearRight=new KumhoTire(17,"�ڿ�����");
			
			case 1:
			System.out.println(car.tires[nPunkTire-1].location+"�� HankookTire�� ��ü");
			car.tires[nPunkTire-1]=new HankookTire(15, "�տ���");
			break;
		case 2:
			System.out.println(car.tires[nPunkTire-1].location+"�� HankookTire�� ��ü");
			car.tires[nPunkTire-1]=new KumhoTire(13, "�տ�����");
			break;
		case 3:
			System.out.println(car.tires[nPunkTire-1].location+"�� HankookTire�� ��ü");
			car.tires[nPunkTire-1]=new HankookTire(14,"�ڿ���");
			break;
		case 4:
			System.out.println(car.tires[nPunkTire-1].location+"�� HankookTire�� ��ü");
			car.tires[nPunkTire-1]=new KumhoTire(17,"�ڿ�����");
			
				break;
			}
			System.out.println("-----------------------------------------");
		}
		System.out.println("�� �޷Ƚ��ϴ�.");
	}

}
