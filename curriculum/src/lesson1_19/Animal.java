package lesson1_19;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog();
		System.out.println(dog.animals);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog animalcount = new Dog(5);
		System.out.println(animalcount.animalnum);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        String formattedNow = now.format(formatter);
        System.out.println(formattedNow);
	}
}
