package step2_01.array1;

import java.util.Random;
import java.util.Scanner;

/*
 * # 미니마블
 * 
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 1p는 사용자가 1~3 사이의 숫자를 입력해 이동하고 2p는 랜덤값으로 1~3값으로 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p1사용자]1~3 입력 : 3 
 *
 *  1 2 3 4 5 6 7 8  
 *  0 0 0 1 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p2컴퓨터] : 3
 *  [p2컴퓨터]가 p1을 잡았다! 
 *  
 *  1 2 3 4 5 6 7 8 
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  0 0 0 2 0 0 0 0  [0바퀴]
 * [p1사용자]1~3 입력 : 
 *
 *
 *
 */

public class ArrayEx18_스스로 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0; // p1또는 p2차례일때 
		
		int idx1 = 0;	//p1 인덱스 요소
		int idx2 = 0;  // p2 인덱스 요소 
		
		p1[idx1] = 1;	// p1의 현재 위치에 1을 넣는다.
		p2[idx2] = 2;   // p2의 현재 위치에 2를 넣는다.
		
		int win1 = 0;	// p1이 한 바퀴 돌떄마다 win1이 1씩 올라감 
		int win2 = 0;	// p2가 한 바퀴 돌때마다 win2가 1씩 올라감	 
		
		
		boolean isRun = true;
		
		while(isRun) {
			//1. 게임 시작!(현 상태 보여주기!)
			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i]+" ");
			}
			System.out.println();
			
			for (int i = 0; i < p1.length; i++) { // 현재 p1의 상태 
				System.out.print(p1[i]+ " ");
			}
			System.out.println(win1 + "바퀴");
			System.out.println();
			
			for (int i = 0; i < p2.length; i++) { // 현재 p2의 상태 
				System.out.print(p2[i]+ " ");
			}
			System.out.println(win2 + "바퀴");
			System.out.println();
			
			//2. p1과 p2의 번갈아 가면서 차례가 되었을때의 진행방식
			
			if(turn %2 ==0) { // p1차례일 때
				System.out.println("p1의 이동할 만큼의 거리를 입력해주세요:(1~3) ");
				int move = scan.nextInt();
				
				p1[idx1] = 0;
				idx1 = idx1 +move;
				
				if(idx1 >=8) { //idx1이 8이상이면 한 바퀴를 다 돌고난 것으로 간주하기에 win1++을 해줌
					win1++;
				}
				
				idx1 = idx1%8;
				p1[idx1] = 1;
				
				
				
				
			}
			
			else if(turn %2 ==1) { //p2차례일 떄
				System.out.println("p2의 이동할 거리를 랜덤으로 지정하겠습니다.(1~3)");
				int move = ran.nextInt(3)+1;
				
				p2[idx2] =0;
				
				idx2 = idx2+move;
				
				if(idx2 >=8){  //idx2가 8이상이면 한 바퀴를 다 돌고난 것으로 간주하기에 win1++을 해줌
					win2++;
				}
				
				idx2 = idx2 % 8;
				p2[idx2] = 2;
			}
			
			
			//3. p1이 p2를 잡았을 경우 혹은 p2가 p1을 잡았을 경우 
			
			if(idx1 == idx2 && idx1 !=0&&turn==0) {//p1차례일 떄 p2와 같은 위치에 숫자가 놓이게 될 경우 p2를 잡게되고 p2는 다시 처음으로 돌아간다.
				p2[idx2] = 0; // p2의 현 상태 자리는 0이 되고 
				idx2 = 0; // idx2는 다시 0으로 세팅해주고
				p2[idx2] = 2; //idx2 = 0이므로, p2의 0번쨰는 다시2로 된다. 즉, 잡혔기 때문에 원점으로..
			}
			
			else if(idx2 == idx1 && idx2 !=0&&turn==1) {//p2차례일 떄 p1과 같은 위치에 숫자가 놓이게 될 경우 p1을 잡게되고 p1은 다시 처음으로 돌아간다.
				p1[idx1] = 0; // p1의 현 상태 자리는 0이 되고 
				idx1 = 0; // idx1은 다시 0으로 세팅해주고
				p1[idx1] = 1; //idx1 = 0이므로, p1의 0번쨰는 다시1로 된다. 즉, 잡혔기 때문에 원점으로..
			}
			
			turn +=1;			
			//4. 결과 보기 
			
			if(win1 ==3) {
				System.out.println("p1의 승리");
				break;//while문 까지 빠져나감.
			}
			
			else if(win2 ==3) {
				System.out.println("p2의 승리");
				break;
			}
			
			
			
			
			
			
			
			
		}
		
		System.out.println("게임 종료!");
		
		
		
		
	}
}
