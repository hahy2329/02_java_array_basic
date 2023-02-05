package step2_01.array1;


import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 최종
 * 
 *  20번 21번 22번의 문제를 한 코드로 병합하여 보자.
 * 
 * 1) 추가
 * 2) 삭제
 * 3) 삽입
 * 
 *  정답 없음
 */


public class ArrayEx22_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while (true) {
			
			
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			
			System.out.println("\n1추가");
			System.out.println("2삭제");
			System.out.println("3삽입");
			System.out.println("4종료\n");
			System.out.print("입력 : ");
			selectMenu = scan.nextInt();
			
			
			if(selectMenu == 1) {
				System.out.println("추가할 값을 입력해주세요: ");
				int user = scan.nextInt();
				System.out.println();
				
				if(elementCnt==5) {
					System.out.println("해당 요소가 꽉찼습니다.");
					continue;
				}
				
				arr[elementCnt] = user;
				elementCnt++;
				
				
				
			}
			
		
			
			else if(selectMenu == 2) {
				System.out.println("삭제할 인덱스를 입력해주세요: ");
				int move = scan.nextInt();
				System.out.println();
				
				if(move<0 || move > elementCnt) {
					System.out.println("해당 인덱스를 벗어났습니다.");
					break;
				}
				
				int idx = -1;
				
				for (int i = 0; i < elementCnt; i++) {
					if(i == move) {
						idx = i;
					}
				}
				
				if(idx ==-1) {
					System.out.println("삭제할 인덱스 요소를 찾지 못했습니다.");
					continue;
				}
				
				
				for (int i = idx; i < elementCnt-1; i++) {
					arr[i] = arr[i+1];
				}
				elementCnt--;
				
			}
			
			else if(selectMenu == 3 ) {
				
				System.out.println("삽입할 인덱스 위치를 입력하세요:");
				int move = scan.nextInt();
				System.out.println();
				
				if(move<0 || move>elementCnt) {
					System.out.println("인덱스 범위를 넘어섰습니다.");
					continue;
				}
				
				if(elementCnt == 5) {
					System.out.println("해당 범위를 넘어섰습니다.");
					break;
				}
				
				System.out.println("삽입할 위치에 값을 입력해주세요: ");
				int userNum = scan.nextInt();
				
				for (int i = elementCnt; i >move; i--) {
					arr[i] = arr[i-1];
				}
				
				arr[move] = userNum;
				elementCnt++;
				
				
				
				
			}
			
		}
		
	}
	
}
