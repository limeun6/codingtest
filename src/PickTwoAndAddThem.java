import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickTwoAndAddThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {2,1,3,4,1};
		System.out.println(solution(a));
	}
	public static int[] solution(int[] numbers) {
        List<Integer> lst = new ArrayList();
        
        for(int i =0; i< numbers.length-1;i++){
        	for(int j =i+1; j< numbers.length;j++){
        		if(!lst.contains(numbers[i]+numbers[j])) {
        			lst.add(numbers[i]+numbers[j]);
        		}
            }
        }
       Collections.sort(lst);
       int[] answer = new int[lst.size()];
       for(int i=0;i<lst.size();i++) {
    	   answer[i]=lst.get(i);
    	   System.out.println(lst.get(i));
       }
        return answer;
    }

}
