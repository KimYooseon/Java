
public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0)-'0'); // 문자열형에서 문자형으로(str.charAt(0) = '3'), '3'-'0' = 3(int형)
		// System.out.println("3"-'0');   => str.charAt(0)-'0'이어야 한다
		System.out.println('3'-'0'+1); //'3'-'0' => 문자형을 숫자로 변환
		System.out.println(Integer.parseInt("3")+1); // 문자열형을 숫자로 변환
		System.out.println("3"+1); // 1이 "1"로 바뀜
		System.out.println(3 + '0'); // '0'이 48로 바뀜. '0'은 숫자로 48임
		System.out.println((char)(3 + '0')); // 문자'3'
		

	}

}
