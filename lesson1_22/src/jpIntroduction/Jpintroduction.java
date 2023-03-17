package jpIntroduction;
import java.util.Date;



public class Jpintroduction {
	public String Country = "日本";
	public String str = "この寿司はうまい";
	
	
public void here() {
	System.out.println("こんにちは！ここは" + Country + "です！");
}
public void food(String str) {
	
	System.out.println(this.str);
	System.out.println(str);
}
Date nowtime = new Date();
public void time() {
	System.out.println("今の現在日時は" + nowtime + "です");
}


}
