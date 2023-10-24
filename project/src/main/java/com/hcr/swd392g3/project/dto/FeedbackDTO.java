package com.hcr.swd392g3.project.dto;

import javax.persistence.*;
import javax.persistence.Table;
import java.sql.Date;


public class FeedbackDTO {

    private int feedbackID;

    private String comment;

    private int ratingStar;

    private Date feedbackDate;

    private boolean status;

    private ReceiptDetailDTO receiptDetail;

    private CustomerDTO customer;

    
    
    
    public int getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRatingStar() {
        return ratingStar;
    }

    public void setRatingStar(int ratingStar) {
        this.ratingStar = ratingStar;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ReceiptDetailDTO getReceiptDetail() {
        return receiptDetail;
    }

    public void setReceiptDetail(ReceiptDetailDTO receiptDetail) {
        this.receiptDetail = receiptDetail;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }
}

