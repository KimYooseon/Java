
public class Ex3_11 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0; // 반올림
		System.out.println(shortPi);
		
		shortPi = Math.round((int)(pi * 1000)) / 1000.0; // 내림(실수가 정수로 바뀌면서 소수점자리가 탈락됨)
		System.out.println(shortPi);
		

	}

}
