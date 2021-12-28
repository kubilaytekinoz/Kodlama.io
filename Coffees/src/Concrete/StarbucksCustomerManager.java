package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	public void save(Customer customer) throws NumberFormatException, RemoteException {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Geçerli Bir Kiþi Deðil");
		}
		
	}

}
