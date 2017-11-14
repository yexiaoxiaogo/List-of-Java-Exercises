

public class Main {
	public static int main(int totalTime, int runTime, int restTime, int speed) {
		
		
//		YeInterger n1 = new YeInterger("1111111");
//		YeInterger n2 = new YeInterger("2222222");
//		
//		YeInterger n3 = n1.plus(n2);
//		
//		System.out.println("结果：" + n3.num);
		
		
		
		StringBuffer n1 = new StringBuffer("66666666666666666666626");
		StringBuffer n2 = new StringBuffer("99999999999999999999999");
		
		
		StringBuffer n3 = new StringBuffer();
		int max = Math.max(n1.length(), n2.length());
		
		n1 = n1.reverse();
		n2 = n2.reverse();
		
		int count = Math.abs(n1.length() - n2.length());
		
		if (n1.length() > n2.length()) {
			while(count-- > 0) {				
				n2.append("0");
			}
		} else {
			while(count-- > 0) {				
				n1.append("0");
			}
		}

		int jinshu = 0;
		int yushu = 0;
		for (int i = 0; i < max; i++) {
			int temp = n1.charAt(i)-48 + n2.charAt(i)-48 + jinshu;
			jinshu = temp / 10;
			yushu = temp%10;
			n3.append(yushu);
		}
		if(jinshu!=0){
			n3.append(jinshu);
		}
		n3.reverse();
	
		System.out.println(n3);
		
		return 0;
//		int sum = 0;
//		while (totalTime > 0) {
//			long rt = totalTime > runTime ? runTime : totalTime;
//			sum += rt * speed;
//			totalTime -= rt - restTime;
//		}
//		return sum;

	}
}
