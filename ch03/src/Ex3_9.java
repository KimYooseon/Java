
public class Ex3_9 {

	public static void main(String[] args) {
		int a =1_000_000; // 1�鸸 = 10�� 6����
		int b =2_000_000; // 2�鸸 = 2 * 10�� 6����
		
		// �� 10�� 12����. �׷��� int�� ������ 10�� 9�����̴�.
		long c = a * b; // a*b=2,000,000,000,000 �� ���;� �ϴµ� �����÷ο� ���ܼ� ����� �ȳ���
		         //int * int�� ������� int�ϱ� �����÷ο찡 ���� ����
		
		System.out.println(c);
		
		c = (long)a * b; // a�� b �� �� �ϳ��� ����ȯ���ָ� ��
		System.out.println(c);
	}

}