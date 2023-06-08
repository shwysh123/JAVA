package Ch08;

import java.util.Scanner;

class C03Person {
	//속성(멤버변수)
	String name;
	int age;
	float height;
	double weight;
//	//기능(멤버함수,멤버메서드)
//		말하다
		void talk() 
	{ System.out.println(name + " 님이 말합니다. ");
	}
//		걷다
  void walk(){
	System.out.println(name + " 님이 걷습니다. ");
		}
//	속성정보확인
		void showInfo() {
		System.out.printf("%s %d %f %f",name,age,height,weight);
	}
}

public class C03PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C03Person park = new C03Person();
		park.name="박영민";
		park.age=30;
		park.height=183.5f;
		park.weight=83.5;
		System.out.printf("%s %d %.1f %.0f",park.name,park.age,park.height,park.weight);
		park.talk();
		park.walk();
		park.showInfo();
	}
		
}
