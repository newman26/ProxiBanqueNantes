package fr.adaming.metier;

import java.util.List;

import fr.adaming.model.Customer;

public interface ICustomerService {
public List<Customer> getAllsCustomers();
public Customer getCustomerById(int pin);
}
