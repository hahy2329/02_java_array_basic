package step2_01.array1;

import java.util.Scanner;

/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 'O'로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [O] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */

//23.01.30 13:01 ~ 13:46
public class ArrayEx09_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X', 'X', 'X', 'X', 'X', 'X', 'X'};
		int money = 12000; // 좌석 개 당 가격
		int sum = 0; // 합계 값 
		
		
		
		for (int i = 0; i < seat.length; i++) {
			System.out.println("1. 좌석 예매");
			System.out.println("2. 종료");
			
			System.out.print("메뉴를 선택해주세요: ");
			int userNum = scan.nextInt();
			
			if(userNum ==1) {
				System.out.println("좌석을 선택해주세요 : ");
				int userSeat = scan.nextInt();
				
				if(seat[userSeat] =='X') {
					seat[userSeat] ='O';
					System.out.println("좌석 " + userSeat +"번 째 가격은 " + money +"원 입니다.");
					sum+=money;
				}
				
				else {
					System.out.println("해당 좌석은 이미 매진되었습니다.");
				}
				
			}
			
			if(userNum ==2) {
				break;
			}
			
			
			
		}
		
		System.out.println("총 매출액은 " + sum + "원 입니다.");
			
		
		
		
		
	}
	
}
