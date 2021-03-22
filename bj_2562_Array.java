/* 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 버내 수인지를 구하는 프로그램을 작성하시오
 * 예를 들어, 서로 다른 9개의 자연수
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 */

package javajungsuk;

import java.util.*;

public class bj_2562_Array {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		
		int big = arr[0];
		int num = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(big<arr[i]) {
				big = arr[i];
				num = i;
			}
		}
		
		System.out.println(big);
		System.out.println(num+1);
		
	}
}
