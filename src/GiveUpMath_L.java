
public class GiveUpMath_L {

	public static void main(String[] args) {
		int[] answers = {1,2,4,5,3};
		solution(answers);

	}
	public static int[] solution(int[] answers) {
        int p1[]= {1,2,3,4,5};
        int p1Collect=0;
        int p2[]= {2,1,2,3,2,4,2,5};
        int p2Collect=0;
        int p3[]= {3,3,1,1,2,2,4,4,5,5};
        int p3Collect=0;
        for(int i =0; i<answers.length;i++) {
        	if(p1[i%5]==answers[i]) {
        		p1Collect++;
        	}
        	if(p2[i%8]==answers[i]) {
        		p2Collect++;
        	}
        	if(p3[i%10]==answers[i]) {
        		p3Collect++;
        	}
        }
        if(p1Collect>p2Collect) {
        	if(p1Collect>p3Collect) {
        		int[] answer= {1};
        		return answer;
        	} else if(p1Collect<p3Collect) {
        		int[] answer= {3};
        		return answer;
        	} else {
        		int[] answer= {1,3};
        		return answer;
        	}
        } else if(p1Collect<p2Collect) {
        	if(p2Collect>p3Collect) {
        		int[] answer= {2};
        		return answer;
        	} else if(p2Collect<p3Collect) {
        		int[] answer= {3};
        		return answer;
        	} else {
        		int[] answer= {2,3};
        		return answer;
        	}	
        }else {
        	if(p1Collect>p3Collect) {
        		int[] answer= {1,2};
        		return answer;
        	} else if(p1Collect<p3Collect) {
        		int[] answer= {3};
        		return answer;
        	} else {
        		int[] answer= {1,2,3};
        		return answer;
        	}
        }
    }

}
