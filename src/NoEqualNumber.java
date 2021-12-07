import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class NoEqualNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//같은 숫자는 싫어
	public int[] solution(int []arr) {
		//잘못 생각한 버전
//        HashMap<Integer,Integer> save= new HashMap();
//        for(int tmp:arr)save.put(tmp,0 );
//        int[] answer= new int[save.size()];
//        Integer[] array = save.keySet().toArray(new Integer[save.size()]);
//        for(int i =0;i<save.size();i++) {
//        	answer[i]=array[i];
//        }
//        return answer;
		List<Integer> lstAnswer= new ArrayList<Integer>();
		lstAnswer.add(arr[0]);
		for(int i=1; i<arr.length;i++) {
			if(arr[i-1]!=arr[i]) {
				lstAnswer.add(arr[i]);
			}
		}
		int[] answer= new int[lstAnswer.size()];
		for(int i=0;i<lstAnswer.size();i++) {
			answer[i]=lstAnswer.get(i);
		}
		return answer;
    }

}
