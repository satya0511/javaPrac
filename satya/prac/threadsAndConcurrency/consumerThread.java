package satya.prac.threadsAndConcurrency;

public class consumerThread implements Runnable {
	getAndPutNumbers gnp;
	public consumerThread(getAndPutNumbers gnp) {
		this.gnp=gnp;
	}
	public void run() {
		System.out.println("cc");
		int n=0;
		while(n<100) {
			gnp.get();
			n++;
		}
	}

}
