/* 주어진 점이 어느 사분면에 속하는지 알아내는 프로그램을 완성하시오, 예를 들어 (12,5)인 점은 
 * x, y 좌표가 다 양수이므로 제 1사분면에 속한다. 
 * 점의 좌표를 입력 받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오
 * 단 x, y좌표는 모두 양수나 음수라 가정한다.
 * <예제 입력>    <출력>
 * 12			 1
 * 5
 */

import java.util.*;

public class bj_14681_if {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0) {
			if(y>0) { // x>0, y>0
				System.out.println(1);
			} else {  // x>0, y<0
				System.out.println(4);
			}
		} else{
			if(y>0) { // x<0, y>0
				System.out.println(2);
			} else {  // x<0, y<0
				System.out.println(3);
			}
		}
	} // end of main
}
