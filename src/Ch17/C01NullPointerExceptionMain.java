package Ch17;
/* ���� : �� ������ �Ÿ�
 	-������ ���� : ��������(Syntxt error)
 	-������� : Runtime error
 		- �ý��� ���� : ������ ����
 		- ���� : ����� ����
 	-���� : ............ */
public class C01NullPointerExceptionMain {

		public static void main(String[] args) {
			
			try {
				String str = null;
				System.out.println(str.toString()); // NullPointerException ����ó���� �����Ǵ� ����
			}
			catch(NullPointerException e)
			{
				System.err.println("���ܹ߻�!!");
//				System.out.println(e.getCause()); // ���ܿ���
//				System.out.println(e.toString()); // ���ܰ�ü �޼���
//				System.out.println(e.getStackTrace()); // ���ܰ�ü �ĺ�����
				
				e.printStackTrace();   // ���ܳ���
			}
			
			System.out.println("�����ؾߵǴ� �ڵ�1");
			System.out.println("�����ؾߵǴ� �ڵ�2");
			
		}
}
