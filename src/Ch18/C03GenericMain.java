package Ch18;

class Tiger {
	String name;

	public Tiger(String name) {
		this.name = name;
	}

	public String toString() {
		return "Tiger [name=" + name + "]";
	}
}

class Panda {
	String name;

	public Panda(String name) {
		this.name = name;
	}

	public String toString() {
		return "Panda [name=" + name + "]";
	}
}
public class C03GenericMain {

	public static <T> void PrintInfo(T[] array) {
		for (T el : array) {
			System.out.println(el.toString());
		}
	}
	public static void PrintInfo2(Object[] array)
	{
		for(Object el : array) {
			if(el instanceof Tiger) {
				Tiger down = (Tiger)el;
				System.out.println(down);
			}
			else if(el instanceof Panda) {
				Panda down = (Panda)el;
				System.out.println(down);
			}
		}
	}

	public static void main(String[] args) {

		Tiger[] arr1 = {new Tiger("ȣ����"), new Tiger("��Ծ�"), new Tiger("ġŸ")};
			PrintInfo(arr1);
			System.out.println();
		Panda[] arr2 = {new Panda("�׼���"), new Panda("�����"), new Panda("������")};
			PrintInfo(arr2);
			System.out.println();
			Object[] arr3 = {new Tiger("������"), new Tiger("������")};
			PrintInfo2(arr3);
	
	}
	}
