package basicSyntax;

public class Main {

	public static void main(String[] args) {

		System.out.println("こんにちは");
		System.out.println("私の名前は");
		System.out.println("ともや君です");
		System.out.println("");
		
		// 文字列は「+」で連結できる
		System.out.println("こんにちは" + "私の名前は" + "ともや君です");
		System.out.println("");
		
		// 文字列の最後に「\n」で改行できる！
		System.out.println("こんにちは\n" + "私の名前は\n" + "ともや君です\n");
		
		// メソッド呼び出し
		var_int(); // int型
		System.out.println("");
		
		var_double(); // double型
		System.out.println("");
		
		var_boolean(); // boolean型
		System.out.println("");
	}
	
	public static void var_int() {
		System.out.println(1);
		System.out.println(-1);
		System.out.println(5 + 1);
		
		// 数値は " " で囲むと文字列扱いになる
		System.out.println("5 + 1");
		System.out.println("5" + "1");
	}
	
	public static void var_double() {
		System.out.println(0.25);
		System.out.println(-0.25);
		System.out.println(5 - 2.5);
	}
	
	public static void var_boolean() {
		System.out.println(true);
		System.out.println(false);
	}
}
