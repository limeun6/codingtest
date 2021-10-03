import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= {40,40,4,3,30,31,3,3};
		String a =solution(numbers);
	}
	public static String solution(int[] numbers) {
        String answer = "";
        ArrayList<String> strNumbers = new ArrayList<>();

        for(int i=0; i<numbers.length;i++) {
        	strNumbers.add(String.valueOf(numbers[i]));
        }
        Collections.sort(strNumbers);
        Collections.reverse(strNumbers);
       // System.out.println(strNumbers);
        for(int i= 0; i<strNumbers.size()-1;i++) {
        	if(strNumbers.get(i).substring(0, 1).equals(strNumbers.get(i+1).substring(0, 1))) {
        		System.out.println(strNumbers.get(i).substring(0, 1)+","+strNumbers.get(i+1).substring(0, 1));
        		if(Integer.parseInt(strNumbers.get(i))%10<Integer.parseInt(strNumbers.get(i+1))%10) {
        			System.out.println(strNumbers);
        			String tmp = strNumbers.get(i);
        			strNumbers.set(i, strNumbers.get(i+1));
        			strNumbers.set(i+1, tmp);
        			System.out.println(strNumbers);
        		}
        	}
        }
        for(int i= 0; i<strNumbers.size();i++) {
        	answer=answer+strNumbers.get(i);
        }
        System.out.println(answer);
        
        return answer;
    }

}
