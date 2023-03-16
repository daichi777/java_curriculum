/*
	string型の配列を作成し、アルファベットa～jまでを格納してください。
	brake文を使用し、a～dまで表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	          
	cotinue文を使用し、i以外を表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	           e
	           f
	           g
	           h
	           j
*/
package array2.java;

public class practice {

	public static void main(String[] args) {
		String[] alpha = {"a","b","c","d","e","f","g","h","i","j"};
		
		for(String letter : alpha) {
			if(letter.equals("e")) {
				break;
			}
			System.out.println(letter);
		}
		for(String letter : alpha) {
		    if(letter.equals("i")) {
		        continue;
		    }
		    System.out.println(letter);
		}
		
		
		

	}

}
