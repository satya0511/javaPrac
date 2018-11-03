package satya.prac.basics;

enum EnumPrac {
    ONE("one"),TWO("two");
    String s;
    {
        System.out.println("sone enumprac");
    }
    EnumPrac(String s){
    	this.s=s;
    }
    
    
    enum EnumTwo
    {
        TWO
    }
}
