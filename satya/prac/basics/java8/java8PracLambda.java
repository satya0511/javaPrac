package satya.prac.basics.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class java8PracLambda implements lambdaInterface {
	
	public static void main(String args[]) {
		lambdaInterface lmd= li->10;
		System.out.println(lmd.test(new java8PracLambda()));
		//----------------
		Map<String,Integer> mp=new HashMap<>();
		mp.put("a",10);
		mp.put("b",20);
		mp.put("c",30);
		
		BiConsumer<String,Integer> printMap=(key,v1)->{
			System.out.println(key+"---"+v1);
		};
		mp.forEach(printMap);
	}

	@Override
	public int test(lambdaInterface li) {
		// TODO Auto-generated method stub
		return 0;
	}

}
