package april22;

public class InsertSort {

	public static void main(String[] args) {
		
		RandomNumber rn = new RandomNumber(100);
		
		rn.generate();
		
		int temp_num;
		
		for(int n = 1; n < rn.ball.length; n++){
			for(int n2 = n; n2 > 0; n2--){
				if(rn.ball[n2-1] > rn.ball[n2]) {
					temp_num = rn.ball[n2-1];
					rn.ball[n2-1] = rn.ball[n2];
					rn.ball[n2] = temp_num;
				}
			}
		}
		
		
		for(int i = 0;i<rn.ball.length;i++){
			System.out.println(rn.ball[i]);
		}

	}

}
