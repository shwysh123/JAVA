package Ch06;

import java.util.Scanner;

public class C02IF {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		if(n%2==0 && n%3==0)
			System.out.println("짝수이면서 3의배수 : " + n);
		else if(n%2!=0 && n%3==0)
			System.out.println("홀수이면서 3의배수 : " + n);
		else if(100>n)
			System.out.println("100보다 작은 어떤수 : " + n);
		else System.out.println("그 외 의 수 : " + n);
	}

}
