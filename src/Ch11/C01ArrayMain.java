package Ch11;

import java.util.*;

public class C01ArrayMain {

	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[4];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		System.out.println("���� : " + arr1.length); //old���ڵ�
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for (int el : arr1) {				//������ for��
			System.out.println(el);
		}
		Arrays.stream(arr1).forEach(el->{System.out.println(el);}); //Stream �޼��带 �̿��� ���
		
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		double arr2[]; // �迭�� ��������
		arr2=new double[5]; // �迭�� ���������� �迭��ü ����
		
		
	}
}
