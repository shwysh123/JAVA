package Ch05;

import java.util.Scanner;

//class Cs {
//	static int result = 0;
//
//	static int add(int num) {
//		result += num;
//		return result;
//		}
//	static int mul(int num) {
//			result *= num;
//			return result;
//		
//	}
//}

public class C01Basic {
	public static void main(String[] args) {
		
	
////�⺻ ��� ������
	
//	int a = 10, b = 20, c;
//	System.out.println("a+b="+ (a + b));
//	System.out.println("a-b="+ (a - b));
//	System.out.println("a*b="+ (a * b));
//	System.out.println("b/a="+ (b / a)); //������ - ��
//	System.out.println("a%b="+ (a % b));//������ - ������(1.¦Ȧ������,2.�������,3.�ڸ�������,4.���ڸ����ϱ�)
//	System.out.println("-a="+ -a);

	//����	
//	�μ��� �Է� �޾� �μ��� ��/��/���� ����ϴ� ���α׷��� ��������
//	Scanner �� ����մϴ�
//	
//		System.out.println(Cs.add(3));
//		System.out.println(Cs.add(4));
//		System.out.println(Cs.mul(5));
	//���Կ�����
	//LV = RV;
	//���� = ��(�켱 ó��);		
	
	
	////���մ��� ������(���+����)
//	int a = 10;
//	a += 10; //a = a + 10;
//	a -= 5; // a = a-5;
//	a *= 3; // a = a*3;
//	System.out.println("a="+a);

	
	
	////�񱳿�����

//	int a =10;
//	int b=20;
//	System.out.println("A == B : "+ (a == b)); // a=b
//	System.out.println("A  > B : "+ (a > b));
//	System.out.println("A  < B : "+ (a < b));
//	System.out.println("A >= B : "+ (a >= b));
//	System.out.println("A <= B : "+ (a <= b));
//	System.out.println("A != B : "+ (a != b));
	
	
	
	
	////�������� 
	//AND ������	&& :  (true)&&(true) = true , �׿ܴ� ����
	//- &&��ȣ�� �������� ��/������ �Ѵ� true �̸� true
	//OR ������	|| :  t||t = t, t||f =t, f||t=t, f||f=f
	//- ||��ȣ�� �������� ��/������ �� �ϳ��� true �̸� true
	//! ������
	//- true�̸� false, false �̸� true
//	int a=10;int b=20;
//	System.out.println((a>=b)&&(a>5));
//	System.out.println((a!=b)&&(b>15));
//	
//	System.out.println((a>=b)||(a>5));
//	System.out.println((a!=b)||(b>15));
//	System.out.println((a==b)||(a<=5));
//	
//	System.out.println("false AND false = " + (true && true));
//	System.out.println("false AND true = " + (false && true));
//	System.out.println("true AND false = " + (true && false));
//	System.out.println("true AND true =  " + (false && false));

	
	
	////������������
//	boolean play = true;
//	System.out.println(play);
//
//	play = !play;
//	System.out.println(play);
//
//	play = !play;
//	System.out.println(play);
//	if(play) {
//		System.out.println("��°� ��������");
//	}
//	else {
//		System.out.println("���;�");
//	}






	////����������
	//++a(--a) : ��ġ ������ : ���� �� 1����(1����) ���� �ٸ� ������ ó��
	//a++(a--) : ��ġ ������ : �ٸ� ������ ó�� ���� �� �� 1����(1����)
//	int a = 10, b = 10, c, d;
//	
//	c = --a;
//	d = a--;
//	System.out.printf("a=%d , b=%d , c=%d, d=%d", a, b, c, d);
	

			
	////���׿�����
	// (���ǽ�)? ���ΰ�� �����ڵ� : �����ΰ�� �����ڵ�;
	int a=10;
	int score = a;
	if(score<100) {
		score+=score;
	}
	
	char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
	System.out.println(score + "���� " + grade + "����Դϴ�.");
	
	
}
}

