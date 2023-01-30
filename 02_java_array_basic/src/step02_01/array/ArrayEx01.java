package step02_01.array;

/*
 * 
 * # 배열 ( array )    
 * 
 *  [ 형식 ]
 *  
 *  1) 자료형[] 배열명 = new 자료형[방의개수];
 *  2) 자료형 배열명[] = new 자료형[방의개수];
 * 
 * 	- '같은 자료형'의 데이터를 '여러개' 저장하기 위한 자료구조
 * 
 *  - 인덱스(index) : 0부터 시작하는 방 번호가 부여된다.
 *  
 *  - 엘리먼트(element) : 배열의 요소를 지칭한다.
 *  
 *  - 배열은 생성시에 초깃값이 부여되어 있다.
 *    String 배열의 초기값   : null
 *    int 배열의 초기값     : 0
 *    double 배열의 초기값  : 0.0
 *    char 배열의 초기값    : '0'
 *    boolean 배열의 초기값 : false
 *    
 *  - 배열은 주소변수이다.
 *  
 *  - 배열을 크기가 변하지 않는다. 배열의 요소를 삭제하여도 배열의 크기는 고정되어있다.
 *  
 *  - 배열의 요소를 지우는 것은 배열의 초깃값으로 다시 저장하는 것을 의미한다.
 * 
 *  - null을 대입함으로써 배열의 전체를 삭제할 수 있다.
 * 
 *  - 같은 자료형만 가능, 크기가 고정!
 * */


public class ArrayEx01 {

	public static void main(String[] args) {
		
		//일반 변수(데이터 저장)
		int var = 0;
		var = 3;
		System.out.println(var);
		
		//2. 주소 변수(주소 저장)
		int[] arr = null; // 주소 변수의 초기값은 null로 한다.
		
		arr = new int[5];
		
		System.out.println(arr); // 배열의 변수명은 주소
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// arr[5] = 60;
		// java.lang.ArrayIndexOutOfBoundsException
		// 배열의 최대범위를 넘어갈 때 발생하는 오류
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		
		// 배열명.length : 배열의 크기(길이)를 반환한다.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println();
		
		// 새로운 값을 대입하여 배열의 요소(Element)를 수정할 수 있다.
		arr[0] = 10000;
		arr[1] = 20000;
		arr[2] = 30000;
		
		// 배열의 요소를 삭제할 수 없고 
		// 초기값으로 다시 수정하여 데이터를 삭제한다.
		arr[3] = 0; 
		arr[4] = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
		
		//null을 대입하여 배열자체를 삭제한다. (요소 하나하나를 삭제할 순 없지만 배열 자체 삭제는 가능)
		arr = null;
		
		
		
		
		
		
		
		
		
	}

}
