
public class Joystic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("AABAAAAAAABBB"));
		// System.out.println(solution("B"));
	}

	public static int solution(String name) {
		int answer = 0;
		String[] make = new String[name.length()];
		int right=0;
		int left=0;
		int turn=name.length()-1;
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
		}	
		int minMove = name.length() - 1;
        for(int i = 0 ; i < name.length() ; i++) {
            if(name.charAt(i) != 'A') {
                int next = i+1;

                while(next < name.length() && name.charAt(next) == 'A') {
                    next++;
                }
                int move = 2 * i + name.length() - next;

                minMove = Math.min(move, minMove);
            }
        }
		return answer+minMove;
	}

	private static int min(int i, int j) {
		// TODO Auto-generated method stub
		if(i<j) {
			return i;
		} else {
			return j;
		}
	}

}
