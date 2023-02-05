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
			//현재 arr배열 요소 보여주기
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(arr[i]+" ");
			}
			
			System.out.println("메뉴를 입력해주세요:[1.삭제],[2.종료] ");
			int menu = scan.nextInt();
			System.out.println();
			
			
			if(menu == 1 ) {
				System.out.print("삭제할 값을 입력해주세요: ");
				int userNum = scan.nextInt();
				System.out.println();
				
				int idx1 = -1;
				
				for (int i = 0; i < elementCnt; i++) {
					if(arr[i] == userNum) {
						idx1 = i;
					}
				}
				
				if(idx1 == -1) {
					System.out.println("입력하신 값은 존재하지 않습니다.");
				}
				else {
					for (int i = idx1; i < elementCnt-1; i++) {
						arr[i] = arr[i+1];
					}//해당 요소를 고르면 요소+1한 값이 해당 값으로 떙겨진다.
					elementCnt--;//마지막 값의 요소는 여기에만 해당
				}
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
