package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 15;
		int b = 3;

		result(sum(a, b));
		result(sub(a, b));
		result(multi(a, b));
		result(div(a, b));
	}

	// メソッド１
	public static int sum(int a, int b) {
		return(a + b);
	}
	
	// メソッド２
	public static int sub(int a, int b) {
		return(a - b);
	}
	
	// メソッド３
	public static int multi(int a, int b) {
		return(a * b);
	}
	
	// メソッド４
	public static int div(int a, int b) {
		return(a / b);
	}
	
	// メソッド５
	public static void result(int result) {
		System.out.println("計算結果は" + result + "です");
	}
}
