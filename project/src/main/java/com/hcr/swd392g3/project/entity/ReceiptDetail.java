package com.hcr.swd392g3.project.entity;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "ReceiptDetail")
public class ReceiptDetail {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int receiptDetailID;

    @Column(name = "MenuID")
    private int menuID;

    @Column(name = "Quantity")
    private int quantity;

    @ManyToMany(mappedBy = "receiptDetailList")
    private List<Menu> menuList;

    @ManyToOne
    @JoinColumn(name = "receiptID")
    private Receipt receipt;

    @OneToOne(mappedBy = "receiptDetail")
    private Feedback feedback;

    
    
    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }


    public Receipt getReceipt() {
		return receipt;
	}

	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}

	public int getReceiptDetailID() {
        return receiptDetailID;
    }

    public void setReceiptDetailID(int receiptDetailID) {
        this.receiptDetailID = receiptDetailID;
    }

    public int getMenuID() {
        return menuID;
    }

    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
}
