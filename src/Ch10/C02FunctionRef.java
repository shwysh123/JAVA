package Ch10;

class TV {
	BasicController basicController;
	ExtraController extraController;

	TV() {
		basicController = new BasicController();
		extraController = new ExtraController();
	}
	void TvInfo() {
		basicController.showinfo();
	}
}

//Basic Controller
// - on/off
// - ChanegeChannel
// - SetVolume
class BasicController {
	ONOFF onoff;
	Channel channel;
	Volume volume;
	void setOnoff(ONOFF onoff) {
		this.onoff = onoff;
	}
	void setChannel(Channel channel) {
		this.channel = channel;
	}
	void setVolume(Volume volume) {
		this.volume = volume;
	}
	void showinfo() {
		System.out.println("현재 ONOFF : "+ onoff.isOn);
		System.out.println("현재 Channel : "+ channel.curChannel);
		System.out.println("현재 Volume : "+volume.curVolume);
	}
}

class ONOFF {
	boolean isOn;
	void ON() {System.out.println("POWER ON"); isOn=true;
	}

	void OFF() {System.out.println("POWER OFF"); isOn=false;
	}
}

class Channel {
	int curChannel;
	void setChannel(int channel) {
		curChannel = channel;
	}
}

class Volume {
	int curVolume;
	void setVolume(int volume) {
		curVolume= volume;
	}
}

//Extra Controller
// Module - InternetSearching
// Module - Netflex
class ExtraController {

}

public class C02FunctionRef {

	public static void main(String[] args) {
			TV tv1 = new TV(); // basicController,extraController
			tv1.basicController.setOnoff(new ONOFF());
			tv1.basicController.setChannel(new Channel());
			tv1.basicController.setVolume(new Volume());
			
			tv1.basicController.onoff.OFF();
			tv1.basicController.channel.setChannel(91);
			tv1.basicController.volume.setVolume(32);
			
			tv1.TvInfo();
	}
}
