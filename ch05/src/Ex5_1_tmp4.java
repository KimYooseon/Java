import java.util.Arrays; //Ctrl + Shift + o : �ڵ����� �ʿ��� import�� �߰�����

public class Ex5_1_tmp4 {

	public static void main(String[] args) {
		String str = "ABCDE";
		char ch = str.charAt(2);
		System.out.println(ch);
		
		String str2 = str.substring(1,4);
		System.out.println(str2);
		
		String str3 = str.substring(1); // �ε���1~4 ��� => �� ������ String str3 = str.substring(1, str.length);�� ����
		System.out.println(str3);
		
		
		
	}

}
