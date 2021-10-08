import java.util.HashMap;

public class Pokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2,1,2,3}; 
		System.out.println(solution(a));
	}

	public static int solution(int[] nums) {
		int answer = 0;
		HashMap<Integer, Integer> pokemon = new HashMap<Integer, Integer>();
		int count =0;
		for(int i =0;i<nums.length;i++) {
			pokemon.put(nums[i], pokemon.getOrDefault(nums[i], 0) + 1);
			count++;
		}
		count=count/2;
		if(count<pokemon.size()) {
			return count;
		} else if(count>pokemon.size()) {
			return pokemon.size();
		} else if(count==pokemon.size()) {
			return count;
		}
		
		return answer;
	}

}
