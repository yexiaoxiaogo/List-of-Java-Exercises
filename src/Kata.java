public class Kata {

	public static int travel(int totalTime, int runTime, int restTime, int speed) {
		// 10 5 1 1
		int sum = 0;
		
			while (totalTime > 0) {
				sum = sum + runTime * speed;
				totalTime = totalTime - runTime - restTime;
			}
		
		return sum;
	}
}
