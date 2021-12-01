
public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//평균 구하기
	public double solution(int[] arr) {
        double answer = 0;
        for(int a: arr) answer+=a;
        answer=answer/arr.length;
        return answer;
    }

}
