import java.util.Arrays; //Ctrl + Shift + o : �ڵ����� �ʿ��� import�� �߰�����

public class Ex5_1_tmp3 {

	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60}; // ���̰� 5 �� int�迭
//		System.out.println(iArr); // 100, 95, 80, 70, 60 �� ��µ��� ����( '['�� �迭, 'I'�� int�� �ǹ�)
		
		for(int i=0; i<iArr.length; i++) {          //��� 1
			System.out.println(iArr[i]);
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(iArr));  //���2
		
		
	}

}
