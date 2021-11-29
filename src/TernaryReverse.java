
public class TernaryReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(2));
	}
	//a = new StringBuilder(a).reverse().toString();
	public static int solution(int n) {
		int answer = 0;
		String a="";
		int tmp=n;
		// 입력 숫자를 3진법으로 변환
		while(true) {
			if(tmp<3) {
				a=a+String.valueOf(tmp);
				break;
			}
			a=a+String.valueOf(tmp%3);
			tmp=tmp/3;
		}
		System.out.println(a);
		int three=1;
		// 3진법을 10진법으로 바꾼다.
		for(int i =a.length()-1; i>-1 ;i--) {
			answer=answer+Integer.valueOf(a.substring(i, i+1))*three;
			System.out.println(Integer.valueOf(a.substring(i, i+1))*three);
			three=three*3;			
		}
		return answer;
	}

}
