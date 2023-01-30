package step2_01.array1;

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */


//23.01.30 12:36 ~ 12:42
public class ArrayEx05_풀이 {

	public static void main(String[] args) {
	
		// 인덱스    0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		
		Scanner scan = new Scanner(System.in);
		System.out.print("인덱스를 입력해주세요: ");
		int userNum = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if(i == userNum) {
				System.out.println(arr[i]);
			}
			else {
				continue;
			}
		}
		
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		
		System.out.print("성적을 입력해주세요 : ");
		int userNum1 = scan.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i]==userNum1) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		
		System.out.print("학번을 입력해주세요 : ");
		int userNum2 = scan.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			if(hakbuns[i]==userNum2) {
				System.out.println(scores[i]);
			}
			
		}

	}
	
}
