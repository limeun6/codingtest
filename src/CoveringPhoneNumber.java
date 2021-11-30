
public class CoveringPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 핸드폰 번호 가리기
	public String solution(String phone_number) {
        String answer = "";
        for(int i=0;i<phone_number.length()-4;i++)answer=answer+"*";
        answer=answer+phone_number.substring(phone_number.length()-4,phone_number.length());
        return answer;
    }

}
