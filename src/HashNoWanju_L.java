import java.util.Arrays;

public class HashNoWanju_L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]participant= {"1","2","3","4"};
		String[]completion= {"1","2","3"};
		System.out.println(solution(participant,completion));

	}
	public static String solution(String[] participant, String[] completion) {
        
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = participant[participant.length-1];
        for(int i=0;i<completion.length;i++) {
        	if(!participant[i].equals(completion[i])) {
        		answer=participant[i];
        		break;
        	}
        }
//        boolean check;
//        for(int j = 0;j<participant.length;j++){
//            check = true;
//            for(int i = 0;i<completion.length;i++){
//                if(participant[j].equals(completion[i])){
//                    completion[i]=null;
//                    check = false;
//                    break;
//                } 
//            }
//            if(check){
//                answer=participant[j];
//                break;
//            }
//        }
        return answer;
    }

}
