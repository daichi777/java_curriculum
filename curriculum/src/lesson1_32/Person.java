package lesson1_32;

class Person{
private String name;
private int age;
private double height;
private double weight;
public  static int count = 0;//問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）

Person(String name, int age, double height, double weight){
this.name = name;
this.age = age;
this.height = height;
this.weight = weight;
this.count++;//問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください

}

public double bmi(){
return this.weight / this.height / this.height;
}

public void print(){
System.out.println("名前は" + name + "です");
System.out.println("年は" + age + "です");
}
//問題4：クラスメソッド「printCount」を定義してください（データ型：void）
//問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください
public static void printCount() {
    System.out.println("合計" + count + "人です");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public static int getCount() {
	return count;
}

public static void setCount(int count) {
	Person.count = count;
}
}