package satya.prac.basics;

import java.util.ArrayList;

public abstract class genericsPrac<T,V> {
	
	
	public abstract T comp();
	
	public <K> void genMethod(ArrayList< ? super subClass1> k){
		k.add(new subClass2());
		superClass sup=(superClass) k.get(0);
		subClass2 sc2 =(subClass2) k.get(1);
		System.out.println(sup.i);
	}
}

