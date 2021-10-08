package org.thbs;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Address
{
    private String doorNo;
    private String street;
    private String city;
    private String state;
    private String pin;
}
