package Ch08Ex;

public class C01CarMain {
	
	public static void main(String[] args) {
		
		C02Car car = new C02Car();
		car.onwer = "½´ÆÛ ¸¶¸®¿À";
		car.speed = 80;
		car.oil = 100;
		car.Accel();
		car.Break();
		car.showInfo();
		car.waring();
		
	}
}
