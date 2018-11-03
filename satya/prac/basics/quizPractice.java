package satya.prac.basics;

//import satya.prac.basics.EnumPrac.EnumTwo;

public class quizPractice {
	public enum days{mon,tue,wed};
	static int check(int a) {
		return 10+a;
	}
	public static void main(String args[]) {
		days d[]=days.values();
		System.out.println(check(10));
	}

}
