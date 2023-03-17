package lesson1_27;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("コンソールに文字を入力してください");
        String input = scanner.nextLine();

        String[] animals = input.split(",");

        for (String animal : animals) {
            String[] animalDetails = animal.split(":");
            String name = animalDetails[0];
            double length = Double.parseDouble(animalDetails[1]);
            int speed = Integer.parseInt(animalDetails[2]);

            String scientificName;
            switch (name) {
                case "ライオン":
                    scientificName = "パンテラ レオ";
                    break;
                case "ゾウ":
                    scientificName = "ロキソドンタ・サイクロティス";
                    break;
                case "パンダ":
                    scientificName = "アイルロポダ・メラノレウカ";
                    break;
                case "チンパンジー":
                    scientificName = "パン・トゥログロディテス";
                    break;
                case "シマウマ":
                    scientificName = "チャップマンシマウマ";
                    break;
                case "インコ":
                    scientificName = "不明";
                    break;
                default:
                    scientificName = "不明";
                    break;
            }

            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + scientificName + "\n");
        }
    }
}
