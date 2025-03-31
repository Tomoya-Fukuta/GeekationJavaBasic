package basicSyntax;

public class Calculation {

	public static void main(String[] args) {
		// 変数宣言と初期化処理
		int x = 5;
		int y = 10;
		int z = x + y;
		
		// コンソール出力：変数zの値は（z）です
		System.out.println("変数zの値：" + Integer.toString(z) + "です");
		
		double a = 5.25;
		a = a + 2.5;
		System.out.println("加算時のaの値：" + Double.toString(a));
		
		a = a * 3.0;
		System.out.println("乗算時のaの値：" + Double.toString(a));
		
		int b = (int)a;
		System.out.println("int型にキャスト時のbの値：" + Integer.toString(b));
		
		b = b + 10;
		System.out.println("加算時のbの値：" + Integer.toString(b));

		System.out.println("\n～～～～～　それぞれの最終値　～～～～～");
		System.out.println("変数zの値は" + Integer.toString(z) + "です");
		System.out.println("変数aの値は" + Double.toString(a) + "です");
		System.out.println("変数bの値は" + Integer.toString(b) + "です");
		
	}
}
