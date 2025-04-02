package objectExercise;

public class Main {

	public static void main(String[] args) {
		// インスタンス生成（同時に初期値を設定する）
		Apartment apartment = new Apartment(
				"良い感じのアパートメント",
				"山田　マンション太郎",
				"マンション",
				"50000000円",
				"３LDK");
		
		Land land = new Land(
				"良い感じの土地",
				"山田　土地太郎",
				"土地",
				"8000000円",
				"105.2㎡");
		
		// コンソールへ出力する
		apartment.output();
		land.output();
	}

}
