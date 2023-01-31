package step2_01.array1;

/*
 * # 4의 배수만 저장
 * 
 * - arr 배열에서 4의 배수의 개수를 계산하여 4의 배수만큼 temp 배열을 생성한뒤에 
 *   arr배열의 4의 배수들을  temp로 옮겨닮아보시오.
 * 
 */
//23.01.31 12:35 ~ 12:50/
public class ArrayEx13_풀이 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%4 ==0) {
				count++;
			}
		}
		
		temp = new int[count];
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
			
		}
		System.out.println();
		
		int count1 =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%4==0) {
				temp[count1] = arr[i];
				count1++;
			}
			
			else {
				continue;
			}
		}
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
