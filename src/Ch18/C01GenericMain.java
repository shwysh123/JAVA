package Ch18;

class 재료{
	
}

class 팥 extends 재료 {
	String meterial;

	팥(String m) {
		this.meterial = m;
	}

	public String toString() {
		return meterial;
	}
}

class 피자 extends 재료 {
	String meterial;

	피자(String m) {
		this.meterial = m;
	}

	public String toString() {
		return meterial;
	}
}

class 민초 {
	String meterial;
	
	민초(String m){
		this.meterial = m;
	}
	public String toString() {
		return meterial;
	}
}

class 야채 extends 재료 {
	String meterial;

	야채(String m) {
		this.meterial = m;
	}

	public String toString() {
		return meterial;
	}
}

class 호빵<T extends 재료> {		// * extends 재료 : 제네릭타입에 들어올자료형은 재료의 하위클래스만 받는다.
	private T meterial;			//피자,야채,팥객체 연결

	호빵(T meterial) {
		this.meterial = meterial;
	}
	void showinfo() {
		System.out.println(meterial.toString()+"으로 만든 호빵....");
	}
}

public class C01GenericMain {
	public static void main(String[] args) {

		호빵<팥> ob1 = new 호빵<팥> (new 팥("단팥"));
		ob1.showinfo();
		호빵<피자> ob2 = new 호빵<피자> (new 피자("호빵맨"));
		ob2.showinfo();
		호빵<야채> ob3 = new 호빵<야채> (new 야채("모짜렐라 치즈"));
		ob3.showinfo();
//		호빵<민초> ob4 = new 호빵<민초> (new 민초("민초"));  //민초는 상속되있지 않아 불가능.
//		ob4.showinfo();
	}
}
