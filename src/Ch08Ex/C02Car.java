package Ch08Ex;

public class C02Car {
	String onwer;
	int speed = 0;
	int oil;
	int maxspeed = 200;
	void Accel() {
		System.out.println(onwer + "���� ����ӵ� " + speed +"����" + " +5 " + "�ΰ����ؼ� " + (speed+5)+"�Դϴ�");
	}
	void Break(){
		System.out.println(onwer + "���� ����ӵ� " + speed +"����" + " -5 " + "�ΰ����ؼ� " + (speed-5)+"�Դϴ�");
	}
	void showInfo() {
		int nowspeed = speed + 5;
		System.out.println(onwer + "���� ����ӵ��� " + nowspeed + " ���� �⸧���� " + oil);
	}
	void waring() {
		System.out.println(onwer+"�� ����ӵ��� " + maxspeed + "�� �����ҷ��� �մϴ�. ������ �Ͽ� �ӵ��� " + maxspeed+ "���Ϸ� ���߼���.");
	}
	
	
}
