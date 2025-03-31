package basicSyntax;

public class Main {

	public static void main(String[] args) {
		// メソッド呼び出し
		DataType(); // データ型
		Variables(); // 変数
		Calculation(); // 四則演算
	}
	
	/**************************************************
	 * データ型
	 **************************************************/
	public static void DataType() {
		System.out.println("こんにちは");
		System.out.println("私の名前は");
		System.out.println("ともや君です");
		System.out.println("");
		
		// 文字列は「+」で連結できる
		System.out.println("こんにちは" + "私の名前は" + "ともや君です");
		System.out.println("");
		
		// 文字列の最後に「\n」で改行できる！
		System.out.println("こんにちは\n" + "私の名前は\n" + "ともや君です\n");
		
		// int型
		System.out.println(1);
		System.out.println(-1);
		System.out.println(5 + 1);
		
		// 数値は " " で囲むと文字列扱いになる
		System.out.println("5 + 1");
		System.out.println("5" + "1");
		
		System.out.println(0.25);
		System.out.println(-0.25);
		System.out.println(5 - 2.5);

		System.out.println(true);
		System.out.println(false);
	}
	
	/**************************************************
	 * 変数
	 **************************************************/
	public static void Variables() {
		// 変数宣言と初期化処理
		String name = "Geek君"; // 変数nameに文字列の値”Geek君”を代入
		int age = 30; // 変数ageに数字の値”30”を代入
		
		// 変数の中身をコンソールへ出力
		System.out.println(name + "\n");
		System.out.println(age + "\n");
		
		// 変数の中身を書き換える
		name = "生まれ変わったGeek君";
		age = 1;

		// 変数の中身をコンソールへ出力
		System.out.println(name + "\n");
		System.out.println(age + "\n");
		
		// String型にint型を連結すると自動的に文字列として扱われる
		System.out.println(name + "の年齢は" + age + "\n");
	}

	/**************************************************
	 * 四則演算
	 **************************************************/
	public static void Calculation() {
		// 加算（足し算）
		int a = 5;
		int b = 3;
		int sum = a + b; // sumには値（8）が代入される
		System.out.println(sum + "\n");
		
		// 減算（引き算）
		int x = 10;
		int y = 4;
		int difference = x - y;
		System.out.println(difference + "\n"); // differenceには値（6）が代入される
		
		// 乗算（掛け算）
		int p = 7;
		int q = 2;
		int product = p * q;
		System.out.println(product + "\n"); // producetには値（14）が代入される
		
		// 除算（割り算）
		int dividend = 20;
		int dicisor = 5;
		int quotient = dividend / dicisor;
		System.out.println(quotient + "\n"); // quotientには値（4）が代入される
		
		// 剰余算（割り算の余り）
		dividend = 17;
		int remainder = dividend % dicisor;
		System.out.println(remainder + "\n"); // remainderには値（2）が代入される
		
		// 自己代入
		int selfAssentment = 50;
		selfAssentment = selfAssentment + selfAssentment;
		System.out.println(selfAssentment + "\n"); // 値（100）が代入される

		selfAssentment = selfAssentment - 50;
		System.out.println(selfAssentment + "\n"); // 値（50）が代入される

		selfAssentment = selfAssentment * 3;
		System.out.println(selfAssentment + "\n"); // 値（150）が代入される

		selfAssentment = selfAssentment / 5;
		System.out.println(selfAssentment + "\n"); // 値（30）が代入される

		selfAssentment = selfAssentment % 29;
		System.out.println(selfAssentment + "\n"); // 値（1）が代入される
		
		selfAssentment++;
		System.out.println(selfAssentment + "\n"); // 値（2）が代入される
		
		selfAssentment--;
		System.out.println(selfAssentment + "\n"); // 値（1）が代入される
		
		// 小数を使った計算
		double c = 2.5;
		double d = 0.6;
		double doubleSum = c + d;
		System.out.println(doubleSum + "\n"); // doubleSumには値（3.1）が代入される
		
		// データ型が異なる値同士の計算
		int intNum = 3;
		double doubleNum = 0.5;
		System.out.println(intNum + doubleNum); // double型にキャスト：値（3.5）が表示される
		System.out.println(intNum + (int)doubleNum + "\n"); // int型にキャスト：値（3）が表示される
		
	}
}
