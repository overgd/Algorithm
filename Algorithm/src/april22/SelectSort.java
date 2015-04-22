package april22;

public class SelectSort {

	public static void main(String[] args) {
		
		RandomNumber rn = new RandomNumber(45);

		rn.generate();
		
		int temp_num;
		int num = 0;
		
		
		
		for(int i = 0;i<rn.ball.length;i++){
			System.out.println(rn.ball[i]);
		}

	}

}
