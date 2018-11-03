package satya.prac.basics;

public class javaBasicsPracticeClass2 extends javaBasicsPracticeClass {
	int i=20;
	
	public javaBasicsPracticeClass2(String s) {
		System.out.println("sss");
	}
	
	public void testOvrloading() {
		System.out.println("in subClass");
		l=20;
		System.out.println(l);
	}
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		/*javaBasicsPracticeClass2 jbc2=new javaBasicsPracticeClass2();
		javaBasicsPracticeClass jbc=new javaBasicsPracticeClass();
		jbc2.testOvrloading();
		System.out.println("value for i is "+jbc2.i);
		System.out.println("--"+jbc.l);
		System.out.println("--"+jbc2.l);*/
		new javaBasicsPracticeClass2("S");
		
	}
	
}
