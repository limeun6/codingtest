import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 3,40,43, 30,31,30,32,33, 34, 5, 9,40,41,44,45,4,444,445,446};
		System.out.println(solution(numbers));
	}

	public static String solution(int[] numbers) {
		String answer = "";
		ArrayList<String> strNumbers = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			strNumbers.add(String.valueOf(numbers[i]));
		}
		Collections.sort(strNumbers);
		Collections.reverse(strNumbers);
		System.out.println(strNumbers);
		for(int j = 0; j<strNumbers.size();j++) {
			for(int i = 0;i<strNumbers.size()-1;i++) {
				if(strNumbers.get(i).substring(0, 1).equals(strNumbers.get(i+1).substring(0, 1))) {
					if(Integer.parseInt(strNumbers.get(i))%10<Integer.parseInt(strNumbers.get(i+1))%10) {
						String max=strNumbers.get(i+1);
						String min=strNumbers.get(i);	
						strNumbers.set(i, max);
						strNumbers.set(i+1, min);
						System.out.println(strNumbers);
						continue;
					} else {
						continue;
					}
				}
			}
		}
		for (int i = 0; i < strNumbers.size(); i++) {
			answer = answer + strNumbers.get(i);
		}
		return answer;
	}

}
