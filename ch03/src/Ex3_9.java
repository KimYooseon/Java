
public class Ex3_9 {

	public static void main(String[] args) {
		int a =1_000_000; // 1백만 = 10의 6제곱
		int b =2_000_000; // 2백만 = 2 * 10의 6제곱
		
		// 약 10의 12제곱. 그러나 int의 범위는 10의 9제곱이다.
		long c = a * b; // a*b=2,000,000,000,000 이 나와야 하는데 오버플로우 생겨서 제대로 안나옴
		         //int * int의 결과값이 int니까 오버플로우가 생긴 것임
		
		System.out.println(c);
		
		c = (long)a * b; // a나 b 둘 중 하나를 형변환해주면 됨
		System.out.println(c);
	}

}
