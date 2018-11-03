package satya.prac.basics;

public class exceptionsBasics2 {
	
	public int checkException(){
		int i=10;
		exceptionBasics eb=new exceptionBasics();
			try {
				eb.testException();
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("in carch");
				return i;
			}
			finally{
				System.out.println("in finally");
				return i;
			}
		}
	
	public static void main (String args[]){
		int i = new exceptionsBasics2().checkException();
		System.out.println(i);
	}
	}

