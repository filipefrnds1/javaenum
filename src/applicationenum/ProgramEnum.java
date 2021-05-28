package applicationenum;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import entities.enums.OrderStatus;

public class ProgramEnum {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		
		
		sc.close();
	}

}
