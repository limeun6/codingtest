
public class Joystic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("AABAAAAAAABBB"));
		// System.out.println(solution("B"));
	}

	public static int solution(String name) {
		int answer = 0;
		String[] make = new String[name.length()];
		// 초기값A 설정
		for (int i = 0; i < name.length(); i++) {
			make[i] = "A";
		}
		// 알파벳을 올리는 구간
		for (int i = 0; i < name.length(); i++) {
			// 알파벳이 Z에 더 가까우면 down버튼을 누른다.
			if (name.charAt(i) - 'A' > 'Z' - name.charAt(i) + 1) {
				answer = answer + 'Z' - name.charAt(i) + 1;
			} else {
				// 알파벳이 A에 더 가까우면 up버튼을 누른다.
				answer = answer + name.charAt(i) - 'A';
			}
			// right
			if (!(i == name.length() - 1)) {
				answer++;
			}

		}
		
		// left의 경우
		int left=0;
		int aCount=0;
		int aa=name.charAt(1);
		
		//A가 1개인 경우
		if(name.length()==3&&'A'==name.charAt(1)) {
			return answer-1;
		}
		//A가2개 이상의 경우
		for(int i = 0; i < name.length()-1; i++){
			if('A'==name.charAt(i)&&'A'==name.charAt(i+1)) {
				aCount++;
				if(aa>i) {
					aa=i;
				}
			}else {
				break;
			}
		}
		if(aCount>0) {
			aa=aa-1;
			left=aCount+1-aa;
		}
		
		return answer-left;
	}

}
