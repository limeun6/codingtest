
public class CollatzGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(626331));
	}
	//콜라츠 추측
	public static int solution(int num) {
        int answer = 0;
        while(answer<500) {
        	if(num==1) {
            	return answer;
            }
            else if(num%2==0) {
            	num=num/2;
            	answer++;
            }else {
            	num=num*3+1;
            	answer++;
            }
        }
        return -1;
    }

}
