package satya.prac.threadsAndConcurrency;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class inSyncThread implements Runnable {

	StringBuffer sbf;
	StringBuffer sbf1;
	public  inSyncThread(StringBuffer sbf) {
		this.sbf=sbf;
	}
	
	public  inSyncThread(StringBuffer sbf,String type) {
		this.sbf1=sbf;
	}
	
	public void run() {
		synchronized(sbf) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(int i=0;i<=100;i++) {System.out.println(sbf+"---"+i+"--"+Thread.currentThread().getName());}
			System.out.println();
			char temp =sbf.charAt(0);
			temp++;
			sbf.setCharAt(0, temp);
		}
	}
	
	public static void main(String args[]) {
		StringBuffer sbf=new StringBuffer("A");
		inSyncThread insyncThread=new inSyncThread(sbf);
		inSyncThread insyncThread1=new inSyncThread(sbf,"type");
		Thread t1=new Thread(insyncThread);
		Thread t2=new Thread(insyncThread);
		Thread t3=new Thread(insyncThread1);
		//t1.start();
		t2.start();
		t3.start();
	}
}
