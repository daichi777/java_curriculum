package lesson1_14;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		    // 文字列型の配列を作成し、アルファベットa～jまでを格納する
		    String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

		    // ブレーク文を使用して、a～dまで表示する
		    for (int i = 0; i < alphabets.length; i++) {
		        if (alphabets[i].equals("e")) {
		            break;  // 文字列が"e"の場合、ループから抜ける
		        }
		        System.out.println(alphabets[i]);
		    }

		    // コンティニュー文を使用して、i以外を表示する
		    for (int i = 0; i < alphabets.length; i++) {
		        if (alphabets[i].equals("i")) {
		            continue;  // 文字列が"i"の場合、その後の処理をスキップして、次のループに移る
		        }
		        System.out.println(alphabets[i]);
		    }
		}

}
