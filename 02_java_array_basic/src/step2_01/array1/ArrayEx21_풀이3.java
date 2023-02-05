package step2_01.array1;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삽입
 * 
 * 데이터들 중간 사이에 새로운 데이터를 추가하는 것은 삽입이라고 한다.
 * 정답을 보고 소스를 동작을 해본뒤에 , 소스를 이해하고 코드를 작성해보자.
 * 
 */

public class ArrayEx21_풀이3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		//삽입은 삽입할 위치를 제외한 그 이후의 값들이 한 칸씩 뒤로 밀림
		
	
		
		while(true) {
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.println("메뉴를 선택해주세요:[1.삽입] ");
			selectMenu = scan.nextInt();
			System.out.println();
		
			if(selectMenu == 1) {
				System.out.println("삽입할 위치를 선택해주세요: ");
				int idx = scan.nextInt();
				System.out.println();
				
				if(elementCnt == 5) {
					System.out.println("해당 요소는 꽉차 있습니다.");
					break;
				}
				if(idx<0 || idx >elementCnt) {
					System.out.println("해당 범위를 넘어섰습니다.");
					continue;
				}
				System.out.println("삽입할 위치에 값을 입력해주세요:");
				int userNum = scan.nextInt();
				
				//삽입은 삽입할 위치를 제외한 그 이후의 값들이 한 칸씩 뒤로 밀림
				for (int i = elementCnt; i > idx; i--) {
					arr[i] = arr[i-1];
				}
				
				arr[idx] = userNum;
				elementCnt++;
				
			
			
			}
		}
		
		
		
		
		
		
			
			
			
			
			
			
			
			


	}
}
