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
        THISClient c1 = (THISClient) context.getBean("client1");
        System.out.println(c1.deposit(1000L,5000));
        System.out.println();
        System.out.println(c1.withdraw(1000L,10000));
        System.out.println();
        System.out.println(c1.getBalance(1000L));

        THISClient c21 = (THISClient) context.getBean("client1");
        System.out.println(c21.deposit(123L,5000));
        System.out.println();
        System.out.println(c21.withdraw(123L,10000));
        System.out.println();
        System.out.println(c21.getBalance(123L));

        System.out.println(c1==c21);

        System.out.println();

        THISClient c2 = (THISClient) context.getBean("client2");
        System.out.println(c2.deposit(1005L,5000));
        System.out.println();
        System.out.println(c2.withdraw(1005L,10000));
        System.out.println();
        System.out.println(c2.getBalance(1005L));

        ((ClassPathXmlApplicationContext) context).close();
    }
}
