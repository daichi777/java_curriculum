package lesson1_25_shori;

public class Stage extends User {
	
	private int hp;
	private int mp;
	private int atk;
	private int sp;
	private int def;
	

	public Stage(String name) {
		super(name);
		this.hp = User.getRandom(1000);
		this.mp = User.getRandom(1000);
		this.atk = User.getRandom(1000);
		this.sp = User.getRandom(1000);
		this.def = User.getRandom(50);
		
		
	}
	

	public int getHP() {
		return hp;
	}
	
	public void setHP(int hp) {
		this.hp = hp;
	}
	
	public int getMP() {
		return hp;
	}
	
	public void setMP(int mp) {
		this.mp = mp;
	}
	
	public int getATK() {
		return atk;
	}
	
	public void setATK(int atk) {
		this.atk = hp;
	}
	
	public int getSP() {
		return sp;
	}
	
	public void setSP(int sp) {
		this.sp = sp;
	}
	
	public int getDEF() {
		
		return def;
	}
	
	public void setDEF(int def) {
		this.def = def;
	}
	
	public void showStetas() {
		System.out.println("ステータス");
        System.out.println("HP：" + hp);
        System.out.println("MP：" + mp);
        System.out.println("攻撃力：" + atk);
        System.out.println("素早さ：" + sp);
        System.out.println("防御力：" + def);
        System.out.println("");
        System.out.println("さあ冒険に出かけよう！");
        }

}
