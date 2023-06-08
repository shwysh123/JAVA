package Ch08Ex;

public class C02Car {
	String onwer;
	int speed = 0;
	int oil;
	int maxspeed = 200;
	void Accel() {
		System.out.println(onwer + "님이 현재속도 " + speed +"에서" + " +5 " + "로가속해서 " + (speed+5)+"입니다");
	}
	void Break(){
		System.out.println(onwer + "님이 현재속도 " + speed +"에서" + " -5 " + "로감속해서 " + (speed-5)+"입니다");
	}
	void showInfo() {
		int nowspeed = speed + 5;
		System.out.println(onwer + "님의 현재속도는 " + nowspeed + " 현재 기름량은 " + oil);
	}
	void waring() {
		System.out.println(onwer+"님 현재속도가 " + maxspeed + "에 도달할려고 합니다. 감속을 하여 속도를 " + maxspeed+ "이하로 낮추세요.");
	}
	
	
}
