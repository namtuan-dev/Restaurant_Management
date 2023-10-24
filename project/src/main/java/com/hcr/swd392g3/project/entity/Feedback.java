package com.hcr.swd392g3.project.entity;

import com.hcr.swd392g3.project.entity.composite.ReceiptDetailID;

import javax.persistence.*;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "Feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedbackID;

    @Column(name = "Comment")
    private String comment;

    @Column(name = "RatingStar")
    private int ratingStar;

    @Column(name = "Status")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;

    @Embedded
    private ReceiptDetailID receiptDetailID;

//    @OneToOne
//    @JoinColumn(name = "menuID")
//    private Menu menu;
//
//    @OneToOne
//    @JoinColumn(name = "receiptID")
//    private Menu receipt;

    @Column(name = "FeedbackDate")
    private Date feedbackDate;

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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ReceiptDetailID getReceiptDetailID() {
        return receiptDetailID;
    }

    public void setReceiptDetailID(ReceiptDetailID receiptDetailID) {
        this.receiptDetailID = receiptDetailID;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }
}

