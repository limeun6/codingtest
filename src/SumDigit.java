
public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(101));
	}

	// 자릿수 더하기
	public static int solution(int n) {
		int answer = 0;
		int ten = 10;
		while (n > 9) {
			answer += n % ten;
			n = n / ten;
		}
		answer += n;
		return answer;
	}

}
