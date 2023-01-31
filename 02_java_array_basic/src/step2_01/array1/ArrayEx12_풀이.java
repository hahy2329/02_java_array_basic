package step2_01.array1;

import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

//23.01.31 12:20 ~ 12:35
public class ArrayEx12_풀이 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		
		
		/*
		System.out.print("인데스 위치를 입력해주세요: ");
		int userNum = scan.nextInt();
		System.out.println("인덱스 위치를 한 번 더 입력해주세요: ");
		int userNum1 = scan.nextInt();
		
		int temp;
		
		temp = arr[userNum];
		arr[userNum] = arr[userNum1];
		arr[userNum1] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		System.out.println();
		*/
		


		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}
		
		
		/*
		int temp1 = 0;
		int count = 0;
		int count1 = 0;
		
		System.out.print("값을 입력해주세요: ");
		int userNum2 = scan.nextInt();
		
		System.out.print("값을 한 번더 입력해주세요: ");
		int userNum3 = scan.nextInt();
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==userNum2) {
				count = i;
				
			}
			else if(arr[i] == userNum3) {
				count1 = i;
			}
			
			
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		arr[count] = userNum2;
		arr[count1] = userNum3;
		
		temp1 = arr[count];
		arr[count] = userNum3;
		arr[count1] = temp1;
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
		
		
		
		
		
		
		
		
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		int count3=0;
		int count4 =0;
		
		System.out.print("학번을 입력해주세요 : ");
		int studentID = scan.nextInt();
		System.out.println();
		
		System.out.print("학번을 한 번더 입력해주세요: ");
		int studentID2 = scan.nextInt();
		
		for (int i = 0; i < hakbuns.length; i++) {
			if(hakbuns[i] == studentID ) {
				count3 = i; 
				
			}
			
			else if(hakbuns[i] == studentID2) {
				count4 = i;
			}
			
			
		}
		
		int temp4= 0;
		
		temp4 = scores[count3];
		scores[count3] = scores[count4];
		scores[count4] = temp4;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
			
		}
		
		
		
		
	}
	
}
