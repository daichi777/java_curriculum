package lesson1_30;

class Person{
public String name;
public int age;
public double height;
public double weight;
public double bmi;
public static int count = 0;

public Person(String name, int age, double height, double weight){
this.name = name;
this.age = age;
this.height = height;
this.weight = weight;
count++;
}

public double bmi() {
    this.bmi = this.weight / (this.height/100.0) / (this.height/100.0);
    return this.bmi;
}

public void print(){
System.out.println("名前は" + this.name + "です");
System.out.println("BMI"+ this.bmi() +"です");
System.out.println("年は" + this.age + "です");
}

public static void printCount() { // クラスメソッドprintCountの定義
    System.out.println("合計" + count + "人です");
  }



}

