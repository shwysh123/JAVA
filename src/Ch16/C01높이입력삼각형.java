package Ch16;

import java.util.*;

public class C01높이입력삼각형 {
		public static void main(String[] args) {
			
		
	Scanner sc = new Scanner(System.in);
	 	System.out.print("높이 입력 : ");
	 	int a = sc.nextInt();
	 			for(int i=0;i<a;i++) {
	 				for(int l=i;l<a;l++) {
	 					
	 					System.out.print(" ");
	 				}
	 				for(int j=1;j<=(i*2)+1;j++) {
	 					System.out.print("*");
	 				
	 				}
	 				System.out.println();
	 			}
		}
}
