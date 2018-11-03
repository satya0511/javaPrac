package satya.prac.DSnCollections;

import java.util.LinkedList;

public class josephuesCircle {
	
	public int findHighestRank(){
		ListNode p=new ListNode(1);
		ListNode q=new ListNode(1);
		p.setData(1);
		q.setNext(p);
		int i=0;
	
		 for(i=2;i<=10;i++){
			 p.setNext(new ListNode(i));
			 p=p.getNext();
		 }
		 	q.setData(i);
			p.setNext(q);
		
	for(int i1=11;i1>1;i1--){
		for(int pos=0;pos<3;pos++){
			System.out.println("elem"+p.getData());
			p=p.getNext();
		}
			p.setNext(p.getNext().getNext());
	}		
			
			System.out.println("out"+p.getNext().getData());
		return p.getData();
	}

	
	
	 static LinkedList ll= new LinkedList();
	 
	public static void main(String args[]){
		josephuesCircle jc=new josephuesCircle();
		int i=jc.findHighestRank();
		
		for(int j=0;j<=10;j++){
			ll.add(j);
		}
		for(int k=ll.size();k<=0;--k){
			System.out.println(ll.remove(k));
		}
		
		
		//System.out.println(2%5);
	}
	
	
	
	
}
