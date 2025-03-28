package basicSyntax;

public class DataType {

	public static void main(String[] args) {
		// 変数宣言
		String[] str = {"こんにちは", "私の名前は", "Geek君です"};
		int num = 10;
		int[] nums = {20, 24};
		double dec = 3.14;
		boolean bool = true;
		
		// メソッド呼び出し
		content_1(str);
		content_2(num);
		content_3(nums);
		content_4(dec);
		content_5(bool);
	}
	
	// 文字列の連結：こんにちは私の名前はGeek君です
	public static void content_1(String[] str) {
		System.out.println(str[0] + str[1] + str[2] + "\n");
	}
	
	// 数値の表示：10
	public static void content_2(int num) {
		System.out.println(num + "\n");
	}
	
	// 文字列の数字を連結：20と24
	public static void content_3(int[] num) {
		System.out.println(Integer.toString(num[0]) + Integer.toString(num[1]) + "\n");
	}
	
	// 小数の表示：3.14
	public static void content_4(double dec) {
		System.out.println(dec + "\n");
	}
	
	// 真偽値の表示：true
	public static void content_5(boolean bool) {
		System.out.println(bool);
	}
}
