
public class Main {
	public static int main(long totalTime, long runTime, long restTime, long speed) {
		int sum = 0;
		while (totalTime > 0) {
			long rt = totalTime > runTime ? runTime : totalTime;
			sum += rt * speed;
			totalTime -= rt;
			totalTime -= restTime;
		}
		return sum;
	}
}
