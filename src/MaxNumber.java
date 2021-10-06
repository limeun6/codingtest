import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 5, 0, 10, 15, 20 };// 5,44,4,43,40,404
		System.out.println(solution(numbers));
	}

	public static String solution(int[] numbers) {
		String answer = "";

		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers.length - (1 + j); i++) {
				String onetwo = String.valueOf(numbers[i]) + String.valueOf(numbers[i + 1]);
				String twoone = String.valueOf(numbers[i + 1]) + String.valueOf(numbers[i]);
				if (Integer.parseInt(onetwo) < Integer.parseInt(twoone)) {
					int tmp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = tmp;
				}
//				for(int n =0; n<numbers.length;n++) {
//					System.out.print(numbers[n]+",");
//				}
//				System.out.println();
			}
			answer = String.valueOf(numbers[numbers.length - 1 - j]) + answer;
//			System.out.println("==="+answer+"========");	
		}
		if ("0".equals(answer.substring(0, 1))) {
			answer = "0";
		}
		return answer;
	}

}
