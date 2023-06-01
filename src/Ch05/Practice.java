package Ch05;

import java.util.Scanner;

public class Practice {

public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		if(n%2==0) {
			if(n%3==0) {
				System.out.println("짝수이면서 3의 배수 : " + n);
			}
			}
		
		else if(n%5==0) {
				System.out.println("홀수이면서 5의 배수 : " +n);
		}
		else {
			System.out.println("이것도 저것도 아니다.");
		}	
		
			}

}
