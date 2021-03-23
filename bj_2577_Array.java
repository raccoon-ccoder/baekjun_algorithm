/** 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를
 *  구하는 프로그램을 작성하시오. 
 *  예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
 *  계산한 결과  17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 *  
 *  입력
 *  첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.
 *  
 *  출력
 *  첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 
 *  마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
 */

package javajungsuk;

import java.util.*;

public class bj_2577_Array {

	public static void main(String[] args) {
	
		
		Scanner s = new Scanner(System.in);
		
		// 3개의 입력받는 숫자를 저장할 변수 
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		// a,b,c 곱한 수를 문자열로 만든 후 char[] 배열로 쪼개서 비교 
		String num = a*b*c + "";
		char[] ch = num.toCharArray();
		
		// 각 숫자가 몇번 나왔는지 횟수를 저정할 배열 
		int[] result = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<ch.length;j++) {
				if(ch[j]==(i+'0'))
					result[i] += 1;
			}
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}
}
