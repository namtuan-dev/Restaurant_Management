package com.hcr.swd392g3.project.dto;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

public class EmployeeDTO extends PersonDTO{

	private int employeeID;

    private String contractType;

    private String department;

    private List<ReceiptDTO> receipts;

    
    


    public List<ReceiptDTO> getReceipts() {
		return receipts;
	}

	public void setReceipts(List<ReceiptDTO> receipts) {
		this.receipts = receipts;
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
