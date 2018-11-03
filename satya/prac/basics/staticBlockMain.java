package satya.prac.basics;
class staticPartice{
	{
		System.out.println("in intial block");
	}
	
	static {
		System.out.println("in static block of staticPractice");
		
	}
	
	 static int number=30;
	 static int staticMethod(){
		 //number=10;
			return number;	
	}

 }

 public class staticBlockMain{
	{
		System.out.println("in intial block- main");
	}
	
	static{
		System.out.println("print staticblockmain");
	}
	
}


