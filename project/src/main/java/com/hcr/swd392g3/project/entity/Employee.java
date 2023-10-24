package com.hcr.swd392g3.project.entity;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "Employee")
@DiscriminatorValue("employee")
public class Employee extends Person{
	
//	@Id
//    @NotNull
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeID")
	private int employeeID;
	
    @Column(name = "ContractType")
    private String contractType;

    @Column(name = "Department")
    private String department;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Receipt> receiptList;

    
    
    public List<Receipt> getReceiptList() {
        return receiptList;
    }

    public void setReceiptList(List<Receipt> receiptList) {
        this.receiptList = receiptList;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
    
    
}
