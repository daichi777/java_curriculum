package lesson1_29_Main;
import java.util.Arrays;
import java.util.Scanner;

import lesson1_29_shori.Prefectures;



public class Main {	
    public static void main(String[] args) {
    	
        // 都道府県の配列を作成
        Prefectures[] prefectures = {
            new Prefectures("北海道", "札幌市", 83424,0),
            new Prefectures("青森県", "青森市", 9646,1),
            new Prefectures("岩手県", "盛岡市", 15275,2),
            new Prefectures("宮城県", "仙台市", 7282,3),
            new Prefectures("秋田県", "秋田市", 11638,4),
            new Prefectures("山形県", "山形市", 9323,5),
            new Prefectures("福島県", "福島市", 13784,6),
            new Prefectures("茨城県", "水戸市", 6097,7),
            new Prefectures("栃木県", "宇都宮市", 6408,8),
            new Prefectures("群馬県", "前橋市", 6362,9),
            new Prefectures("埼玉県", "さいたま市", 3798,10)
        };

        Scanner scanner = new Scanner(System.in);
        
        

        // 数字の入力を求める
        System.out.print("数字を入力してください：");
//        int number = scanner.nextInt();
        String strInput = scanner.nextLine();
		String[] strSplit = strInput.split(" "); // 空白ごとに分割
//		int[] num = new int[strSplit.length]; // 分割数分の整数の配列を生成        
		int[] nums = new int[strSplit.length];
        for (int i = 0; i < strSplit.length; i++) {
            nums[i] = Integer.parseInt(strSplit[i]);
        }
        
        Prefectures[] selectedPrefectures = new Prefectures[nums.length];
        for (int i = 0; i < nums.length; i++) {
            selectedPrefectures[i] = prefectures[nums[i]];
        }
		
       
        // 昇順または降順の入力を求める
        System.out.print("ソート方法を選択してください（0:昇順、1:降順）：");
        int sortMethod = scanner.nextInt();
        
        // 都道府県をソートする
        if (sortMethod == 0) {
        	Arrays.sort(selectedPrefectures, (a, b) -> Integer.compare(a.getIndex(), b.getIndex()));

        } else if (sortMethod == 1) {
        	Arrays.sort(selectedPrefectures, (a, b) -> Integer.compare(b.getIndex(), a.getIndex()));

        }

        // ソートされた都道府県を出力
        for (Prefectures prefecture : selectedPrefectures) {
            System.out.println("都道府県名：" + prefecture.getName());
            System.out.println("県庁所在地：" + prefecture.getCapital());
            System.out.println("面積：" + prefecture.getArea() + "km2\n");
        }
       
    }
}