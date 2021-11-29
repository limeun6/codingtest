
public class AliquotPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(13,17));
	}

	public static int solution(int left, int right) {
		int answer = 0;
		//left부터 right까지의 수를 i에저장
		for(int i=left;i<right+1;i++) {
			// i의 약수를 구한다.
			int count=0;
			for(int j =1;j<i+1;j++) {
				if(i%j==0) {
					count++;
				}
			}
			//약수의 갯수가 짝수인 경우
			if(count%2==0) {
				answer=answer+i;
				
			// 약수의 갯수가 홀수인 경우
			} else if(count%2==1) {
				answer=answer-i;
			}
		}
		return answer;
	}

}
