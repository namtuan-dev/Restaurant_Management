package com.hcr.swd392g3.project.entity;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.sql.Date;

@Entity
@Table(name = "Feedback")
public class Feedback {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedbackID;

    @Column(name = "Comment")
    private String comment;

    @Column(name = "RatingStar")
    private int ratingStar;

    @Column(name = "FeedbackDate")
    private Date feedbackDate;

    @Column(name = "Status")
    private boolean status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "receiptDetailID", referencedColumnName = "receiptDetailID")
    private ReceiptDetail receiptDetail;

    @ManyToOne
    @JoinColumn(name = "customerID", nullable=true)
    private Customer customer;

    
    
    
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

    public ReceiptDetail getReceiptDetail() {
        return receiptDetail;
    }

    public void setReceiptDetail(ReceiptDetail receiptDetail) {
        this.receiptDetail = receiptDetail;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

