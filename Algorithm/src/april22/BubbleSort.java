package april22;

public class BubbleSort {
	
	public static void main(String[] args) {
	
		RandomNumber rn = new RandomNumber(100);
		
		rn.generate();
		
		int temp_num;
		
		for(int cnt = 0; cnt < rn.ball.length; cnt++){
			for(int n = 0; n < rn.ball.length-1; n++){
				if(rn.ball[n] > rn.ball[n+1]) {
					temp_num = rn.ball[n+1];
					rn.ball[n+1] = rn.ball[n];
					rn.ball[n] = temp_num;
				}
			}
		}
		
		
		for(int i = 0;i<rn.ball.length;i++){
			System.out.println(rn.ball[i]);
		}
		
	}
	
}
