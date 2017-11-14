import java.util.Scanner;

public class seriesSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入N：");
		int n = in.nextInt();
		in.close();
		double sum = 0;
		if(n<=0){
			System.out.println("sum = "+0.00);
		}else if (n == 1) {
			System.out.println("sum = "+1.00);
		}else {
			for (int i = 0; i < n; i++){
				sum += 1.0 / (1 + 3 * i);
			}
			System.out.printf("sum = %.2f",sum);
		}
	}

}
