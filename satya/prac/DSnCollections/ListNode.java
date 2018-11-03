package satya.prac.DSnCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class ListNode {
	private int data;
	private ListNode next;

	public ListNode(int Data){
		this.data =Data;
	}
	
	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	
	

	public static void main(String args[]){
		 int first=1;
		 int second=2;
		 int third=3;
		 int fourth=4;
		
		ListNode headNode=new ListNode(first);
		ListNode secondNode=new ListNode(second);
		ListNode thirdNode=new ListNode(third);
		ListNode fourthNode=new ListNode(fourth);
		headNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		thirdNode.setNext(fourthNode);
		fourthNode.setNext(null);
		
		
		
		
		
	}
	
	static int ListLength(ListNode head){
		int length=0;
		
	/*	if(head.getNext()==null){
			return 0;
		}
		else{
				length++;
				System.out.println("element"+head.getData());
				ListLength(head.getNext());
		}
		*/
		ListNode currentNode=head;
		while(currentNode!=null){
				length++;
				System.out.println("the element is"+currentNode.getData());
				//ListLength(head.getNext());
				currentNode=currentNode.getNext();
		}
		return length;
	}
}
