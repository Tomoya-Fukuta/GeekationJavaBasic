package objectExercise;

// 抽象スーパークラス（物件）
// 外部から直接のアクセスを禁止する
abstract public class Property {
	
	// インスタンスフィールド
	protected String buildName; // 物件名
	protected String ownerName; // 物件所有者名
	protected String buildType; // 物件種別
	protected String buildPrice; // 物件価格
	
	/**************************************************
	 * コンストラクタ：子クラスで共通する初期化処理を全て持たせる
	 * ※superを使用し子クラスから呼び出す
	 **************************************************/
	protected Property(String buildName, String ownerName, String buildType, String buildPrice) {
		this.buildName = buildName;
		this.ownerName = ownerName;
		this.buildType = buildType;
		this.buildPrice = buildPrice;
	}

	/**************************************************
	 * コンソール出力：子クラスで共通する情報は全て親側で出力
	 * 直接子クラスから呼び出す
	 **************************************************/
	protected static void output(String buildName, String ownerName, String buildType, String buildPrice) {
		System.out.println("===================================");
		System.out.println("物件名　　　：" + buildName);
		System.out.println("物件所有者名：" + ownerName);
		System.out.println("物件種別　　：" + buildType);
		System.out.println("物件価格　　：" + buildPrice);
	}
	
	//---------- ここから抽象メソッド ----------
	/**************************************************
	 * 物件名：取得・設定
	 **************************************************/
	abstract protected String getBuildName();
	abstract protected void setBuildName(String buildName);

	/**************************************************
	 * 所有者名：取得・設定
	 **************************************************/
	abstract protected String getOwnerName();
	abstract protected void setOwnerName(String ownerName);
	
	/**************************************************
	 * 物件種別：取得・設定
	 **************************************************/
	abstract protected String getBuildType();
	abstract protected void setBuildType(String buildName);
	
	/**************************************************
	 * 物件価格：取得・設定
	 **************************************************/
	abstract protected String getBuildPrice();
	abstract protected void setBuildPrice(String buildPrice);
	
}
