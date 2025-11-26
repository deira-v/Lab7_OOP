package ie.atu;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Rogan", "Gort", "23432");
        System.out.println(person.toString());

        Customer customer = new Customer("Deira", "Oranmore", "2222", 12, true);

        System.out.println(customer.toString());
    }
}
