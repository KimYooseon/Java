
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10/3); // ���� ������ ���� => ����
//		System.out.println(10.0/3);
		
//		System.out.printf("%d\n", 15); // 10����
//		System.out.printf("%#o\n", 15); // 8����
//		System.out.printf("%#x\n", 15); // 16����
//		System.out.printf("%s", Integer.toBinaryString(15));
		
//		float f = 123.456789f;
//		System.out.printf("%f\n", f); // float�� 7�ڸ������� ��Ȯ�ϰ� ������������ �ǹ̾��� ����
//		
//		double d = 123.456789;
//		System.out.printf("%f\n", d); // doubleŸ���� 15�ڸ����� ��Ȯ��. 9�ڸ� ���̴� ����� ��Ȯ�ϰ� ǥ�� ������ ��.
//		
//		System.out.printf("%e\n", f); // ���� f�� ������ e�� ����� ���=>�������·� ���� ǥ��
//		System.out.printf("%g\n", f); // �����ϰ� �Ҽ��� �����ؼ� 7�ڸ����� ��µ�
		
		System.out.printf("[%5d]\n", 10);
		System.out.printf("[%-5d]\n", 10); // ��������
		System.out.printf("[%05d]\n", 10);
		System.out.printf("[%5d]\n", 1234567); // 5�ڸ��� ���������� �����ؾ� �ϴ� ���� 7�ڸ��̱� ������ ������ ���� ������� ��� ���� �����
		
		double d = 1.23456789;
		System.out.printf("%f\n", d); // 1.234567�ε� ������ �Ҽ����ڸ��� �ݿø��� �Ǿ� 8�� �� ����
		System.out.printf("%14.10f\n", d); // ���� ������ �������� ���, �Ҽ����� ���ڸ��� 0���� ä����
		System.out.printf("%14.6f\n", d);
		System.out.printf("%.6f\n", d); // �Ҽ����ڸ��� 6�ڸ���
		
		System.out.printf("[%s]\n", "www.codechobo.com");
		System.out.printf("[%20s]\n", "www.codechobo.com");
		System.out.printf("[%-20s]\n", "www.codechobo.com"); //��������
		System.out.printf("[%.10s]\n", "www.codechobo.com"); //�տ������� 10�ڸ� �߶� �κ����
	}

}
