
public class Ex3_11 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0; // �ݿø�
		System.out.println(shortPi);
		
		shortPi = Math.round((int)(pi * 1000)) / 1000.0; // ����(�Ǽ��� ������ �ٲ�鼭 �Ҽ����ڸ��� Ż����)
		System.out.println(shortPi);
		

	}

}
