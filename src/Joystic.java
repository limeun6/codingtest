
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
		}
		int minMove = name.length() - 1;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != 'A') {
				int next = i + 1;
				//A가 나올때 까지 오른쪽으로 더한다.
				while (next < name.length() && name.charAt(next) == 'A') {
					next++;
				}
				//오른쪽으로 가다가 왼쪽을 만났을때의 값을 구한다.
				int move = 2 * i + name.length() - next;
				//오른쪽과 왼쪽중 어느것이 더 작은 숫자인가 구한다.
				minMove = Math.min(move, minMove);
			}
		}
		return answer + minMove;
	}

}
