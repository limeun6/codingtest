import java.util.*;

public class MoreLessNumberRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4};
		System.out.println(solution(arr));
	}

	// 제일 작은 수 제거하기
	public static int[] solution(int[] arr) {
		int[] answer;
		// 최소값을 구한다.
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		// 출력할 배열내용을 정함
		if (arr.length < 2) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		} else {
			answer = new int[arr.length - 1];
		}
		// 최소값을 제외하고 값을 저장한다.
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=min) {
				answer[count] = arr[i];
				count++;
			}
		}
		return answer;
	}

}
