import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d= {1,2,3};
		int budget=5;
		System.out.println(solution(d,budget));
	}
	public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length;i++){
        	budget=budget-d[i];
        	if(budget<0) {
            	return answer;
            }
        	answer++;
        }
        return answer;
    }

}
