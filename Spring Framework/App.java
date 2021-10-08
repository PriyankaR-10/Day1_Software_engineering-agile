package org.thbs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*Address address = new Address();
        address.setDoorNo("16/4");
        address.setStreet("Doorvaninagar");
        address.setCity("bangalore");
        address.setState("Karnataka");
        address.setPin("560016");

        Customer cust = new Customer();
        cust.setCustId(100);
        cust.setCustName("priyanka");
        cust.setAddress(address);

        System.out.println(cust);*/

        Address address = new Address("17","dm street","bangalore","karnatak","560016");
        Customer cust = new Customer(address);
        cust.setCustId(100);
        cust.setCustName("priyanka");
        //System.out.println(address);
        System.out.println(cust);
    }
}
