package Ch09;

public class C04StringClass {

		public static void main(String[] args) {
			String str1="java";
			String str2="java";
			
			String str3= new String("java");
			String str4= new String("java");
			
			System.out.println("str1 == str2 : " + (str1==str2));
			System.out.println("str3 == str4 : " + (str3==str4));
			System.out.println("str1 == str3 : " + (str1==str3));
			System.out.println("str1 == str4 : " + (str1==str4));
			
			//equals �޼��带 ����Ͽ� ���ڿ� ��ü ���ϱ�
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println("str1 == str2 : " + (str1.equals(str2)));
			System.out.println("str3 == str4 : " + (str3.equals(str4)));
			System.out.println("str1 == str3 : " + (str1.equals(str3)));
			System.out.println("str1 == str4 : " + (str1.equals(str4)));
		}
}
