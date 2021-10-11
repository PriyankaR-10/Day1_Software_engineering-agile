package org.thbs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
        Customer customer = (Customer)context.getBean("customer");
        customer.setCustId(100);
        customer.setCustName("Priyanka");

        Address address = (Address)customer.getAddress();
        address.setDoorNo("10");
        address.setStreet("Udayanagar");
        address.setCity("Bangalore");
        address.setState("Karnataka");
        address.setPin("560016");

        Account account = (Account)customer.getAccount();
        account.setAccId("1001");
        account.setAccType("savings");

        System.out.println(customer);
    }
}