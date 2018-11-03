package satya.prac.basics.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class java8PracStreams {
	
public static void main(String args[]) {
	List<String> ex = new ArrayList<>();
	ex=Arrays.asList("a","b","c","berozgar","bewafa","batman");
	Stream<String> exstream=ex.stream();
	/*Optional<String> op = exstream.filter(p->p.startsWith("b")).peek(System.out::println).find();
	System.out.println("count--->"+count);
	Optional<String> op=exstream.findFirst();
	ex.forEach(System.out::println);
	System.out.println(op.get());
*/
	Stream.of(1,2,3,4).sorted().forEach(System.out::println);  	
}
	
}
