package ualb.com.HolaSpring.domain;

import lombok.Getter;
import lombok.Setter; 

public class Person {
    @Getter @Setter String name;
    @Getter @Setter private String lastName;
    @Getter @Setter private String email;
    @Getter @Setter private String phone;
}
