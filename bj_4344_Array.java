/** 
      입력
      첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
      둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
      이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
      
     출력
     각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
     
    예제입력                                                                      예제출력
  5														
  5 50 50 70 80 100					40.000%
  7 100 95 90 80 70 60 50			57.143%
  3 70 90 80						33.333%
  3 70 90 81						66.667%
  9 100 99 98 97 96 95 94 93 91 	55.556%
 * **/


package javajungsuk;

import java.util.Scanner;

public class bj_4344_Array {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[scan.nextInt()][];
		
		for(int i=0;i<arr.length;i++) {
			
			int sum = 0;
			double avg = 0.0;
			int num = 0;
			double percent = 0.0;
			
			arr[i] = new int[scan.nextInt()];
			
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = scan.nextInt();
				sum += arr[i][j];
			}
			
			avg = (double)sum / arr[i].length;
			
			for(int k=0;k<arr[i].length;k++) {
				if((double)(arr[i][k])>avg) {
					num++;
				}
			}
			
			percent = ((int)(((double)num/(arr[i].length)*100)*1000 + 0.5))/1000.0;
			System.out.printf(String.format("%.3f", percent) + "%");
			
			
			
			
		}
		
		
		
	}
}
