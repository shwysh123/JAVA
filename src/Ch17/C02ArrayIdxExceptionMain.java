package Ch17;

public class C02ArrayIdxExceptionMain {

		public static void main(String[] args) {
			
			int arr[] = {10,20,30};
			
			try{
				for(int i = 0 ; i < 4 ; i ++)
					System.out.println(arr[i]);{
			}
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.print("arr�迭�� ������ �ʰ��Ͽ� ����� �õ��Ͽ����ϴ�.\n�������� : " );
				e.printStackTrace();
			}
			System.out.println("Hell");
			System.out.println("��Ű");
		}
}
