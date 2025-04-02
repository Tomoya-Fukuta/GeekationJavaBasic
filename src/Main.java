public class Main {

	public static void main(String[] args) {
		// メソッド呼び出し
		DataType(); // データ型
		Variables(); // 変数
		Calculation(); // 四則演算と計算処理
		ComparisonLogicalOperators(); // 比較演算子と論理演算子
		IfSwitch(); // 条件分岐
		ForWhile(); // 繰り返し処理
		
		// クラスメソッド呼び出し
		StandardPackage.allMethodColl();
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
		System.out.println(name + "の年齢は" + age + "歳です" + "\n");
	}

	/**************************************************
	 * 四則演算と計算処理
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

	/**************************************************
	 * 比較演算子と論理演算子
	 **************************************************/
	public static void ComparisonLogicalOperators() {
		// 比較演算子
		int x = 5;
		int y = 10;
		int z = 5;
		
		// ==：比較対象と等しければtrue、異なればfalse
		boolean isEqualA = (x == y);
		boolean isEqualB = (x == z);
		System.out.println(isEqualA); // false
		System.out.println(isEqualB); // true
		
		// !=：比較対象と異なればtrue、等しければfalse　※さっきとは逆！
		boolean isNotEqualA = (x != y);
		boolean isNotEqualB = (x != z);
		System.out.println(isNotEqualA); // true
		System.out.println(isNotEqualB); // false
		
		// >：比較対象より値が大きい場合true、同じか小い場合false
		boolean isGreaterA = (x > y);
		boolean isGreaterB = (y > x);
		boolean isGreaterC = (x > z);
		System.out.println(isGreaterA); // false
		System.out.println(isGreaterB); // true
		System.out.println(isGreaterC); // false
		
		// <：比較対象より値が小い場合true、同じか大きい場合false
		boolean isLessA = (x < y);
		boolean isLessB = (y < x);
		boolean isLessC = (x < z);
		System.out.println(isLessA); // true
		System.out.println(isLessB); // false
		System.out.println(isLessC); // false
		
		// >=：比較対象と同じか大きい場合true、小さい場合false
		boolean isGreaterOrEqualA = (x >= y);
		boolean isGreaterOrEqualB = (y >= x);
		boolean isGreaterOrEqualC = (x >= z);
		System.out.println(isGreaterOrEqualA); // false
		System.out.println(isGreaterOrEqualB); // true
		System.out.println(isGreaterOrEqualC); // true
		
		// <=：比較対象と同じか小さい場合true、大きい場合false
		boolean isLessOrEqualA = (x <= y);
		boolean isLessOrEqualB = (y <= x);
		boolean isLessOrEqualC = (x <= z);
		System.out.println(isLessOrEqualA); // true
		System.out.println(isLessOrEqualB); // false
		System.out.println(isLessOrEqualC); // true
		
		// 論理演算子
		int a = 5;
		int b = 10;
		
		// 論理積（&&）：どちらの条件も満たしていた場合true
		boolean andResultA = (a < 6 && b > 9); // true && true = true
		boolean andResultB = (a < 6 && b < 10); // true && false = false
		System.out.println(andResultA); // true
		System.out.println(andResultB); // false
		
		// 論理和（||）：どちらかの条件を満たしていればtrue
		boolean orResultA = (a < 6 || b < 10); // true || false = true
		boolean orResultB = (a < 5 || b < 10); // false || flase = false
		System.out.println(orResultA); // true
		System.out.println(orResultB); // false
		
		// 論理否定（!）：条件の結果を反転させる（trueならばfalseになる）
		boolean noResultA = !(a == b); // !(true) = false
		boolean noResultB = !(a != b); // !(false) = true
		System.out.println(noResultA); // false
		System.out.println(noResultB); // true
	}

	/**************************************************
	 * 条件分岐
	 * if文（条件式）：「比較演算子」や「論理演算子」を使用できる
	 **************************************************/
	public static void IfSwitch() {
		int number = 30;
		
		System.out.println("更新前");
		// 条件式はtrueなので、if文の処理が実行される
		if(number >= 15) {
			System.out.println("15以上です");
		}
		
		number = 14;
		
		System.out.println("更新後");
		// 条件式はfalseなので、if文の処理が実行されない
		if(number >= 15) {
			System.out.println("15以上です");
		}
		
		System.out.println("完了");
		
		// elseについて
		if(number >= 15) // 条件にマッチした場合処理
		{
			System.out.println("15以上です");
		}
		else // 条件にマッチしなかった場合処理
		{
			System.out.println("15未満です");
		}
		
		System.out.println("完了");
		
		number = 10;
		
		// else ifについて
		// numberの値が10なので、number >= 10以上の場合の処理が実行される
		if(number >= 30) {
			System.out.println("30以上です");
		}
		else if(number >= 20) {
			System.out.println("20以上、30未満です");
		}
		else if(number >= 10) {
			System.out.println("10以上、20未満です");
		}
		else {
			System.out.println("10未満です");
		}
		
		System.out.println("完了");
		
		String dayOfWeek = "火曜";

		// switch文について
		switch(dayOfWeek) {
		case "月曜":
			System.out.println("月曜日");
			// 必ずbreakを使用して条件式を抜ける必要がある
			// 記述しなかった場合、その式より下のcase処理が全て実行される
			break;
			
		case "火曜":
			System.out.println("火曜日");
			break;
			
		case "水曜":
			System.out.println("水曜日");
			break;
			
		default:
			System.out.println("その他の曜日");
		}
	}
	
	/**************************************************
	 * 繰り返し処理
	 **************************************************/
	public static void ForWhile() {
		// １：初期値を設定
		int num = 1;
		
		// ２：繰り返しの条件を定義
		while(num <= 100) {
			// ３：繰り返す処理を実行
			System.out.println(num);
			
			num++; // 無限ループにならないようnumを加算
		}
		
		// 上記のwhile文と同じ処理をfor文で実行
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		// 整数型の配列を宣言して初期化
		// 長さが5の整数型の配列を作成。格納されている要素の値は全て0
		int[] numbers_1 = new int[5];
		
		// 配列の宣言と同時に初期値を設定する
		int[] numbers_2 = {10, 20, 30, 40, 50};
		System.out.println(numbers_2[0]); // 配列要素の1番目にアクセス
		System.out.println(numbers_2[2]); // 配列要素の3番目にアクセス
		
		// 文字列型の配列を作成
		String[] fruits = {"りんご", "バナナ", "オレンジ"};
		System.out.println(fruits[0]); // 配列要素の1番目にアクセス
		// System.out.println(fruits[3]);  存在しない要素へのアクセスはエラーになる

		// 要素の上書き
		System.out.println(fruits[1]); // 出力結果：バナナ
		fruits[1] = "ぶどう";
		System.out.println(fruits[1]); // 出力結果：ぶどう
		// ※存在しないindex、型の異なる値をいれるとエラーになる
		
		// 配列の長さ（要素数）はlengthプロパティを使用して取得可能
		System.out.println(fruits.length); // 出力結果：3
		// ※要素の追加、削除は配列型では難しい
		
		// 拡張for文
		for(String fruit: fruits) {
			System.out.println(fruit); // fruitにはfruitsの要素がindex順に入る
		}
		
		// breakとcontinue
		int[] counts = new int[10];
		for(int i = 0; i <= 100; i++) {
			if(i >= 10) {
				break; // iの値が10より大きくなったらfor文を抜ける
			}
			
			counts[i] = i + 1;
		}
		
		for(int count: counts) {
			if((count % 3) == 0) {
				System.out.println("アホになって" + count + "と言う");
				continue; // ココより下のfor文の中身を処理せず次のループへスキップする
			}
			
			System.out.println("普通に" + count + "と言う");
		}
	}
}
