package satya.prac.DSnCollections;

import java.time.temporal.IsoFields;

public class arrayQueue {
	
	private int front;
	private int rear;
	private int capacity;
	private int [] array;
	
	private arrayQueue(int size){
		capacity =size;
		front=-1;
		rear=-1;
		array = new int[size];
	}
	
	public static arrayQueue create(int size){
		return new arrayQueue(size);
	}
	
	public boolean isEmpty(){
		return(front==-1);
	}
	
	public boolean isFull(){
		return((rear+1)%capacity==front);
	}

	public int queueSize(){
		return((capacity-front+rear+1)%capacity);
	}
	
	public void enQueue(int data){
		if(isFull()){
			System.out.println("stack full");
		}
		else{
			rear=(rear+1)%capacity;
			array[rear]=data;
			if(front==-1){
				front=rear;
			}
		}
	}
	
	public int deQueue(){
		int data= 0;
		if(isEmpty()){
			System.out.println("empty");
		}else{
			data=array[front];
			if(front==rear){
				front=rear-1;
			}else{
				front=(front+1)%capacity;
			}
		}
		return data;
		
	}
	
	public static void main(String args[]){
		
		arrayQueue aQ=null;
		aQ=arrayQueue.create(5);
		
		aQ.enQueue(5);
		aQ.enQueue(4);
		aQ.enQueue(2);
		aQ.enQueue(7);
		aQ.enQueue(510);
		
		System.out.println("size"+aQ.queueSize());
		System.out.println("size"+aQ.isFull());
		System.out.println("size"+aQ.isEmpty());
		
	
		
		System.out.println(aQ.deQueue());
		aQ.enQueue(210);
		
		
		
	} 
}
