package Ch11Ex;

import java.util.*;

public class C02Ex {
			public static void main(String[] args) {
				//5���� �л��� ������������ �Է¹޾� 2�����迭 ����
				//�� �л��� ������ ������ ��/��� ���ϰ�
				//�� ����� �� / ��� ���غ�����
				int [][] score = new int [5][3];
				Scanner sc = new Scanner(System.in);
				System.out.println("������ ���� �Է� >");
				for(int a = 0; a<score.length;a++) {	 //score.length = 5
					for(int b = 0;b<score[a].length;b++) {   //score[b].length = ������ ����
						score[a][b]=sc.nextInt();
					}
				}
					//�� �л���(�� ��) ������ ����/���
					int stdsum[] = new int [5];
					double stdavg[] = new double[5];
					for(int a = 0; a<score.length;a++) {	 //score.length = 5
						for(int b = 0;b<score[a].length;b++) {   //score[b].length = ������ ����
							stdsum[a]+=score[a][b];
						} stdavg[a]=stdsum[a]/3;
						}
						for(int i=0; i<5; i++) {
							System.out.printf("%d ��° �л� ���� : %d %f\n",i,stdsum[i]);
						}
						
						
					
					
					//�� ����(�� ��) ������ ����/���
				
			
			
			}
}

