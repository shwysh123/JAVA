package Ch07;

import java.util.Scanner;

public class C04For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		for(int i = 0; i<h ; i++) 
		{  
			System.out.println();
			for(int j = 0;j<=(h-1)-i;j++) {
				System.out.print("*");
		}
		
		}
			
			
		
		}
	
}
