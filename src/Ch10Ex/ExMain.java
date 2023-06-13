package Ch10Ex;

class Buyer {
	private int MyMoney;
	private int AppleCnt;

	public Buyer(int myMoney, int appleCnt) {

		MyMoney = myMoney;
		AppleCnt = appleCnt;
	}

	public void Payment(Seller seller, int money) {
		// 0 MyMoney���� money��ŭ ����
		MyMoney -= money;
		// 1 seller ���� money���� // 2 seller�κ��� ��������ޱ�
		int cnt = seller.Receive(money);
		// 3 ��������� ����� AppleCnt ����
		AppleCnt += cnt;
	}

	public void ShowInfo() {
		System.out.println("=====�۵��� ����=====");
		System.out.println("���� �ݾ� : " + MyMoney);
		System.out.println("��� ���� : " + AppleCnt);

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
		// 1 money �� MyMoney �� ����
		MyMoney += money;
		// 2 money �� �ش�Ǵ� ��ŭ ��������� ���
		int revcnt = money / Price;
		// 3 AppleCnt���� ���� ��ŭ�� ��������� ����
		AppleCnt -= revcnt;
		// 4 ���� ��������� ����
		return revcnt;
	}

	public void ShowInfo() {
		System.out.println("=====�⽺ ����=====");
		System.out.println("���� �ݾ� : " + MyMoney);
		System.out.println("��� ���� : " + AppleCnt);
		System.out.println("���� ���� : " + Price);
	}

}

public class ExMain {

	public static void main(String[] args) {
		Seller ��Ƽ���⽺ = new Seller(100000,100,1000); // �����ݾ�,�������,���簡��
		Buyer �ƺ� = new Buyer(10000,0); // �����ݾ�, �������
		Buyer ������ = new Buyer(20000,0);
		Buyer ���̿�ġ = new Buyer(30000,0);
		�ƺ�.Payment(��Ƽ���⽺, 2000);
		������.Payment(��Ƽ���⽺, 15000);
		��Ƽ���⽺.ShowInfo();
		�ƺ�.ShowInfo();
		������.ShowInfo();
	}
}
