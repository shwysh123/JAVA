package Ch15;

interface remocon{
	void on();
	void off();
}
class TV implements remocon{
	public void on(){System.out.println("TV�� �մϴ�.");};
	public void off(){System.out.println("TV�� ���ϴ�.");};
}
class radio implements remocon{
	public void on() {System.out.println("RADIO�� �մϴ�.");};
	public void off() {System.out.println("RADIO�� ���ϴ�.");};
}

public class C01InterfaceMain {
//		public static void TurnOn();

	
}
