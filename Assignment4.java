package lambdaTrial;

import java.util.ArrayList;

public class Assignment4 {
	public static void main(String[] args) {
	    ArrayList<String> al = new ArrayList<String>();
	    al.add("Ram");
	    al.add("Shyam");
	    al.add("Hello World");
	    al.add("RaviKishan");
	    al.removeIf(n -> Math.floorMod(n.length(), 2)!=0);
	    for (String i : al) { 
            System.out.println(i); 
        } 
	  }

}
