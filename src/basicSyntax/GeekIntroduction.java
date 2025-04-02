package basicSyntax;

public class GeekIntroduction {

	public static void greeting(int age, double height) {
		System.out.println("こんにちは！私はGeek君でごわす。");
		System.out.println("年は" + age + "歳でごわす。");
		System.out.println("身長は" + height + "cmでごわす。");	
	}
	
	public static void specialSkill(int num1, int num2) {
		// num1 または num2が値（1）より小さい場合
		if(num1 < 1 || num2 < 1) {
			System.out.println("num1とnum2は0より大きい値にしてください。");
		}
		// num1がnum2以上の場合
		else if(num1 >= num2) {
			System.out.println("num2はnum1より大きい値にしてください。");
		}
		// num1 または num2が300より大きい場合
		else if(num1 > 300 || num2 > 300) {
			System.out.println("num1とnum2は300以下にしてください。");
		}
		else {
			for(int i = num1; i <= num2; i++) {
				if((i % 3) == 0 && (i % 5) == 0) {
					System.out.println(i + "は3の倍数かつ5の倍数です");
					continue;
				}
				else if((i % 3) == 0) {
					System.out.println(i + "は3の倍数です");
					continue;
				}
				else if((i % 5) == 0) {
					System.out.println(i + "は5の倍数です");
					continue;
				}
			}
		}
	}
}