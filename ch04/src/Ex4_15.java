import java.util.Scanner;
public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.printf("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
		 if (answer > input) {
			System.out.println("더 큰 수로 시도해보세요.");
		 } else if (answer < input){
			 System.out.println("더 작은 수로 시도해보세요");
		 }
		} while(answer != input);
		System.out.println("정답입니다.");
	}

}