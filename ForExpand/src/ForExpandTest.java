import java.util.ArrayList;
import java.util.List;

public class ForExpandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numList = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			numList.add(i+1);
		}
				
//		for (Integer num : numList) {
//			System.out.println(num);
//		}
		
		String[] strArr = new String[5];
		
		strArr[0] = "정혜미1";
		strArr[1] = "정혜미2";
		strArr[2] = "정혜미3";
		strArr[3] = "정혜미4";
		strArr[4] = "정혜미5";
		
		for (String str : strArr) {
			System.out.println(str);
		}
		
		
	}

}
