package Ch08;

import java.util.Scanner;

class C03Person {
	//�Ӽ�(�������)
	String name;
	int age;
	float height;
	double weight;
//	//���(����Լ�,����޼���)
//		���ϴ�
		void talk() 
	{ System.out.println(name + " ���� ���մϴ�. ");
	}
//		�ȴ�
  void walk(){
	System.out.println(name + " ���� �Ƚ��ϴ�. ");
		}
//	�Ӽ�����Ȯ��
		void showInfo() {
		System.out.printf("%s %d %f %f",name,age,height,weight);
	}
}

public class C03PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C03Person park = new C03Person();
		park.name="�ڿ���";
		park.age=30;
		park.height=183.5f;
		park.weight=83.5;
		System.out.printf("%s %d %.1f %.0f",park.name,park.age,park.height,park.weight);
		park.talk();
		park.walk();
		park.showInfo();
	}
		
}
