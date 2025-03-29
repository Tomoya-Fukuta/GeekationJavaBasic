package basicSyntax;

public class Variables {

	public static void main(String[] args) {
		// 変数宣言
		int num1 = 5;
		double num2 = 0.5;
		String str1 = "私の好きな";
		String[] str2 = {"整数は", "小数は"};
		String str3 = "です。";

		System.out.println(num1 + "\n");
		System.out.println(num2 + "\n");
		
		for(int i = 0; i < str2.length; i ++) {
			if(i == 0) {
				System.out.println(str1 + str2[i] + num1 + str3 + "\n");
			}
			else if(i == 1) {
				System.out.println(str1 + str2[i] + num2 + str3);
			}
		}
	}

}
