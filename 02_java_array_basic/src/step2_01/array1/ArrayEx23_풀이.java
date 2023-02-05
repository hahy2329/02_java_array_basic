package step2_01.array1;

import java.util.Scanner;

/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		while (isRun) {
			
			for (int i = 0; i < accsCnt; i++) {
				System.out.println(accs[i]+ " ");
				System.out.println(pws[i]+ " ");
				System.out.println(i+"번째");
			}
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if(selectMenu == 1) {
				if (accsCnt == 5) {
					System.out.println("해당 배열 요소는 꽉 차있습니다.");
					continue;
				}
				System.out.println("가입을 진행하겠습니다.");
				System.out.println("가입할 계좌번호를 입력해주세요: ");
				int userAccs = scan.nextInt();
				
				int idx = -1;
				for (int i = 0; i < accsCnt; i++) {
					
					if(accs[i] == userAccs) {
						idx  = -1;
						
					}
				}		
				
				if(idx == -1 ) {
					System.out.println("계좌번호가 중복됩니다.");
				}
				else {
					System.out.println("비밀번호를 입력해주세요:");
					int myPw = scan.nextInt();
					
					accs[accsCnt] = userAccs;
					pws[accsCnt] = myPw;
					accsCnt+=1;
				}
				
			}
			else if (selectMenu == 2) {
				System.out.println("탈퇴할 계좌번호를 입력해주세요: ");
				int userAccs = scan.nextInt();
				System.out.println();
				
				int idx = -1;
				
				for (int i = 0; i < accsCnt; i++) {
					if(accs[i] == userAccs) {
						idx = i;
					}
				}	
					if(idx ==-1) {
						System.out.println("해당 요소를 찾지 못했습니다.");
						
					}
					for (int j = idx; j < accsCnt-1; j++) {
						accs[idx] = accs[j+1];
						pws[idx] = pws[j+1];
						accsCnt--;
					}
					
					
				}
				
				
			
			else if (selectMenu == 3) {
				
				System.out.println("해당 요소를 종료합니다.");
				isRun = false;
			}
		
		}
		
		scan.close();
	

	}
}
