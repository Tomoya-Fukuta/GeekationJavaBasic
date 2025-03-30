package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 50;
		int b = 30;
		
		// aがbより大きい場合にtrueを返す
		boolean isGreater = (a > b);
		System.out.println(isGreater);
		
		// 天気が晴れ かつ 暖かい場合にtrueを返す
		boolean isSunny = true; // 晴れ
		boolean isWarm = true; // 暖かい
		boolean andWeather = (isSunny && isWarm);
		System.out.println(andWeather);
		
		// xの値が0以上 かつ yの値が偶数の場合にtrueを返す
		int x = 0;
		int y = 100;
		boolean andResult = (x >= 0 && (y % 2) == 0);
		System.out.println(andResult);
		
		// 真偽値がfasleの場合にtrueを返す
		boolean hasPermission = false;
		boolean notResult = !hasPermission;
		System.out.println(notResult);
	}

}
