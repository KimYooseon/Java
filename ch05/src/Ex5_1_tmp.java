
public class Ex5_1_tmp {

	public static void main(String[] args) {
//		int[] score; // 1. �迭 score�� ���� (��������)
//		score = new int[5]; // 2. �迭�� ���� (int������� x 5)
		
		int[] score = new int[5]; // ��ó�� �� �������� ���� ���� �ִ�(�迭�� ����� ������ ���ÿ�)
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