package com.example.skillwillproject21.Models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Length(min = 5,max = 50,message = "you can type only 5-50")
    @NotNull(message = "firstName can't be null")
    @Column(name = "firstname")
    private String firstName;
    @Length(min = 5,max = 50,message = "you can type only 5-50")
    @NotNull(message = "lastName can't be null")
    @Column(name = "lastname")
    private String lastName;
    @NotNull(message = "amount can't be null")
    @Min(value = 100,message = "amount can't be lower than 100")
    @Column(name = "amount")
    private Long amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
