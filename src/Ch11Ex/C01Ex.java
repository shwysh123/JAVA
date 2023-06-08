package Ch11Ex;

import java.util.*;

public class C01Ex {
		
		public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			int [] b = new int [5];
			for(int i=0; i<b.length; i++) {
				b[i]=sc.nextInt();
				System.out.println(Arrays.stream(b).max().getAsInt());
				System.out.println(Arrays.stream(b).min().getAsInt());
				System.out.println(Arrays.stream(b).sum());}
//				int max = b[0];
//				int min = b[0];
//				int sum = 0;
//				for (int el : b){
//					if(max<el) {
//						max = el;
//					}
//					if(min>el) {
//						min = el;
//					}
//					sum += el;
//				}
//				System.out.printf("%d %d %d",max,min,sum);
//			}			
//			
				
			
			
		
		}
	//5개의 정수값을 입력받아 int형 배열에 저장하고
	//최대값,최소값,전체합을 출력합니다.
	
	
}
