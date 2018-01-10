
public class Substring {
	public static void main(String[] args) {
		String token = "SHOP_TOKEN123456";
		String userId = null;
		String type = token.substring(0, token.indexOf("_"));
		System.out.println(type);
		if (type == "PLATFORM") {

			userId = "1";
		}
		if (type == "SHOP") {

			userId = "2";
		}
		if (type == "LANDLORD") {

			userId = "3";
		}
		System.out.println(userId);
	}

}
