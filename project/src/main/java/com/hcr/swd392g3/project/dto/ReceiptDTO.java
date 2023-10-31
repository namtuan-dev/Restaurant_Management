package com.hcr.swd392g3.project.dto;

import java.sql.Date;


public class ReceiptDTO {

    private int receiptID;

    private Date bookingHour;

    private boolean status;

    private boolean demand;

//    private com.hcr.swd392g3.project.entity.Table table;
//    
//    private Employee employee;
//
//    private Customer customer;

    
    
    
	public int getReceiptID() {
		return receiptID;
	}

	public void setReceiptID(int receiptID) {
		this.receiptID = receiptID;
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

	public boolean isDemand() {
		return demand;
	}

	public void setDemand(boolean demand) {
		this.demand = demand;
	}

    
    
    
}