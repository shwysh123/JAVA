package Ch04;

import java.util.Scanner;

public class C02Sacnner {

			public static void main(String[] args) {
				System.out.println("-----------Scanner Test ----------");
				Scanner sc = new Scanner(System.in);
				
//				System.out.print("���� �Է� :");
//				int num1 = sc.nextInt();
//				System.out.println("�Էµ� ���� �� : "+num1);
//				
//				System.out.print("�Ǽ� �Է� :");
//				double num2 = sc.nextDouble();				System.out.println("�Էµ� �Ǽ� �� : "+num2);
//				
//				System.out.print("���ڿ� �Է� :");
//				String str1 = sc.next();		//���ڿ��Է¹ޱ����Լ�,����� ���������ʴ´�
//				System.out.println("�Էµ� ���ڿ� : "+str1);
//				System.out.print("�Է� : ");
//				String s1 = sc.next();
//				String s2 = sc.next();
//				String s3 = sc.next();
//				System.out.printf("���ڿ� : %s %s %s\n",s1,s2,s3);
				
//				System.out.println("���ڿ� �Է�: ");
//				String str = sc.nextLine();
//				System.out.println("���ڿ� : " + str);
				
//				sc.nextLine();	//���۰����� �����ִ� �����Ͱ��� �ʱ�ȭ
//				
//				System.out.printf("�� �Է� : " );
//				int num = sc.nextInt();
//				
//				System.out.print("���ڿ� �Է�(�������� ���ڿ�) : ");
//				String str= sc.nextLine();	//���ڿ��Է¹ޱ����Լ�,���⵵ �����Ѵ�
//
//				System.out.print("Ȯ�� : "  + str);
			
				//���ǻ���!! �������� ���� Scanner�� ������
				System.out.print("������ �Է� : ");
				int n1 = sc.nextInt();
				System.out.println("������ : " + n1);
				System.out.print("�Ǽ��� �Է� : ");
				double n2 = sc.nextDouble();
				//���⼭ �����߻�!
				System.out.print("���ڿ� �Է� : ");
				String str = sc.next();
				System.out.println("���ڿ� : "+ str);
				System.out.println("���α׷��� �����մϴ�..");
				
				
				
	}
}
