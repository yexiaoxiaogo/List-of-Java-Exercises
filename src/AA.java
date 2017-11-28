import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AA {
	public static void main(String[] args) {
		List<List<String>> fatherlist = new LinkedList<>();
		List<String> childlist = new ArrayList<>();
		childlist.add("before");
		fatherlist.add(childlist);
		childlist.add("after");
		System.out.println(fatherlist);

	}

}
