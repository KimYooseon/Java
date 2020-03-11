import java.util.Arrays; //Ctrl + Shift + o : 자동으로 필요한 import문 추가해줌

public class Ex5_1_tmp3 {

	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60}; // 길이가 5 인 int배열
//		System.out.println(iArr); // 100, 95, 80, 70, 60 이 출력되지 않음( '['는 배열, 'I'는 int를 의미)
		
		for(int i=0; i<iArr.length; i++) {          //방법 1
			System.out.println(iArr[i]);
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(iArr));  //방법2
		
		
	}

}
