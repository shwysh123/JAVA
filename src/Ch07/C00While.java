package Ch07;

import java.util.*;

public class C00While {
	public static void main(String[] args) {

	int a = 0; // ������
	int b = 0; // ����
	int c = 0; // ��
	while (a<6) {
		b=0;// ����
		while(b<=a-1) {
			System.out.print(" ");
			b++;
			if(a<14) 
				System.out.print(" ");
			
		}
		c=0;// ��
		while(c<=(b+5)*2-(4*a)) {
			System.out.print("*");
			c++;
		}
		System.out.println();
		a++;
	}
		
		
	}		
}

