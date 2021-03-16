package lambdaTrial;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Assignment6 {
	 public static void main(String[] args) throws CloneNotSupportedException {
	      ArrayList<String> al = new ArrayList<>();
	      al.add("Ram");
	      al.add("Shyam");
	      al.add("Hello");
	      al.add("World");
	      System.out.println(al);
	      UnaryOperator<String> uo=e->e.toUpperCase();
	      list.replaceAll(uo);
	      System.out.println(al);
	   }

}
