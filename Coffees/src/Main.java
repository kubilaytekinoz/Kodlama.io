import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapters;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
public static void main(String[] args) throws NumberFormatException, RemoteException {
	BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
	customerManager.save(new Customer(1,"Kubilay","Tekinöz","1994","22891095736"));
	
}
}
