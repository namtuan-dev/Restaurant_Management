package com.hcr.swd392g3.project.entity;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Person")
@Inheritance(strategy = InheritanceType.JOINED) 
@DiscriminatorColumn(name = "entity_type", 
                     discriminatorType 
                     = DiscriminatorType.STRING) 
public class Person {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personID;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Email")
    private String email;

    
    @Size(max=10, message = "phone number should not be greater than 10 characters")
    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "Address")
    private String address;

    @Column(name = "Role")
    private int role;

    @Column(name = "Status")
    private boolean status;

    @Column(name = "Password")
    private String password;

    @Column(name = "Gender")
    private boolean gender;
    
    @Column(name = "UserName")
    private String userName;
    
    
    

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }
    
    
}
