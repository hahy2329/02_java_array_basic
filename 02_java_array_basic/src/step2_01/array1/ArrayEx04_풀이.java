package step2_01.array1;

import java.util.Random;

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */

//23.01.30 12:30 ~ 12:36
public class ArrayEx04_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int sum =0; // 총점
		double avg = 0.0; //평균
		
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100)+1;
			System.out.println(arr[i]);
		}
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		for (int i = 0; i < arr.length; i++) {
			sum +=arr[i];
		}
		System.out.println("총점은 " + sum +"점 입니다.");
		avg = sum/5;
		System.out.println("평균은 " + avg +"점 입니다.");
		System.out.println();
		
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int count =0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=60) {
				System.out.println(i+"번째 학생은 합격입니다.");
				count++;
			}
		}
		
		System.out.println("합격자 수는 " + count +"입니다.");
		

	}
	
}
