package lesson1_25_shori;

import java.util.Random;

public class Character {
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int agility;
    private int defense;

    public Character(String name) {//コンストラクタを使用
        this.name = name;
        Random random = new Random();
        this.hp = random.nextInt(1000) + 1;
        this.mp = random.nextInt(1000) + 1;
        this.attack = random.nextInt(500) + 1;
        this.agility = random.nextInt(1000) + 1;
        this.defense = random.nextInt(100) + 1;
    }
//getterとsetterを使用
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAttack() {
        return attack;
    }

    public int getAgility() {
        return agility;
    }

    public int getDefense() {
        return defense;
    }

    public void showStatus() {
        System.out.println("こんにちは、" + name + "さん");
        System.out.println("ステータス");
        System.out.println("HP：" + hp);
        System.out.println("MP：" + mp);
        System.out.println("攻撃力：" + attack);
        System.out.println("素早さ：" + agility);
        System.out.println("防御力：" + defense);
    }
}
