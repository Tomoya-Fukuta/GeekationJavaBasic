package objectExercise;

// Propertyクラスのサブクラス：土地
public class Land extends Property {
	// 子クラスのみが持つフィールド
		public String landSize;
		
		/**************************************************
		 * コンストラクタ
		 **************************************************/
		public Land(String buildName, String ownerName, String buildType, String buildPrice, String landSize) {
			super(buildName, ownerName, buildType, buildPrice);
			this.landSize = landSize;
		}

		/**************************************************
		 * コンソール出力
		 **************************************************/
		public void output() {
			Property.output(this.buildName, this.ownerName, this.buildType, this.buildPrice);
			System.out.println("広さ　　　　：" + this.landSize);
			System.out.println("===================================\n");
		}
		
		/**************************************************
		 * 物件名：取得・設定
		 **************************************************/
		public String getBuildName() {
			return this.buildName;
		}
		public void setBuildName(String name) {
			this.buildName = name;
		}

		/**************************************************
		 * 所有者名：取得・設定
		 **************************************************/
		public String getOwnerName() {
			return this.ownerName;
		}
		public void setOwnerName(String name) {
			this.ownerName = name;
		}

		/**************************************************
		 * 物件種別：取得：設定
		 **************************************************/
		public String getBuildType() {
			return this.buildType;
		}
		public void setBuildType(String name) {
			this.buildType = name;
		}

		/**************************************************
		 * 物件価格：取得：設定
		 **************************************************/
		public String getBuildPrice() {
			return this.buildPrice;
		}
		public void setBuildPrice(String price) {
			this.buildPrice = price;
		}
		
		/**************************************************
		 * 間取り：取得・設定
		 **************************************************/
		public String getLandSize() {
			return this.landSize;
		}
		public void setLandSize(String landSize) {
			this.landSize = landSize;
		}
}
