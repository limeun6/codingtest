
public class TelNumber_L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = { "12", "123", "1235", "567", "88" };
		solution(phone_book);
	}

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		
		for(int i =0; i<phone_book.length-1;i++) {
			for(int j=i+1; j<phone_book.length;j++) {
				if(phone_book[j].startsWith(phone_book[i])) {
					answer=false;
				}
				
			}
		}

		return answer;
	}

}
