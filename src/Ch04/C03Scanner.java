package Ch04;

import java.util.Scanner;

public class C03Scanner {

	public static void main(String[] args) {
		// �̸��� �Է��ϼ���? ȫ�浿
		// ȫ�浿 ���� ���̸� �Է��ϼ���? 35
		// ȫ�浿 ���� �ּҸ� �Է��ϼ���? �뱸������ �޼��� 000
		// ȫ�浿 ���� ���̴� 35�� �ּҴ� �뱸������ ~~ �Դϴ�

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��ϼ���?");
		String name = sc.nextLine();
		System.out.printf("%s ���� ���̸� �Է��ϼ���?", name);

		int age = sc.nextInt();
		System.out.printf("%s ���� �ּҸ� �Է��ϼ���?", name);
		sc.nextLine();
		String addr = sc.nextLine();
		System.out.printf("%s ���� ���̴� %d��, �ּҴ� %s �Դϴ�", name, age, addr);

	}


}
