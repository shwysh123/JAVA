package Ch06;

import java.util.Scanner;

public class C02IF {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		if(n%2==0 && n%3==0)
			System.out.println("¦���̸鼭 3�ǹ�� : " + n);
		else if(n%2!=0 && n%3==0)
			System.out.println("Ȧ���̸鼭 3�ǹ�� : " + n);
		else if(100>n)
			System.out.println("100���� ���� ��� : " + n);
		else System.out.println("�� �� �� �� : " + n);
	}

}
