import java.util.Scanner;
public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.printf("1�� 100������ ������ �Է��ϼ���.>");
			input = scanner.nextInt();
			
		 if (answer > input) {
			System.out.println("�� ū ���� �õ��غ�����.");
		 } else if (answer < input){
			 System.out.println("�� ���� ���� �õ��غ�����");
		 }
		} while(answer != input);
		System.out.println("�����Դϴ�.");
	}

}