package nullobject;

public class CustomerFactory {
    private static final String[] names = {"cxk", "wyf", "lh"};

    public static AbCustomer getCustomer(String name) {
        for (String n : names) {
            if (n.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
