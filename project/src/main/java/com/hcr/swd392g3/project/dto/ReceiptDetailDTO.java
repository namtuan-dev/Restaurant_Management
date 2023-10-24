package com.hcr.swd392g3.project.dto;

import javax.persistence.*;
import java.util.List;


public class ReceiptDetailDTO {

    private int receiptDetailID;

    private int menuID;

    private int quantity;

    private MenuDTO menu;

    private List<ReceiptDTO> receipts;

    private FeedbackDTO feedback;

    
    
    
    public FeedbackDTO getFeedback() {
        return feedback;
    }

    public void setFeedback(FeedbackDTO feedback) {
        this.feedback = feedback;
    }

    public List<ReceiptDTO> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<ReceiptDTO> receipts) {
        this.receipts = receipts;
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

    public MenuDTO getMenu() {
		return menu;
	}

	public void setMenu(MenuDTO menu) {
		this.menu = menu;
	}

	public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
