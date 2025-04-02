import java.util.ArrayList;
import java.util.List;

public class StandardPackage {
	
	public static void listAndArrayList() {
		// List型とArrayList型
		List<String> arrayList = new ArrayList<String>();
		
		// 要素を追加
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		
		// 要素の取得
		System.out.println(arrayList.get(0)); // Apple
		System.out.println(arrayList.get(1)); // Banana
		
		// 要素の削除
		arrayList.remove("Banana");
		
		// 要素の数
		System.out.println(arrayList.size()); // 2
	}
	
	public static void stringBuilderExample() {
		// StringBuilder（スレッドセーフ無し）のインスタンス生成
		StringBuilder sb = new StringBuilder();
		
		sb.append("文字列を追加 & ");
		sb.append("結合する" + "\n");
		sb.append("このようにメソッドチェーン").append("で記述することも可能");
		
		// StringBuilderをStringに変換して出力
		// StringBuilderクラスは自身を戻り値として返す。その為String型にキャストして出力する必要がある
		String result = sb.toString();
		System.out.println(result);
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("abcde");
		stringBuilder.append("12345");
		stringBuilder.append("ABCDE");
		
		// insertメソッド（文字列の挿入）
		stringBuilder.insert(5, "挿入");
		stringBuilder.insert(12, "挿入");
		
		// replaceメソッド（文字列の置換）
		stringBuilder.replace(5, 7, "置換");
		
		// deleteメソッド（文字列の削除
		stringBuilder.delete(14, 19);
		
		result = stringBuilder.toString();
		System.out.println(result);
	}
}
