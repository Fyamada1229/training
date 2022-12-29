package training;

import java.util.Random;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// argeには2が入っている
		training03(args[0]);
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
	    Comparable num = Integer.valueOf(1);
	    
	    if (result instanceof String != true && num instanceof Number) {
	    	System.out.println("整数が入っています。");
	    }

	    System.out.println(result instanceof String); // → true
	    
	    
	    
		return result;
	}
	
	public static String getComputer() {
		// 乱数の準備
		Random rand = new Random();
		int changeRand = rand.nextInt(5);
		
		while (changeRand == 1 || changeRand == 3 || changeRand == 4) {
			changeRand = rand.nextInt(5);
			if(changeRand == 0 || changeRand == 2 || changeRand == 5) {
				break;
			}
		}
		Integer i = Integer.valueOf(changeRand);
		String strChangeRand = i.toString();
		// 0,2,5のどれかを、メソッドの結果として返す
		return strChangeRand;
	}

}
