package ie.atu;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Rogan", "Gort", "23432");
        System.out.println(person.toString());

        Customer customer = new Customer("Deira", "Oranmore", "2222", 12, true);

        System.out.println(customer.toString());

        //new constructors
        Customer part1Customer = new Customer("Alice Smith", "1 High street", "0851234567", 1001, true);

        //different method for constructor
        Customer part2Customer = new Customer();
        part2Customer.setName("Bob Jones");
        part2Customer.setAddress("2 High street");
        part2Customer.setPhoneNumber("0857654321");
        part2Customer.setCustomerNumber(1002);
        part1Customer.setMailingList(true);

        //print the two object
        System.out.println(part1Customer.toString());
        System.out.println(part2Customer.toString());

        //new constructor for preferred customer obj
        PreferredCustomer pc = new PreferredCustomer();

        pc.setName("Charlie Customer");
        pc.setAddress("3 Middle Road");
        pc.setPhoneNumber("0871112222");
        pc.setCustomerNumber(2001);
        pc.setMailingList(true);

        System.out.println(pc.toString());

        //add and update loyalty points and discount
        pc.addLoyaltyPoints(700);
        System.out.println(pc.toString());

    }
}
