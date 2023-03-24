package lesson1_25_shori;

public class  SubAttack extends Character {//サブクラス
	
	public SubAttack(String name) {
		super(name);
	}

	@Override //メソッドのオーバーライド
	public void showStatus() {
		super.showStatus();//superクラスを使用
		System.out.println("さあ冒険に出かけよう!");
	}
	
	
	

}
