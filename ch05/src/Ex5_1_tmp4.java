import java.util.Arrays; //Ctrl + Shift + o : 자동으로 필요한 import문 추가해줌

public class Ex5_1_tmp4 {

	public static void main(String[] args) {
		String str = "ABCDE";
		char ch = str.charAt(2);
		System.out.println(ch);
		
		String str2 = str.substring(1,4);
		System.out.println(str2);
		
		String str3 = str.substring(1); // 인덱스1~4 출력 => 이 문장은 String str3 = str.substring(1, str.length);와 같다
		System.out.println(str3);
		
		
		
	}

}
