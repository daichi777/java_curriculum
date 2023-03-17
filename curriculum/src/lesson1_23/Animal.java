package lesson1_23;

public class Animal {
    private String name;
    private double length;
    private double speed;

    public Animal(String name, double length, double speed) {
        this.name = name;
        this.length = length;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public static void main(String[] args) {
        Animal lion = new Animal("ライオン", 2.1, 80);
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}


