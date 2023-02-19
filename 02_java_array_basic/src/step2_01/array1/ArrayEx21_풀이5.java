package step2_01.array1;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삽입
 * 
 * 데이터들 중간 사이에 새로운 데이터를 추가하는 것은 삽입이라고 한다.
 * 정답을 보고 소스를 동작을 해본뒤에 , 소스를 이해하고 코드를 작성해보자.
 * 
 */

public class ArrayEx21_풀이5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while(true) {
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			if(elementCnt==5) {
				System.out.println("해당 요소가 꽉 차 있습니다.");
				break;
			}
			
			System.out.println("삽입할 인덱스 자리를 입력해주세요: ");
			int index = scan.nextInt();
			System.out.println("값을 입력해주세요 : ");
			int value = scan.nextInt();
			
			
			if(index<0 || index > elementCnt) {
				continue;
			}
			for (int i = elementCnt; i > index; i--) {
				arr[i] = arr[i-1];
			}
			
			arr[index] = value;
			elementCnt++;
			
			
			
		
		}
		
		
		


	}
}
