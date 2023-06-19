package Ch18Ex;

class meterial{
	
}

class 캬라멜 extends meterial{
	String 재료;
	
	캬라멜(String m){
		this.재료 = m;
	}
	public String toString() {
		return 재료;
	}
	
}
class 버터옥수수 extends meterial{
	String 재료;
	
	버터옥수수(String m){
		this.재료 = m;
	}
	public String toString() {
		return 재료;
	}
	
}
class 민초{
	String 재료;
	
	민초(String m){
		this.재료 = m;
	}
	public String toString() {
		return 재료;
	}
}

public class PopCorn<T extends meterial> {
	private T 재료;
	PopCorn(T 재료){
		this.재료 = 재료;
	}
	void Showinfo() {
		System.out.println(재료.toString()+"(으)로 만든 팝콘..");
	}
		public static void main(String[] args) {
			
			PopCorn<캬라멜> ob1 = new PopCorn<캬라멜>(new 캬라멜("오렌지 캬라멜"));
			ob1.Showinfo(); //"캬라멜맛 팝콘"이 출력
			PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수("니어금니 4개 내어금니 4개"));
			ob2.Showinfo(); //"버터옥수수맛 팝콘"이 출력
//			PopCorn<민초> ob3 = new PopCorn<민초>(new 민초(""));
//			ob3.Showinfo(); //민초맛은 제너릭으로 선택되지 않도록 합니다.
			
		}
}
