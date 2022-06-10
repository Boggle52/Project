
public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl tv = new RemoteControl() {

		// �͸� ���� Ŭ����	Anonymous Implemented Class
			private int volume;
			
			@Override
			public void turnOn() {
				System.out.println("TV�� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV�� ���ϴ�.");
			}
			
			@Override
			public void setVolume(int volume) {
				if(volume>RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume=RemoteControl.MIN_VOLUME;
				} else {
					this.volume=volume;
				}
				System.out.println("���� TV����:"+this.volume);
			}
			
			@Override
			public void setMute(boolean mute) {
				if(mute) {
					System.out.println("TV�� ���� ó�� �մϴ�.");
				} else {
					System.out.println("TV�� ���� ���� �մϴ�.");
				}
			}
		};
		
		RemoteControl audio = new RemoteControl() {
			
			private int volume;
			
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}
			
			@Override
			public void setVolume(int volume) {
				if(volume>RemoteControl.MAX_VOLUME) {
					this.volume=RemoteControl.MAX_VOLUME;
				} else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume=RemoteControl.MIN_VOLUME;
				} else {
					this.volume=volume;
				}
				System.out.println("���� Audio ����:"+this.volume);
			}
		};
		
//		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(7);
		tv.turnOff();
		RemoteControl.changeBattery();
		
//		Audio audio = new Audio();
		audio.turnOn();
		audio.setVolume(5);
		audio.turnOff();
		

	}

}
