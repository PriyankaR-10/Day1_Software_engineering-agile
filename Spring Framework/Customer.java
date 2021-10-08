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

    public Customer(Address address)
    {
        this.address=address;
    }
}
