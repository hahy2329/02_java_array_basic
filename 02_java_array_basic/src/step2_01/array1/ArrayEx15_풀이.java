package step2_01.array1;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임
 * 
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 2
 * 입력2 : 4
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 * 
 * 입력1 : 5
 * 입력2 : 7
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 2, 0, 2, 0, 0]
 * 
 */

public class ArrayEx15_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		int cnt  = 0;
		boolean isRun = true;
		// 셔플 구현(Shuffle) : 배열의 요소들을 무작위로 섞음
		while (cnt < 1000) {			
			int tempRan = ran.nextInt(9) + 1;
			int temp = front[0]; 
			front[0] = front[tempRan];
			front[tempRan] = temp;
			cnt++;
		}
			
		for (int i=0; i<front.length; i++) {    // front는 해당 배열 요소값들이 저장된 것 
			System.out.print(front[i] + " ");
		}
		System.out.println();
		for (int i=0; i<front.length; i++) {  //back은 front에 있는 배열 요소들을 입력해 서로 맞으면 back에 저장
			System.out.print(back[i] + " ");
		}
		System.out.println();
		
		int count = 0;
		
		
		while(isRun) {
			System.out.print("요소의 위치를 입력해주세요 : ");
			int userNum = scan.nextInt();
			System.out.println();
			
			System.out.println("요소의 위치를 한번 더 입력해주세요: ");
			int userNum2 = scan.nextInt();
			System.out.println();
			
			if(front[userNum] == front[userNum2]) {
				back[userNum] = front[userNum];
				back[userNum2] = front[userNum2];
			}
			
			else {
				System.out.println("서로 요소의 값이 같지 않습니다.");
			}
			
			for (int i = 0; i < back.length; i++) { //0~9개까지 있음
				if(back[i] !=0) {  
					count++;
					
				}
				
				else {
					continue;
				}
			}
			
			if(count ==)
			
			
			
			
			
			
		}
		
		
		
		
		
		
			
			
	}
	
}
