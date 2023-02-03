package step2_01.array1;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삭제
 * 
 * 정답을 보고 소스를 동작을 해본뒤에 , 소스를 이해하고 코드를 작성해보자.
 * 
 */



public class ArrayEx20_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int elementCnt = 5;
		int selectMenu = 0;
		
		while(true) {
			
			System.out.println("현재 상태를 보여드리겠습니다.");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.print("메뉴를 선택해주세요:[1.삭제],[2.종료] ");
			int menu = scan.nextInt();
			System.out.println();
			
			if(menu == 1) {
				System.out.println("삭제 할 값을 입력해주세요 : ");
				int userNum = scan.nextInt();
				
				
				int delIdx = -1;
				
				for (int i = 0; i < elementCnt; i++) {
					if(arr[i]==userNum) {
						delIdx = i;
					}
					
					
				}
				if(delIdx == -1) {
					System.out.println("현재 값은 존재하지 않습니다.");
					
				}
				
				else {
					for (int i = delIdx; i < elementCnt-1; i++) {
						arr[i] = arr[i+1];
					}
					elementCnt--;
				}
				
			}
			
			else if(menu ==2) {
				break;
			}
			
			
			
			
		}
		
		
	}

}
