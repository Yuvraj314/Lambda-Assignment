package lambdaTrial;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Assignment8 extends Thread{
	public void run(){  
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(15);
	    	al.add(3);
	    	al.add(20);
	    	al.add(13);
		Consumer<Integer> method = (n) -> System.out.println(n);
		al.forEach( method );
		} 
	public static void main(String args[]){  
		
		Assignment8 t=new Assignment8();  
		t.start();  
	    
	
		 }  
}
