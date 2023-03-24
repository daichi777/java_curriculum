package lesson1_29_shori;

public class Prefectures {
	private String name;
    private String capital;
    private double area;
    private int index;

    public Prefectures(String name, String capital, double area, int index) {
        this.name = name;
        this.capital = capital;
        this.area = area;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

	public int getIndex() {
		return index;
	}
    
}

