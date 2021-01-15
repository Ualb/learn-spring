package ualb.com.HolaSpring.domain;

import java.io.Serializable;

import javax.persistence.*;  

import lombok.Data;
import lombok.Getter;
import lombok.Setter; 

@Data
@Entity
@Table(name = "person")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPerson;
    @Getter @Setter String name;
    @Getter @Setter private String lastName;
    @Getter @Setter private String email;
    @Getter @Setter private String phone;
}
