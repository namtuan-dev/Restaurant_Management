package com.hcr.swd392g3.project.dto;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

public class MenuDTO {

    private int menuID;

    private String dishName;

    private int unitPrice;

    private boolean availability;

    private boolean recipe;

    private boolean note;

    private CategoryDTO category;

    private List<ReceiptDetailDTO> receiptDetails;

    
    
    
    public int getMenuID() {
        return menuID;
    }

    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public List<ReceiptDetailDTO> getReceiptDetails() {
        return receiptDetails;
    }

    public void setReceiptDetails(List<ReceiptDetailDTO> receiptDetails) {
        this.receiptDetails = receiptDetails;
    }

	public boolean isRecipe() {
		return recipe;
	}

	public void setRecipe(boolean recipe) {
		this.recipe = recipe;
	}

	public boolean isNote() {
		return note;
	}

	public void setNote(boolean note) {
		this.note = note;
	}
    
    
}
