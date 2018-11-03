package satya.prac.basics.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class parellelStreams {

	public void printSum() {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = list.stream().parallel().mapToInt(n->n).sum();
		System.out.println("name"+sum);
	}
	public void printSumWithPeek() {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = list.stream().
				parallel().
				peek(i->{
					System.out.println("name in peek"+Thread.currentThread().getName());
				}).
				mapToInt(n->n).sum();
		System.out.println(sum);
	}
	public void printSumWithFJP() {
		ForkJoinPool fjp=new ForkJoinPool(2);
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		try {
			Integer sum=(Integer)fjp.submit(()->
				list.stream().
				parallel().
				peek(i->System.out.println("name in fjp"+Thread.currentThread().getName())).
				mapToInt(n->n).
				sum()
			).get();
			System.out.println(sum);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
