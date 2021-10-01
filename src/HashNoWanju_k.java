
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class HashNoWanju_k {
	public static void main(String[] args) {
		
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : participant) {
			Integer count = map.get(str);
			if (count == null) {
				map.put(str, 1);
			} else {
				map.put(str, count + 1);
			}
		}

		for (int i = 0; i < participant.length; i++) {
			if (map.get(participant[i]) == 1) {
				if (!Arrays.stream(completion).anyMatch(participant[i]::equals)) {
					answer = participant[i];
				}
			} else {
				answer = participant[i];
			}
		}

		return answer;
	}
}

