package lesson1_31;

public class Person{
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	public static int count =0;
	String firstName;
	String lastName;
	public String fullname;
	

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name,int age,double height,double weight){
		this.name = name;
		this.age = age;
		this.height= height;
		this.weight=weight;
		count++;
	}
	public static void printCount() {
		System.out.println("合計"+count+"人です");
	}

	public double bmi() {
        double bmi = weight / (height * height);
        return bmi;
    }

	
	public void print() {
		System.out.println("名前は"+this.name +"です");
		System.out.println("年は"+this.age +"です");
	}
	
	public String fullName() {
		
		return name;
	}
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
		}

		public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
		}
	/*public Person(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName= lastName;
	}*/
	
	 }
	
	