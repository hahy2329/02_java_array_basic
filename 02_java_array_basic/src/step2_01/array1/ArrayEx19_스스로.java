package step2_01.array1;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 추가
 * 
 * 프로그래밍에서 데이터의 추가는 가장 끝 (마지막)에 하는 것이 일반적인 정책이다.
 * 정답을 보고 소스를 동작을 해본뒤에 , 소스를 이해하고 코드를 작성해보자.
 * 
 */


public class ArrayEx19_스스로 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while(true) {
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			System.out.print("메뉴를 선택해주세요 :[1.추가],[2.종료] ");
			
			int menu = scan.nextInt();
			System.out.println();
			
			if(menu ==1) { //1번을 택할 경우
				System.out.print("추가할 값을 입력해주세요: ");
				int userNum = scan.nextInt();
				System.out.println();
				
				if(elementCnt == 5) {
					System.out.println("더 이상 추가할수 없습니다.");
					break;
				}
				
				
				arr[elementCnt] = userNum;
				elementCnt++;
			}
			
			else if(menu ==2) {
				System.out.println("게임을 종료하겠습니다.");
				break;
			}
		
			
		}
		System.out.println("현재 arr배열 상태를 보여드리겠습니다.");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("게임 종료!");
		
	}
	
}
