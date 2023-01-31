package step2_01.array1;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1단계] : 1 to 4
 * 
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 가장 작은수 1부터(다음은 2) 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 
 * 예)
 * [ 4 2 3 1 ]
 * 
 * 입력 : 3  (가장 작은수 1이 3번째에 위치 )
 * 4 2 3 9
 * 입력 : 1  ( 그 다음으로 작은 수 2가 1번째에 위치 )
 * 4 9 3 9
 * 입력 : 2  ( 그 다음으로 작은 수 3이 2번째에 위치 )
 * 4 9 9 9
 * 입력 : 0  ( 그 다음으로 작은 수 4가 0번째에 위치 )
 * 9 9 9 9
 * 
 * 코드 종료
 */


public class ArrayEx16_풀이 {

	public static void main(String[] args) {
		
		int[] arr = new int[4];
		boolean[] isCheck = new boolean[4];
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		while(i<arr.length) {
			int r = ran.nextInt(4);
			
			if(!isCheck[r]) {
				isCheck[r] = true;
				arr[i++] = r+1;
			}
			
		} // arr배열 요소 모두 생성 완료
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		
		int count = 0;
		int correct = 1;
		boolean isRun = true;
		
		while(isRun) {
			
			System.out.print("arr배열에서 해당 요소중 가장 작은 값의 위치부터 입력하세요 : (0~3)");
			int index1 = scan.nextInt();
			if(arr[index1] == correct) {
				arr[index1] = 9;
				count++;
				correct++;
			}
			
			
			if(count ==4) {
				isRun =false;
			}
	
			
			
			
			
			
			
		}
		
		System.out.println("arr배열의 모든 요소가 9로 채워졌기에 게임을 종료합니다.");
		scan.close();
		
		
			
		
		
		
		
		
		
		
		
	}
	
}
