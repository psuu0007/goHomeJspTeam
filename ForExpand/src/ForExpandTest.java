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
			System.out.println("박대승"+num);
		}
		
		String[] strArr = new String[3];
		
		strArr[0] = "박대승1";
		strArr[1] = "박대승2";
		strArr[2] = "박대승3";
		
		for (String str : strArr) {
			System.out.println(str);
		}
		
		
	}

}
