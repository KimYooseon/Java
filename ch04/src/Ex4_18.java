import java.util.Scanner;
public class Ex4_18 {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true){
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���.(����: 0)>");
			menu = scanner.nextInt();
			
			if (menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else if (menu >= 1 && menu <= 3) {
				System.out.printf("�����Ͻ� �޴��� %d���Դϴ�.%n", menu);
				continue;
			}
			else {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.");
				continue;
			}
		}
	}

}
