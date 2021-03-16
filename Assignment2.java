package lambdaTrial;

interface Status {
	void operation(Orders o);
}

public class Assignment2{
	public static void main(String[] args) {

		Status task = (Orders o) -> {
			if((o.price>10000)&&((o.status.equalsIgnoreCase("completed"))||(o.status.equalsIgnoreCase("accepted")))) {
				System.out.println("Price:"+o.price);
			}
		};
		task.operation(new Orders(25000,"completed"));
		task.operation(new Orders(50000,"accepted"));
		task.operation(new Orders(10000,"not completed"));
		task.operation(new Orders(8000,"not completed"));
	}
}
