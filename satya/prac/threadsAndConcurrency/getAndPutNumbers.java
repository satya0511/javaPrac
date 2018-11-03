package satya.prac.threadsAndConcurrency;

public class getAndPutNumbers {
	boolean flag=false;
	int i;
	public synchronized void put(int i) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.i=i;
		System.out.println("put"+i);
		flag=true;
		notify();
	}
	public synchronized void get() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("get"+i);
		flag=false;
		notify();
	}
		
}
