
//부모클래스(Parent/Superclass)
//자식클래스(Child/Subclass)

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String _model, String _color, int channel) {
		this.model=_model;
		this.color=_color;
		this.channel=channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 "+this.channel+"번 DMB방송 수신을 시작합니다.");
	}
	void turnOffDmb() {
		System.out.println("채널 "+this.channel+"번 DMB방송 수신을 멈춥니다.");
	}
	void changeChannel(int _channel) {
		this.channel=_channel;
		System.out.println("채널 "+this.channel+"번으로 바꿉니다.");
	}
	
	
}
