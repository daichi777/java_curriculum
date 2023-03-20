package lesson1_32;

class Person{
private String name;
private int age;
private double height;
private double weight;
public  static int count = 0;

Person(String name, int age, double height, double weight){
this.name = name;
this.age = age;
this.height = height;
this.weight = weight;
this.count++;

}

public double bmi(){
return this.weight / this.height / this.height;
}

public void print(){
System.out.println("名前は" + name + "です");
System.out.println("年は" + age + "です");
}
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