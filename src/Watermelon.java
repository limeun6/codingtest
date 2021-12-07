
public class Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 수박수박수박수박수박수?
	public String solution(int n) {
        String answer = "";
        String watermelon="수박";
        for(int i=0;i<n/2;i++)answer+=watermelon;
        if(n%2==1)answer+=watermelon.substring(0,1);
        return answer;
    }
}
