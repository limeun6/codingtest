import java.util.Arrays;

public class TelNumber_L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = { "12", "23", "25", "567", "234" };
		System.out.println(solution(phone_book));
	}

	public static boolean solution(String[] phone_book) {
		boolean answer = true;

		Arrays.sort(phone_book);

		for (int j = 1; j < phone_book.length; j++) {
			if (phone_book[j].startsWith(phone_book[j - 1])) {
				answer = false;
			}
		}
		return answer;
	}

}
