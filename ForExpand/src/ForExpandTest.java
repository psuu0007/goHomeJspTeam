import java.util.ArrayList;
import java.util.List;

public class ForExpandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numList = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			numList.add(i+1);
		}
				 
		for (Integer num : numList) {
			System.out.println("윤승환" + num);
		}
		 
		String[] strArr = new String[3];
		
		strArr[0] = "글자";
		strArr[1] = "222";
		strArr[2] = "글자 222";
		
		strArr[0] = "윤승환";
		strArr[1] = "뭐지";
		strArr[2] = "이것도바꾸나?"; 
	 
		for (String str : strArr) {
			System.out.println(str);
		}
		
		
	}

}
