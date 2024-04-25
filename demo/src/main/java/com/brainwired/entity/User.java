package com.brainwired.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "USER_TB")
public class User {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column
    private String FirstName;

    @Column
    private String LastName;

    @Column
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date DOB;

    @Column
    private String Address;

    public User() {
    }

    public User(Long id, String firstName, String lastName, Date DOB, String address) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        this.DOB = DOB;
        Address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
