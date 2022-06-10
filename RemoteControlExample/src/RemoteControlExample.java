
public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl tv = new RemoteControl() {

		// 익명 구현 클래스	Anonymous Implemented Class
			private int volume;
			
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
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
				System.out.println("현재 TV볼륨:"+this.volume);
			}
			
			@Override
			public void setMute(boolean mute) {
				if(mute) {
					System.out.println("TV를 무음 처리 합니다.");
				} else {
					System.out.println("TV를 무음 해제 합니다.");
				}
			}
		};
		
		RemoteControl audio = new RemoteControl() {
			
			private int volume;
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
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
				System.out.println("현재 Audio 볼륨:"+this.volume);
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
