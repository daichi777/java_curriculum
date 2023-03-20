
/*名前を入力したら下記がコンソールに出力されるように作ってください
条件：数値は毎回変わるように作ってください

こんにちは 「 名前 」 さん
ステータス
HP：849
MP：862
攻撃力：375
素早さ：937
防御力：24

さあ冒険に出かけよう！*/

package lesson1_25;

import java.util.Random;
import java.util.Scanner;

public class Rpg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("名前を入力してください：");
        String name = scanner.nextLine();

        int hp = random.nextInt(1000) + 1;
        int mp = random.nextInt(1000) + 1;
        int attack = random.nextInt(500) + 1;
        int agility = random.nextInt(1000) + 1;
        int defense = random.nextInt(50) + 1;

        System.out.println("こんにちは、" + name + "さん");
        System.out.println("ステータス");
        System.out.println("HP：" + hp);
        System.out.println("MP：" + mp);
        System.out.println("攻撃力：" + attack);
        System.out.println("素早さ：" + agility);
        System.out.println("防御力：" + defense);
        System.out.println("さあ冒険に出かけよう！");
    }
}

