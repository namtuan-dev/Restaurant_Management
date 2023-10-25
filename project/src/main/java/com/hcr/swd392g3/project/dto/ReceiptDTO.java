package com.hcr.swd392g3.project.dto;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


public class ReceiptDTO {

    private int receiptID;

    private int tableID;

    private Date bookingHour;

    private boolean status;

    private boolean demand;


    private TableDTO table;


    private EmployeeDTO employee;


    private CustomerDTO customer;

    private List<ReceiptDetailDTO> receiptDetails;

    
    
    
    public int getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(int receiptID) {
        this.receiptID = receiptID;
    }

    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public Date getBookingHour() {
        return bookingHour;
    }

    public void setBookingHour(Date bookingHour) {
        this.bookingHour = bookingHour;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public TableDTO getTable() {
		return table;
	}

	public void setTable(TableDTO table) {
		this.table = table;
	}

	public EmployeeDTO getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public List<ReceiptDetailDTO> getReceiptDetails() {
        return receiptDetails;
    }

   

	public void setReceiptDetails(List<ReceiptDetailDTO> receiptDetails) {
		this.receiptDetails = receiptDetails;
	}

	public boolean isDemand() {
		return demand;
	}

	public void setDemand(boolean demand) {
		this.demand = demand;
	}
    
    
}
