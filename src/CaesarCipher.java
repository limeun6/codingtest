
public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("z a", 1));
	}

	// 시저 암호
	public static String solution(String s, int n) {
		String answer = "";
		// 아스키 코드
		int b = ' ';//32
		int A = 'A';//65
		int Z = 'Z';//90
		int a = 'a';//97
		int z = 'z';//122

		// 변환시 필요한 변수
		int tmpi = 0;
		for (int i = 0; i < s.length(); i++) {
			tmpi = s.charAt(i);
			// 공백의 경우
			if (tmpi == b) {
			// 소문자 처리
			} else if (tmpi>=a&&tmpi<=z) {
				tmpi = s.charAt(i) + n;
				if(tmpi>z) {
					tmpi= tmpi-26;
				}
			// 대문자 처리
			} else if (tmpi>=A&&tmpi<=Z) {
				tmpi = s.charAt(i) + n;
				if(tmpi>Z) {
					tmpi= tmpi-26;
				}
			}
			answer = answer + (char) tmpi;
		}
		return answer;
	}

}
