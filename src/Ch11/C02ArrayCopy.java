package Ch11;

import java.util.Arrays;

public class C02ArrayCopy {
		
			public static void main(String[] args) {
				int a [] = {10,20,30};
				int b [];
				b=a; //얕은 복사(주소복사)
			
				//확인
				
				System.out.println(a[0]);
			
				//깊은복사
				int c [] = new int[3];
				for(int i=0;i<a.length;i++) {
					c[i] = a[i];
					
				//깊은복사
				int d [] = Arrays.copyOf(a, a.length);
				System.out.println(d[1]);
				
				
				}
			}
}
