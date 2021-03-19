/* 0<n, n<100인 정수 n이 있을때 다음과 같이 연산할 수 있다. 먼저 주어진 수가 10보다 작으면 앞에 0을 붙여 두자리 수로 만들고
 * 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙여 새로운 수를 만든다
 * 예시를 보면 26이 시작일때, 2+6=8이고 새로운 수는 68이다.6+8=14이다. 새로운 수는 84이다. 8+4=12이며 새로운 수는 42이다.
 * 4+2=6이며 새로운 수는 26이다. 위의 예는 4번만에 원래 수로 돌아온다. 따라서 26의 사이클 길이는 4이다.
 * 정수 n이 주어졌을 때, n의 사이클 길이는 구하는 프로그램을 작성해라.
 */

 
import java.util.*;
 
public class bj_1110_while {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int answer = input; // 입력값의 복사값 
		int count = 0; // 사이클 횟수 
		if(input>=10) { // 입력값이 10보다 클 때 
			while(true) {
				int x = input/10;
				int y = input%10;
				int result = (y*10) + ((x+y)%10);
				count++;
				
				if(result==answer) {
					System.out.println(count);
					break;
				}
 
				x = result/10;
				y = result%10;
				input = (y*10) + ((x+y)%10);
				count++;
				
				if(answer==input) {
					System.out.println(count);
					break;
					}
			}
				
		} else { // 입력값이 10보다 작을때 
			int x = 0;
			int y = input;
			int result = y*10 + y;
			count++;
			
			if(input==result) {
				System.out.println(count);
			}else {
				while(true) {
					x = result/10;
					y = result%10;
					input = (y*10) + ((x+y)%10);
					count++;
					
					if(input==answer) {
						System.out.println(count);
						break;
					}
 
					x = input/10;
					y = input%10;
					result = (y*10) + ((x+y)%10);
					count++;
					
					if(result==answer) {
						System.out.println(count);
						break;
						}
					}
				}
			}
		
		}
	}
