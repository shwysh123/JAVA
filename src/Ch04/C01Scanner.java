package Ch04;
// ���Է� �ޱ� Scanner ����ϱ�   ���� ��ȯ ��Ʈ�� + ����Ʈ + O
import java.util.Scanner;

public class C01Scanner {
 public static void main(String[] args) {
	 	//System.out 	: ǥ�� ��� ��Ʈ�� ���� - �����
		//System.in 	: ǥ�� �Է� ��Ʈ�� ���� - Ű����
		//new Scanner(System.in)
		//Ű����� ���� ���޵Ǵ� �����͸� ���� �� �ִ� Scanner��ġ�� ����
		//Scanner sc = new Scanner(System.in);
		// Scanner��ġ�� main�Լ������� ����(���)�� �� �ֵ��� 
		// �������� sc ����
	 
	 	Scanner scanner = new Scanner(System.in);
	 	
	 	int a = scanner.nextInt();
	 	int b = scanner.nextInt();
	 	int c = scanner.nextInt();
	 	int d = scanner.nextInt();
	 	int e = a+b+c+d;
	 	System.out.printf("%d+%d+%d+%d = %d \n" , a,b,c,d,e);
	 	scanner.close();
}
}
