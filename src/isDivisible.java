
public class isDivisible {
	public static void main(String[] args) {
		long a = 121;
		System.out.println(Math.sqrt(a));
		if(Math.sqrt(a)%1 ==0){
			System.out.println("true");
			double x=Math.sqrt(a);
			x=x+1;
			System.out.println(x*x);
		}else {
			System.out.println("false");
		}
		
	}
}
