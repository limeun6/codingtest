import java.util.Arrays;

public class GymClothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] lost = { 2, 3, 4 };
		int[] reserve = { 1, 2, 3 };
		System.out.println(solution(n, lost, reserve));

	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		//정렬
		Arrays.sort(lost);
		Arrays.sort(reserve);
		//체육복2개인사람이 도난당했을 경우
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}

		//체육복을 빌릴수 있는 사람
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] - 1 == reserve[j] && reserve[j] > 0) {
					lost[i] = -1;
					reserve[j] = -1;
					break;
				} else if (lost[i] + 1 == reserve[j] && reserve[j] > 0) {
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}
		//전체수-체육복을 구하지 못한 사람의 수
		for (int i = 0; i < lost.length; i++) {
			if (lost[i] != -1) {
				n--;
			}
		}
		answer = n;
		return answer;
	}

}
