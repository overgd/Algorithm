package april22;

public class RandomNumber {
	RandomNumber(int a){
		ball = new int[a];
	}	
	int[] ball;
	int random_number;
	int temp_number;
		
	void generate() {
		
		for(int i = 0;i < ball.length ;i++) {
			ball[i] = i+1;
		}
		
		for(int i = 0;i<1000;i++){
			random_number = (int)(Math.random()*(ball.length-1)+1);
			temp_number = ball[0];
			ball[0] = ball[random_number];
			ball[random_number] = temp_number;
		}
		
//		for(int i = 0;i<ball.length;i++){
//			System.out.println(ball[i]);
//		}
		
	}
}
