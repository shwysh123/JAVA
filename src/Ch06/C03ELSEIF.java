package Ch06;

import java.util.Scanner;

public class C03ELSEIF {
	public static void main(String[] args) {
		// 90���̻� : A				x >= 90
				// 80 �̻� 90�� �̸� : B		80<=x<90
				// 70 �̻� 80�� �̸� : C		70<=x<80
				
				// ����(40��) / ����(40��) / ����(40��)
				// ����<40 -���հ�
				// ����<40 -���հ�
				// ����<40 -���հ�
				// ���<60 -���հ�
				// �׿� : �հ�
				
				Scanner sc = new Scanner(System.in);
				int kor=sc.nextInt(), eng=sc.nextInt(), mat=sc.nextInt();
				double avg=(double)(kor+eng+mat)/3;
				
				if(kor<40) {
					System.out.println("���հ�");
				}else if(eng<40) //kor>=40 
				{
					System.out.println("���հ�");
				}else if(mat<40) //kor>=40 && eng>=40
				{
					System.out.println("���հ�");
				}else if(avg<60) //kor>=40 && eng>=40 && mat>=40
				{
					System.out.println("���հ�");
				}else 
				{
					System.out.println("�հ�");
				}
				
				
				
				
				
				/*
				int num=80;
				
				if(num>=90)
				{
					System.out.printf("A");
				}
				else if(num>=80)
				{
					System.out.printf("B");
				}
				else if(num>=70)
				{
					System.out.printf("C");
				}
				else if(num>=60)
				{
					System.out.println("D");
				}
				else
				{
					
				}
				*/
				
				//���̺��� ����� �ΰ��ϴ� else if���� ���弼��
				//8�� �̸�  : ����� 1000��
				//14���̸� : ����� 2000��
				//20���̸� : ����� 2500��
				//20���̻� : ����� 3000��
				
//				Scanner sc = new Scanner(System.in);
//				int charge=0;
//				int age=sc.nextInt();
//				if(age<8) {
//					charge=1000;
//				}else if(age<14) {
//					charge=2000;
//				}else if(age<20) {
//					charge=2500;
//				}else {
//					charge=3000;
//				}
//				System.out.printf("���� : %d ��� : %d\n", age,charge);
				
				//����
				
				//���� ������ �Է¹޾� 90 ~ 100���� A, 
				//80 ~ 89���� B, 70 ~ 79���� C, 
				//60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
				
				// score >= 90 A
				// score >= 80 B
				// score >= 70 C
				// score >= 60 D
				// �׿� F
				//or
				// score <60 F
				// score <70 D
				// score <80 C
				// score <90 B
				// �׿� A
				
//				Scanner sc = new Scanner(System.in);
//				int score = sc.nextInt();
//				if(score <60){
//					System.out.println("F");
//				}else if(score <70) {
//					System.out.println("D");
//				}else if(score <80) {
//					System.out.println("C");
//				}else if(score <90) {
//					System.out.println("B");
//				}else {
//					System.out.println("A");
//				}
	}
}
