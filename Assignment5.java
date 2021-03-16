package lambdaTrial;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Assignment5 {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
	    al.add("Hello");
	    al.add("World");
	    al.add("Yuvraj");
	    al.add("Rahul Yadav");
	    StringBuilder string1=new StringBuilder();
	    Consumer<String> method = (n) -> { string1.append(n.charAt(0)); };
	    al.forEach( method );
	    System.out.println(string);
	}

}
