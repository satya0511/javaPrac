package satya.prac.threadsAndConcurrency;

public class producerThread implements Runnable  {
	getAndPutNumbers gnp;
	
	public producerThread(getAndPutNumbers gnp) {
		this.gnp=gnp;
	}
	public void run() {
		int n=0;
		System.out.println("pc");
		while(n<100) {
			gnp.put(n++);
		}
	}
}
