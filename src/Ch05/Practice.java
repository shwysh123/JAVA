package Ch05;

import java.util.Scanner;

public class Practice {

public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		if(n%2==0) {
			if(n%3==0) {
				System.out.println("¦���̸鼭 3�� ��� : " + n);
			}
			}
		
		else if(n%5==0) {
				System.out.println("Ȧ���̸鼭 5�� ��� : " +n);
		}
		else {
			System.out.println("�̰͵� ���͵� �ƴϴ�.");
		}	
		
			}

}
