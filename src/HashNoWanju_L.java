
public class HashNoWanju_L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        boolean check;
        for(int j = 0;j<participant.length;j++){
            check = true;
            for(int i = 0;i<completion.length;i++){
                if(participant[j].equals(completion[i])){
                    completion[i]=null;
                    check = false;
                    break;
                } 
            }
            if(check){
                answer=participant[j];
                break;
            }
        }
        return answer;
    }

}
