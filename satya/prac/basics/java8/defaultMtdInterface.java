package satya.prac.basics.java8;

public interface defaultMtdInterface {
	int getNumber();
	default String getString(String str) {
		str="test default method interface";
		System.out.println(str);
		return str;
	}
	public static String getStringStatic(String str) {
		str="test default method interface";
		System.out.println(str);
		return str;
	}
	
}
