import java.util.ArrayList;
import java.util.List;

public class divisibleBy {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		int[] numbers = {1,2,3,4,5,6};
		int divider = 2;
		int len = numbers.length;
		for(int i=0;i<len;i++){
			if(numbers[i]%divider == 0){
				arr.add(numbers[i]);
			}
		}
		System.out.println("arraylist:"+arr);
		
		int[] array = new int[arr.size()];
		for(int j=0;j<arr.size();j++){
			array[j] = arr.get(j);
		}
		System.out.println("shuzhu:"+array);
		for(int k=0;k<arr.size();k++){
			System.out.println(array[k]);
		}
//
//		for(int x:arr){
//			System.out.println(x);
//		}
//					
	}
}
