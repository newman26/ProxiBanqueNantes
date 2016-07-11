package fr.adaming.metier;

import java.util.ArrayList;
import java.util.List;

import fr.adaming.model.Customer;

public class CustomerServiceImpl implements ICustomerService {

	private List<Customer> liste=new ArrayList<Customer>();
	
	
	
	public List<Customer> getAllsCustomers() {
		
		return creerListe() ;
	}

	public Customer getCustomerById(int pin) {
		List<Customer> listeC=creerListe();
		for (Customer customer: listeC) {
			if( customer.getPin()==pin)
				return  customer;
		}
		
		return null;
	}

	
public List<Customer> creerListe() {
		liste.add(new Customer("nomane",3));
		liste.add(new Customer("dddd",5));
		return liste;
	}

}
