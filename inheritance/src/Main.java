public class Main {
    public static void main(String[] args) {

        IndividualCustomer kubilay = new IndividualCustomer();
        kubilay.customerNumber="1";
        CorporateCustomer lusso = new CorporateCustomer();
        lusso.customerNumber="2";
        SendikaCustomer sendika = new SendikaCustomer();
        sendika.customerNumber="3";
        CustomerManager customerManager = new CustomerManager();

        Customer[] customersArray= {kubilay,lusso,sendika};

        customerManager.addMultiple(customersArray);


    }
}
