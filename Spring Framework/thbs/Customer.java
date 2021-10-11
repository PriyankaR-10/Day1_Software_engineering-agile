package org.thbs;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Customer
{
    private int custId;
    private String custName;
    private Address address;
    private Account account;
    public Customer(Address address,Account account)
    {
        this.address=address;
        this.account=account;
    }

}