import java.util.ArrayList;
import java.util.List;

public class ForExpandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numList = new ArrayList<Integer>();
		
//		for (int i = 0; i < 5; i++) {
//			numList.add(i+1);
//		}
//				
//		for (Integer num : numList) {
//			System.out.println(num);
//		}
		
		String[] strArr = new String[3];

		// 나도 충돌을 보고 내용을 민성씨랑 잘 대화를 나눠서 
		// 아래 내용을 추가하기로 했다.
		strArr[0] = "정민성1";
		strArr[1] = "정민성2";
		strArr[2] = "정민성3";
		
		for (String str : strArr) {
			System.out.println(str);
		}
		
	}

}
