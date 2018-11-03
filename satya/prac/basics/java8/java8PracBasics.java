package satya.prac.basics.java8;

public class java8PracBasics implements defaultMtdInterface{


	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String args[]) {
		defaultMtdInterface dfi=new java8PracBasics();
		dfi.getString("so");
		java8PracBasics j8b=new java8PracBasics();
		String str=j8b.getString("something");
		System.out.println();
		
	}
}
