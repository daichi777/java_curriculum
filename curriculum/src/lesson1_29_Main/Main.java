/*
 	
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8
   	5
   	9
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	
 */

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
		int[] num = new int[strSplit.length];
        for (int i = 0; i < strSplit.length; i++) {
            num[i] = Integer.parseInt(strSplit[i]);
        }
        
        Prefectures[] selectedPrefectures = new Prefectures[num.length];
        for (int i = 0; i < num.length; i++) {
            selectedPrefectures[i] = prefectures[num[i]];
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