
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10/3); // 정수 나누기 정수 => 정수
//		System.out.println(10.0/3);
		
//		System.out.printf("%d\n", 15); // 10진수
//		System.out.printf("%#o\n", 15); // 8진수
//		System.out.printf("%#x\n", 15); // 16진수
//		System.out.printf("%s", Integer.toBinaryString(15));
		
//		float f = 123.456789f;
//		System.out.printf("%f\n", f); // float는 7자리까지만 정확하고 나머지값들은 의미없는 값임
//		
//		double d = 123.456789;
//		System.out.printf("%f\n", d); // double타입은 15자리까지 정확함. 9자리 값이니 충분히 정확하게 표현 가능한 것.
//		
//		System.out.printf("%e\n", f); // 변수 f를 지시자 e로 출력한 경우=>지수형태로 값이 표현
//		System.out.printf("%g\n", f); // 간략하게 소수점 포함해서 7자리수로 출력됨
		
		System.out.printf("[%5d]\n", 10);
		System.out.printf("[%-5d]\n", 10); // 왼쪽정렬
		System.out.printf("[%05d]\n", 10);
		System.out.printf("[%5d]\n", 1234567); // 5자리로 지정했지만 저장해야 하는 값이 7자리이기 때문에 지정된 값과 상관없이 모든 값을 출력함
		
		double d = 1.23456789;
		System.out.printf("%f\n", d); // 1.234567인데 마지막 소수점자리가 반올림이 되어 8이 된 것임
		System.out.printf("%14.10f\n", d); // 정수 앞쪽은 공백으로 출력, 소수점쪽 빈자리는 0으로 채워짐
		System.out.printf("%14.6f\n", d);
		System.out.printf("%.6f\n", d); // 소수점자리만 6자리로
		
		System.out.printf("[%s]\n", "www.codechobo.com");
		System.out.printf("[%20s]\n", "www.codechobo.com");
		System.out.printf("[%-20s]\n", "www.codechobo.com"); //왼쪽정렬
		System.out.printf("[%.10s]\n", "www.codechobo.com"); //앞에서부터 10자리 잘라서 부분출력
	}

}
