package satya.prac.basics;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

import satya.prac.basics.EnumPrac.EnumTwo;

public class javaBasicsPracticeClass {
	int j,k;
	public javaBasicsPracticeClass(String S) {
		System.out.println("S");
	}
	
	static int l;
	{
		j=10;
		k=20;
		System.out.println("IIB");
	}
	static {
		 l=0;
		System.out.println("SIB");
	}
	public javaBasicsPracticeClass() {
		System.out.println("constructr");
	}
	int i=10;
	public void testOvrloading() {
		System.out.println("in super");
	}
	
	static abstract  class stNestedClass{
		
	}
	public static void main(String args[]) {
		List<List<Integer>> table = new ArrayList<List<Integer>>();
		
		PriorityQueue q = new PriorityQueue();
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		TreeSet<Integer> t=new TreeSet<>();
		t.add(1);
		lhs.add("sa");
		lhs.add("s");
		System.out.println(lhs.size());
		for(String s:lhs) {
			System.out.println(s);
		}
	/*	q.add(2);
		q.add(6);*/
		q.add("7");
		q.add("2");
		System.out.println(q.peek());
		q.offer("1");
		q.add("4");
		q.add("3");
		q.remove("1");
		System.out.println(q.poll());
		if(q.remove("2")) {
			System.out.println(q.poll());
		}
		System.out.println(q.peek()+""+q.poll()+""+q.peek());
		
	}
	
	
}
