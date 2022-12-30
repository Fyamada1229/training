package training;

import java.util.Random;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// argeには0が入っている
		System.out.println(training03(args[0]));
	}
	
	public static String training03(String result) {
		// 数字のみ判定する
		boolean intResult = false;
	    if (result != null) {
	        Pattern pattern = Pattern.compile("^[0-9]+$");
	        intResult = pattern.matcher(result).matches();
	        if (intResult == false) {
	            System.out.println("数字以外の値が入っています。0,2,5のどれかを入力して下さい。");
	        }
	    }
	    
	    // 文字列以外が入ってきている場合の判定
	    Comparable<?> num = Integer.valueOf(1);
	    if (result instanceof String == false && num instanceof Number) {
	    	System.out.println("整数が入っています。");
	    }
	    
	    int cpu = getComputer();
	    System.out.println(result);
	    System.out.println(cpu);
	    
	    // resultを整数にして比較する
	    int changeNumResult = Integer.parseInt(result);	 
	    
	    // 条件 0 グー, 2チョキー, 5パー
		if(changeNumResult == 0 && cpu == 2 || changeNumResult == 2 && cpu == 5 || changeNumResult == 5 && cpu == 0) {
			result="勝ち";
			}else if(changeNumResult == 0 && cpu == 0 || changeNumResult == 2 && cpu == 2 || changeNumResult == 5 && cpu == 5) {
			result="あいこ";
			}else {
			result="まけ";
			}

		return result;
	}
	
	public static int getComputer() {
		// 乱数の準備
		Random rand = new Random();
		int changeRand = rand.nextInt(5);
		
		while (changeRand == 1 || changeRand == 3 || changeRand == 4) {
			changeRand = rand.nextInt(5);
			if(changeRand == 0 || changeRand == 2 || changeRand == 5) {
				break;
			}
		}
		// 0,2,5のどれかを、メソッドの結果として返す
		return changeRand;
	}

}
