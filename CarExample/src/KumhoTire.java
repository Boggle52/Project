
public class KumhoTire extends Tire {
	
	KumhoTire(){};
	
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(this.location+" Kumho Tire ����: "+(maxRotation-accRotation)+"ȸ");
			return true;
		} else {
			System.out.println(this.location+" Kumho Tire ��ũ");
			return false;
		}
	}
	
}
