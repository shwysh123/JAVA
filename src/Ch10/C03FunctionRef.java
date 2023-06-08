package Ch10;

class 냉장고 {
	냉장고() {
	}
	디스플레이 display;
	냉장실 section1;
	냉동실 section2;
	제어컨트롤러 controller;
}

class 디스플레이 {
	void showinfo() {
		System.out.println("냉장실 물건 개수 : ");
		System.out.println("냉동실 물건 개수 : ");
		System.out.println("온도 정보 : ");
	}
}

class 냉동실 {
	int cnt;

	void setInsert(String Object) {
		cnt++;
	}
}

class 냉장실 {
	int cnt;

	void setInsert(String Object) {
		cnt++;
	}
}

class 제어컨트롤러 {
	int 에너지효율; // 시간당 사용전력양
	private int 냉장실온도; // 최고온도 최저온도
	private int 냉동실온도;

	public int get냉장실온도() {
		return 냉장실온도;
	}

	public void set냉장실온도(int 냉장실온도) {
		this.냉장실온도 = 냉장실온도;
	}

	public int get냉동실온도() {
		return 냉동실온도;
	}

	public void set냉동실온도(int 냉동실온도) {
		this.냉동실온도 = 냉동실온도;
	}

	public int get에너지효율() {
		return 에너지효율;
	}

	public void set에너지효율(int 에너지효율) {
		this.에너지효율 = 에너지효율;
	}

}

public class C03FunctionRef {

	public static void main(String[] args) {
			냉장고 ref = new 냉장고();
			
	}
}
