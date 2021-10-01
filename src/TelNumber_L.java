import java.util.ArrayList;
import java.util.Collections;

public class TelNumber_L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = { "12", "23", "25", "5 67", "2 34" };
		solution(phone_book);
	}

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		ArrayList<String> change = new ArrayList<>();
		for(int i =0; i<phone_book.length;i++) {
			change.add(phone_book[i].replaceAll(" ", ""));
		}
		Collections.sort(change);
		a :for(int i =0; i<change.size()-1;i++) {
			for(int j=i+1; j<change.size();j++) {
				if(!change.get(j).substring(0,1).equals(change.get(i).substring(0,1))) {
					break;
				}
				if(change.get(j).startsWith(change.get(i))) {
					answer=false;
					break a;
				}
				
			}
		}
		return answer;
	}

}
