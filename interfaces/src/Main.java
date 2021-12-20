public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new SmsLogger(),new EmailLogger(),new FileLogger()};


        CustomerManager customerManager = new CustomerManager(loggers);
        Customer kubilay = new Customer(1,"Kubilay","Tekinöz");
        customerManager.add(kubilay);
    }
}
