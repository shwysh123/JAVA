package Ch15;

interface remocon{
	void on();
	void off();
}
class TV implements remocon{
	public void on(){System.out.println("TV¸¦ ÄÕ´Ï´Ù.");};
	public void off(){System.out.println("TV¸¦ ²ü´Ï´Ù.");};
}
class radio implements remocon{
	public void on() {System.out.println("RADIO¸¦ ÄÕ´Ï´Ù.");};
	public void off() {System.out.println("RADIO¸¦ ²ü´Ï´Ù.");};
}

public class C01InterfaceMain {
//		public static void TurnOn();

	
}
