
public class BasicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("1000"));
	}
	// 문자열 다루기 기본
	public static boolean solution(String s) {
		boolean answer = true;
		int n;
		for (int i = 0; i < s.length(); i++) {
			n=s.charAt(i);
			if (n > 57|| n<47)
				return false;
		}
        if(!(s.length()==4||s.length()==6)){
            return false;
        }
		return answer;
	}

}
