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
			System.out.println("박강인"+num);
		}
		
		String[] strArr = new String[3];
		
		strArr[0] = "우효";
		strArr[1] = "초럭키";
		strArr[2] = "Daze";
		
		for (String str : strArr) {
			System.out.println(str);
		}
		
		
	}

}
