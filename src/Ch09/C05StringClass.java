package Ch09;

import java.util.*;

public class C05StringClass {

	public static void main(String[] args) {
	
//		int alength, blength;
//		char achar, bchar;
//		String str1 = new String("java Powerful");
//		String str2 = new String("java Programming");
//		String str3 = str1 + str2;
//			
//		System.out.println(str3);
//		
//		alength = str1.length();
//		blength = str2.length();
//		achar = str1.charAt(5);
//		bchar = str2.charAt(10);
//		System.out.println("Str1�� ���� ="+str1 + " ���� = "+alength);
//		System.out.println("Str2�� ���� ="+str2 + " ���� = "+blength);
//		System.out.println("Str1�� 5��° ���� ="+achar);
//		System.out.println("Str1�� 10��° ���� ="+bchar);
//		System.out.println("Str1�� �빮�ڷ� ��ȯ : "+str1.toUpperCase());
//		System.out.println("Str1�� �ҹ��ڷ� ��ȯ : "+str1.toLowerCase());
//		System.out.println("Str2�� a�� A�� ��ȯ : "+str2.replace('a','A'));
//		System.out.println("----------------------------");

//		
		//trim() : �յ� ���� ���� 
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		
		System.out.println(tmp);
		System.out.println(tmp.trim());
		//subString() : ���ڿ� �ڸ���
		System.out.println(tmp.substring(2));
		System.out.println(tmp.substring(2,5));
		//indexOf("���ڿ�") : ���ڿ��� index��ȣ Ȯ��
		System.out.println(tmp.indexOf("H"));
		//lastIndexOf("���ڿ�") : ���ڿ��� index��ȣ Ȯ��
		System.out.println(tmp.lastIndexOf("H"));
		//contains("���ڿ�") : ���ڿ� ���Կ���
		System.out.println(tmp.contains("HE"));
		//split("������") : �����ڸ� �������� ���ڿ��� ����(�迭������ ����)
		String arr[] = tmp.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.printf("arr[%d] = %s\n",i,arr[i]);
		}
		
	}
}


