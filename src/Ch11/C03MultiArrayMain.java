package Ch11;

import java.nio.file.spi.FileSystemProvider;

public class C03MultiArrayMain {
		public static void main(String[] args) {
			
//			int [][] arr1 = new int[2][3];
//			arr1[0][0] = 10;
//			arr1[0][1] = 20;
//			arr1[0][2] = 30;
//			
//			arr1[1][0] = 11;
//			arr1[1][1] = 22;
//			arr1[1][2] = 33;
//			
//			System.out.println("�� ���� : " + arr1.length);
//			System.out.println("0�� ���� �� ���� : " + arr1[0].length);
//			System.out.println("1�� ���� �� ���� : " + arr1[1].length);
			
			int [][] a = {{10,20,30},{40,50,60,70},{80,90,100,110,120}
		};
			System.out.println("�� ���� : " + a.length);
			System.out.println("0��° �� �÷��� : " + a[0].length);
			System.out.println("1��° �� �÷��� : " + a[1].length);
			System.out.println("2��° �� �÷��� : " + a[2].length);
		}
}
