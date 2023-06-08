package Ch11;

import java.util.*;

public class C01ArrayMain {

	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[4];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		System.out.println("길이 : " + arr1.length); //old한코드
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for (int el : arr1) {				//개량된 for문
			System.out.println(el);
		}
		Arrays.stream(arr1).forEach(el->{System.out.println(el);}); //Stream 메서드를 이용한 방식
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		double arr2[]; // 배열형 참조변수
		arr2=new double[5]; // 배열형 참조변수에 배열객체 연결
		
		
	}
}
