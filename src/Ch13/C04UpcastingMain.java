package Ch13;

class Super{
	int n1;
}

class Sub extends Super{

	char A;
}

public class C04UpcastingMain {
		
			public static void main(String[] args) {
//NoneCasting
				Super ob1 = new Super();
				ob1.n1=10;
				Sub ob2 = new Sub();
				ob2.n1=10;
//				ob2.n2=30;
//UpCasting
//����Ŭ������ ��������=������ü
//�ڵ�����ȯ
				Super ob3= new Sub();
				ob3.n1=10;
//				ob2.n1=ob3.n1;
				
//DownCasting
//����Ŭ������ ��������=����Ŭ������ ��ü
//��������ȯ
				
//				Sub down = ob3;
//				Sub up = (Sub)ob3;
//				up.n1=100;
				
				System.out.println(ob2.n1==ob3.n1);
			}
}
