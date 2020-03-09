
public class Ex5_1_tmp {

	public static void main(String[] args) {
//		int[] score; // 1. 배열 score를 선언 (참조변수)
//		score = new int[5]; // 2. 배열의 생성 (int저장공간 x 5)
		
		int[] score = new int[5]; // 이처럼 한 문장으로 만들 수도 있다(배열의 선언과 생성을 동시에)
		score[3] = 100;
		
		System.out.println("score = " + score[0]);
		System.out.println("score = " + score[1]);
		System.out.println("score = " + score[2]);
		System.out.println("score = " + score[3]);
		System.out.println("score = " + score[4]);
		
		int value = score[3];
		System.out.println("value = " + value);
	}
}