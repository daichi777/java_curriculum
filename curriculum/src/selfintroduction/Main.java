package selfintroduction;

public class Main {
	public static void main(String[] args) {
	    Person person1 = new Person("鈴木太郎", 20, 1.7,70);
	    Person person2 = new Person("山田花子",22,1.5,40);
	   
	   // person1.print();
	    //person2.print();
	    //Person.printCount();
	  
	Car car = new Car();
	Bicycle bicycle = new Bicycle();
	
	car.setOwner(person1.lastName());
	  bicycle.setOwner(person2.lastName());
	  System.out.println(car.getOwner());   System.out.println(bicycle.getOwner());
	}
}
