package Ch18Ex;

class meterial{
	
}

class ļ��� extends meterial{
	String ���;
	
	ļ���(String m){
		this.��� = m;
	}
	public String toString() {
		return ���;
	}
	
}
class ���Ϳ����� extends meterial{
	String ���;
	
	���Ϳ�����(String m){
		this.��� = m;
	}
	public String toString() {
		return ���;
	}
	
}
class ����{
	String ���;
	
	����(String m){
		this.��� = m;
	}
	public String toString() {
		return ���;
	}
}

public class PopCorn<T extends meterial> {
	private T ���;
	PopCorn(T ���){
		this.��� = ���;
	}
	void Showinfo() {
		System.out.println(���.toString()+"(��)�� ���� ����..");
	}
		public static void main(String[] args) {
			
			PopCorn<ļ���> ob1 = new PopCorn<ļ���>(new ļ���("������ ļ���"));
			ob1.Showinfo(); //"ļ���� ����"�� ���
			PopCorn<���Ϳ�����> ob2 = new PopCorn<���Ϳ�����>(new ���Ϳ�����("�Ͼ�ݴ� 4�� ����ݴ� 4��"));
			ob2.Showinfo(); //"���Ϳ������� ����"�� ���
//			PopCorn<����> ob3 = new PopCorn<����>(new ����(""));
//			ob3.Showinfo(); //���ʸ��� ���ʸ����� ���õ��� �ʵ��� �մϴ�.
			
		}
}
