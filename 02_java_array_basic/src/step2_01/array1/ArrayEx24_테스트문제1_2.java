package step2_01.array1;


import java.util.Scanner;

public class ArrayEx24_테스트문제1_2 {

	public static void main(String[] args) {

		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		// 예) 30 ==> e = {10,20,40,50,0};
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("값을 입력해주세요: ");
		int user = scan.nextInt();
		System.out.println();
		int count = 0;
		for (int i = 0; i < d.length; i++) {
			if(d[i]!=user) {
				e[count] = d[i];
				count++;
			}
			
		}
		
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + " ");
		}
		
		
		*/

		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		/*
		System.out.print("번호를 입력하세요 : ");
		int userNum = scan.nextInt();
		System.out.println();
		
		System.out.print("값을 입력하세요: ");
		int userNum1 = scan.nextInt();
		System.out.println();
		
		int count1 = 0;
		
		for (int i = 0; i < f.length; i++) {
			if(f[i] == userNum) {
				continue;
			}
			else if(f[i] ==userNum1) {
				continue;
			}
			else {
				g[count1] = f[i];
				count1++;
			}
		}
		
		for (int i = 0; i < g.length; i++) {
			System.out.print(g[i] + " ");
		}
		
		
		
		*/
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		
		System.out.print("값을 입력해주세요: ");
		int userNum10 = scan.nextInt();
		System.out.println();
		
		for (int i = 0; i < h.length; i++) {
			if(i==4) {
				h[i] = userNum10;
			}
			
			else {
				h[i] = h[i+1];
			}
			
			
		}
		
		for (int i = 0; i < h.length; i++) {
			System.out.print(h[i] + " ");
		}
		
		
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		int temp;
		
		System.out.print("값을 입력해주세요: ");
		int userNum20 = scan.nextInt();
		System.out.println();
		
		for (int j = 0; j < i.length; j++) {
			if(j == 0 ) {
				temp = i[j+1];
				i[j+1] = i[j];
				i[j] = userNum20;
			}
			
			else if(j ==1) {
				continue;
			}
			
			else {
				
				i[j] = temp;
				
				
				
			}
		}
		
		
		
		
		
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};

		
		
		
	}

}
