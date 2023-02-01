package step2_01.array1;

import java.util.Scanner;

public class ArrayEx24_테스트문제1_1 {

	public static void main(String[] args) {
		
		
		int[] a = { 10, 4, 5, 3, 1 };
		int sum = 0;
		
		
		
		// 문제 1) 위 배열를 이용해서 전체 요소의 합출력
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			
		}
		
		System.out.println("전체 합은 " + sum + "입니다.");
		System.out.println();
		// 문제 2) 값을 입력하면 인덱스 출력
		// 예) 5 ==> 2  ,  1 ==> 4
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요: ");
		int user = scan.nextInt();
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == user) {
				System.out.println(i);
			}
		}
		
		
		// 문제 3)  인덱스를 입력하면 값 출력
		// 예) 2 ==> 5  , 4 ==> 1
		System.out.print("인덱스를 입력해주세요: ");
		int userIdx = scan.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			if(i == userIdx) {
				System.out.println(a[userIdx]);
			}
		}
		
		
		

		// 문제 4) 위 배열중 가장 큰 값 출력 
		// 예) 10
		
		int maxNum = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(maxNum<a[i]) {
				maxNum = a[i];
			}
		}
		
		System.out.println("가장 큰 값은 " + maxNum + "입니다.");

		// 문제 5) 위 배열중 홀수의 개수 출력 
		// 예) 홀수의 개수 : 3
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 1) {
				count++;
			}
		}
		
		System.out.println("홀수의 개수: " + count+"입니다.");
			
		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0, 0, 5, 3, 1}
		int[] b = {0, 0, 0, 0, 0};
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 1) {
				b[i] = a[i];
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		// 문제 7) 다음 리스트를 이용해서 a의 값중 홀수만 c에 저장(저장위치는 앞에서부터  저장 , 3번 문제와 다름)
		// 예) b => {5, 3, 1, 0, 0}
		int[] c = { 0,0,0,0,0 };
		
	
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i] % 2 == 1) {
				c[j] = a[i];
				j++;
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
		
		

		
	}

}
