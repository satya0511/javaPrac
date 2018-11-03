package satya.prac.threadsAndConcurrency;

public class threadsAndConcurrencyPrac {
	public static void main(String args[]) {
		getAndPutNumbers gnp=new getAndPutNumbers();
		Thread p=new Thread(new producerThread(gnp));
		Thread c=new Thread(new consumerThread(gnp));
		p.start();
		c.start();
	}
}
