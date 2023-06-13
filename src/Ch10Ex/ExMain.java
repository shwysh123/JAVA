package Ch10Ex;

class Buyer {
	private int MyMoney;
	private int AppleCnt;

	public Buyer(int myMoney, int appleCnt) {

		MyMoney = myMoney;
		AppleCnt = appleCnt;
	}

	public void Payment(Seller seller, int money) {
		// 0 MyMoney에서 money만큼 차감
		MyMoney -= money;
		// 1 seller 에게 money전달 // 2 seller로부터 사과개수받기
		int cnt = seller.Receive(money);
		// 3 사과개수를 멤버인 AppleCnt 누적
		AppleCnt += cnt;
	}

	public void ShowInfo() {
		System.out.println("=====앱등이 정보=====");
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);

	}
}

class Seller {
	private int MyMoney;
	private int AppleCnt;
	public int Price;

	public Seller(int myMoney, int appleCnt, int price) {

		MyMoney = myMoney;
		AppleCnt = appleCnt;
		Price = price;
	}

	public int Receive(int money) {
		// 1 money 를 MyMoney 에 누적
		MyMoney += money;
		// 2 money 에 해당되는 만큼 사과개수를 계산
		int revcnt = money / Price;
		// 3 AppleCnt에서 계산된 만큼의 사과개수를 차감
		AppleCnt -= revcnt;
		// 4 계산된 사과개수를 리턴
		return revcnt;
	}

	public void ShowInfo() {
		System.out.println("=====잡스 정보=====");
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
		System.out.println("개당 가격 : " + Price);
	}

}

public class ExMain {

	public static void main(String[] args) {
		Seller 스티브잡스 = new Seller(100000,100,1000); // 보유금액,사과개수,개당가격
		Buyer 맥북 = new Buyer(10000,0); // 보유금액, 사과개수
		Buyer 아이폰 = new Buyer(20000,0);
		Buyer 아이워치 = new Buyer(30000,0);
		맥북.Payment(스티브잡스, 2000);
		아이폰.Payment(스티브잡스, 15000);
		스티브잡스.ShowInfo();
		맥북.ShowInfo();
		아이폰.ShowInfo();
	}
}
