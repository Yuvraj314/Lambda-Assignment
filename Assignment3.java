package lambdaTrial;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment3 {
	public static void main(String[] args) {
		Predicate<String> predi=t->t.length()>5;
		System.out.println(predi.test("Good morning"));
		System.out.println(predi.test("hi"));
		
		Function<Integer,Integer> func=t->t*2;
		System.out.println(func.apply(7));
		
		Orders o=new Orders(50000,"Accepted");
		Consumer<Orders> updateStatus=p->p.updateStatus("pending");
		updateStatus.accept(o);
		System.out.println(o.status);
		
		Supplier<String> sup=() -> "Hi";
		System.out.println(sup.get());
	}
}
