import java.util.ArrayList;
import java.util.List;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(123));
	}
	// 하샤드수
	public static boolean solution(int x) {
        boolean answer = true;
        List<Integer> lstNumber = new ArrayList<>();
        int ten=10;
        int sum=0;
        int tmp=x;
        while(true) {
        	lstNumber.add(tmp%ten);
        	tmp=tmp/ten;
        	if(tmp<10) {
        		lstNumber.add(tmp);
        		break;
        	}
        }
        for(int i=0;i<lstNumber.size();i++) {
        	sum+=lstNumber.get(i);
        }
       
        if(x%sum!=0) {
        	answer=false;
        }
        return answer;
    }

}
