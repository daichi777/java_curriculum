

package lesson1_18;
import java.util.Random;

public class Method {
	//Q1
	public static void message() {
		System.out.println("Hello Java");
	}
	//Q2
	static void increment(int num) {
		System.out.println(num + 1);
	}
	//Q3
	static int multiplication(int x, int y) {
		return x * y;
	}
	//Q4
	static double multiplication(double a,double b) {
		return a * b;
	}
	//Q5
	
	
	

	static int[] getRandomNumbers(int n) {
	    int[] numbers = new int[n];
	    Random random = new Random();
	    for (int i = 0; i < n; i++) {
	        numbers[i] = random.nextInt(100) + 1;
	    }
	    return numbers;
	}
	//Q6
	public static double getAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

	public static void main(String[] args) {
		// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を呼び出してください。
		message();
		// Q2：引数として整数を渡すと+1してメソッド（関数）関数を呼び出してコンソールに出力してください。
		increment(2);
		// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		int x = 5;
		int y = 10;
		System.out.println(multiplication(x,y));
		// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		double a =7.7;
		double b =4.3;
		System.out.println(multiplication(a,b));
		
		// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）
		//     を呼び出して、ループ文を用いてそれぞれの数をコンソールに出力してください。
		int n = 10;
		int[] numbers = getRandomNumbers(n);
		for(int randomNumbers : numbers) {
			System.out.println(randomNumbers);
		}
		
		
		
		// Q6：Q5で作成した関数を用いて、配列の要素の平均値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		double average = getAverage(numbers);
        System.out.println(average);
    }
	}

