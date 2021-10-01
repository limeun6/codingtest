
import java.util.HashMap;
import java.util.Map;

public class Neajuck_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int solution(int[] a, int[] b) {
		int answer = 0;

		for (int i = 0; i < a.length; i++) {
			answer = answer + (a[i] * b[i]);
		}

		return answer;
	}

	

}
