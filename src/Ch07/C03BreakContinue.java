package Ch07;

public class C03BreakContinue {
	public static void main(String[] args) {
		
		//1 break
				// -1�� �Է��ϱ� ������ ��� �������� �޾� ���� ���� ���
		

//		int dan = 2;
//		int i = 1;
//		Exit:
//		while(dan<=9) {
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				if(dan==7 && i==7)
//					break Exit;
//				i++;
//			}
//			
//			System.out.println();
//			
//			dan++;
			
		
		
		
		
//				Scanner sc = new Scanner(System.in);
//				int n;
//				int sum=0;
//				while(true)
//				{
//					n=sc.nextInt();
//					if(n==-1) {
//						break;
//					}
//					sum+=n;
//				}
//				System.out.println("SUM = " + sum);
				
				
			
				//2 continue
				// 1���� 10������ ���߿� 3�� ����� ������ �� ���
				
				int i=1;
				int sum=0;
				while(i<=10)
				{
					if(i%3==0) {

						
						i++;
						continue; //������ �ݺ����� ���ǽ����� ���ư�
					}
					System.out.println("i=" + i);
					sum+=i;
					i++;
					
				}
				System.out.println("SUM = " + sum);
				
			}
}
