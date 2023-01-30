package step2_01.array1;

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */

//23.01.30 12:49 ~ 12:54
public class ArrayEx07_풀이 {

	public static void main(String[] args) {
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		
		int maxScore = 0; //1등 점수
		int count = 0; // 몇번째 학생인지 가리키는 변수
		
		for (int i = 0; i < scores.length; i++) {
			if(maxScore < scores[i]) {
				maxScore = scores[i];
				count = i;
			}
			else {
				continue;
			}
			
			
		}
		
		System.out.println("가장 높은 점수의 학생은 " + count + "번째 이고, " + "점수는 " + maxScore +"점 입니다.");
		
	}
	
}
