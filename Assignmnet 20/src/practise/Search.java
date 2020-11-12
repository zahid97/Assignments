package practise;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) throws ParseException {
		List<Customer> customer = new ArrayList<>();
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Customer c = contactBO.createCustomer("1,John,9876543210,12-12-1990,5000.0,25000.0,12-12-2012,3.0");
			Customer c1= contactBO.createCustomer("2,James,9876543201,12-12-1991,6000,35000,12-12-2013,4.0");
			Customer c3= contactBO.createCustomer("3,Parker,9567843201,14-09-1987,6000,35000,12-12-2013,4.0");
			customer.add(c);
			customer.add(c1);
			customer.add(c3);
		//System.out.println(contactBO.findCustomer(customer, "zahid"));	
			//System.out.println(customer);
		System.out.println( contactBO.findCustomerWithDate(customer,sdf.parse("12-12-2012")));
		//System.out.println(contactBO.findCustomerWithRating(customer , 4.0));
	}
	
	
	
	
	
	
	
	
	
	
	

}
