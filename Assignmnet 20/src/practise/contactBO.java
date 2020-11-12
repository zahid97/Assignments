package practise;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class contactBO {
	static List <Customer> subCustomer = new ArrayList<>();
	public static Customer createCustomer(String line) throws NumberFormatException, ParseException {
		String[] details = line.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Customer c= new Customer(Long.parseLong(details[0]),details[1],details[2],sdf.parse(details[3]),Double.parseDouble(details[4]),Double.parseDouble(details[5]),sdf.parse(details[6]),Double.parseDouble(details[7]));
		//subCustomer.add(c);	
		return c;
}
	
	static List<Customer> findCustomer(List<Customer>customer,String name){
		for(Customer c: customer) {
			if(name.equals(c.getName())) {
				subCustomer.add(c);
			}
		}
		if(subCustomer.isEmpty()) {
			return null;
		}
		else
			return subCustomer;
		}
		
		
		
		
	static List<Customer> findCustomerWithDate(List<Customer> customer , Date birth ){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		for(Customer c : customer) {
			if(birth.compareTo(c.getBirthdate())==0){
			subCustomer.add(c);
		}
	}
		if(subCustomer.isEmpty()) {
			return null;
		}else
			return subCustomer;
}
	static List<Customer> findCustomerWithRating(List<Customer> customer , Double rating){
			for(Customer c: customer) {
				if(Double.compare(rating, c.getRating())==0) {
					subCustomer.add(c);
				}
			}
			if(subCustomer.isEmpty()) {
				return null;
			}
			else
				return subCustomer;
}
}
