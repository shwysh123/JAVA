package Ch13;

//메서드 오버라이딩(함수 재정의) 라이딩덮밥
//상속관계에서 상위클래스의 메서드를 하위클래스가 재정의(고쳐서사용)하는 것을 허용하는 문법
//메서드의 헤더부분은 동일하게두고 바디({})의 로직을 다르게 함으로써 같은 상위클래스로부터
//물려받은 메서드의 로직을 다양하게 둘수있다.(다형성)

class Animal{
	public void Sound() {
		System.out.println("슈슈파나");
	}
}

class Dog extends Animal{
	public void Sound() { 
		System.out.println("향긋한 피빈내가 날 부르는구나.");
	}
}

class Cat extends Animal{
	public void Sound() {
		System.out.println("발톱이건 창이건, 네 목숨은 끝이야.");
	}
}
public class C03OverridingMain {
			public static void main (String[] args) {
				Animal 나르 = new Animal();
				Dog 워윅 = new Dog();
				Cat 니달리 = new Cat();
		
				나르.Sound();
				워윅.Sound();
				니달리.Sound();
			}
}
