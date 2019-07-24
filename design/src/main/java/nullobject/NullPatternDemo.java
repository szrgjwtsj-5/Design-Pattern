package nullobject;

public class NullPatternDemo {
    public static void main(String[] args) {
        AbCustomer customer1 = CustomerFactory.getCustomer("cxk");
        AbCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbCustomer customer3 = CustomerFactory.getCustomer("lh");
        AbCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
