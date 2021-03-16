package lambdaTrial;

public class Order {
	int price;
	String status;
	public Order(int price,String status){
		this.price=price;
		this.status=status;
	}
	void updateStatus(String newStatus) {
		this.status=newStatus;
	}
	}


