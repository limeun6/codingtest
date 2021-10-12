
public class StockPrice {

	public static void main(String[] args) {
		int[] prices={1,2,3,2,3,1};//5,4,1,2,1,0
		int[] answer=solution(prices);
		for(int i=0;i<prices.length;i++) {
			System.out.print(answer[i]+",");
		}
	}
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        // 전체 갯수
        int n = prices.length-1;
        for(int i=0;i<prices.length-1;i++) {
        	for(int j=i+1;j<prices.length;j++) {
        		//가격j와내일 가격i를 비교
        		if(prices[i] <= prices[j]) {
            		answer[i]=answer[i]+1;
            	} else{
            		answer[i]=answer[i]+1;
            		break;
            	}
        	}
        }
        //마지막은 비교군이 없으므로 무조건0
        answer[prices.length-1]=0;
        return answer;
    }

}
