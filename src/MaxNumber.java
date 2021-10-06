import java.util.Arrays;
import java.util.Comparator;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 5, 0, 10, 15, 20 };// 5,44,4,43,40,404
		System.out.println(solution(numbers));
	}

	public static String solution(int[] numbers) {
		String answer = "";
		String[] numbersArray = new String[numbers.length];
		//값을 리스트에 저장
		for(int i=0;i<numbers.length;i++) {
			numbersArray[i]= String.valueOf(numbers[i]);
		}
		//비교&정렬
		Arrays.sort(numbersArray,new Comparator<String>() {
			@Override
			public int compare(String pre, String nex) {
				String onetwo=pre+nex;
				String twoone=nex+pre;
				return twoone.compareTo(onetwo);
			}
		});
		//값을 String에 저장
		StringBuffer strBuff = new StringBuffer();
		for(int i=0;i<numbersArray.length;i++) {
			strBuff.append(numbersArray[i]);
			
		}
		//0일경우 0을 출력
		if ("0".equals(strBuff.substring(0, 1))) {
			return "0";
		}
		return strBuff.toString();
	}

}
