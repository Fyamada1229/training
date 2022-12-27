package training;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println(training03(args[0]));
	}
	
	public static String training03(String result) {
		
		//System.out.println(getComputer());
		
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
