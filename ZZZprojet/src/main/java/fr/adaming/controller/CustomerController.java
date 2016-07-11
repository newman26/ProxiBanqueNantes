package fr.adaming.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.metier.CustomerServiceImpl;
import fr.adaming.metier.ICustomerService;
import fr.adaming.model.Customer;


@RestController
public class CustomerController {
	@RequestMapping(value = "/customers", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Customer> getCountries()
	{//hghghgh
		//fgfgfgffg
		ICustomerService custService=new CustomerServiceImpl();
		//gggggg
		return custService.getAllsCustomers() ;
	}
	
	@RequestMapping(value = "/customer/{pin}", method = RequestMethod.GET,headers="Accept=application/json")
	public Customer getCountryById(@PathVariable int pin)
	{	ICustomerService custService=new CustomerServiceImpl();
	
	return custService.getCustomerById(pin); 
		
	}
	
}