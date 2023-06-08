package Ch11Ex;

import java.util.*;

public class C02Ex {
			public static void main(String[] args) {
				//5명의 학생에 국영수점수를 입력받아 2차원배열 저장
				//각 학생의 국영수 점수의 합/평균 구하고
				//각 과목당 합 / 평균 구해보세요
				int [][] score = new int [5][3];
				Scanner sc = new Scanner(System.in);
				System.out.println("국영수 점수 입력 >");
				for(int a = 0; a<score.length;a++) {	 //score.length = 5
					for(int b = 0;b<score[a].length;b++) {   //score[b].length = 각행의 길이
						score[a][b]=sc.nextInt();
					}
				}
					//각 학생별(행 별) 국영수 총합/평균
					int stdsum[] = new int [5];
					double stdavg[] = new double[5];
					for(int a = 0; a<score.length;a++) {	 //score.length = 5
						for(int b = 0;b<score[a].length;b++) {   //score[b].length = 각행의 길이
							stdsum[a]+=score[a][b];
						} stdavg[a]=stdsum[a]/3;
						}
						for(int i=0; i<5; i++) {
							System.out.printf("%d 번째 학생 점수 : %d %f\n",i,stdsum[i]);
						}
						
						
					
					
					//각 과목(열 별) 국영수 총합/평균
				
			
			
			}
}

