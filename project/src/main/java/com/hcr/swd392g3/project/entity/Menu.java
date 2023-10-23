package com.hcr.swd392g3.project.entity;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuID;

    @Column(name = "DishName")
    private String dishName;

    @Column(name = "UnitPrice")
    private int unitPrice;

    @Column(name = "Availability")
    private boolean availability;
    
    @Column(name = "Recipe")
    private boolean recipe;
    
    @Column(name = "Note")
    private boolean note;

    @ManyToOne
    @JoinColumn(name = "categoryID", referencedColumnName = "categoryID")
    private Category category;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Menu_ReceiptDetail",
                joinColumns = @JoinColumn(name = "menuID"),
                inverseJoinColumns = @JoinColumn(name = "receiptDetailID"))
    private List<ReceiptDetail> receiptDetailList;

    
    
    
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<ReceiptDetail> getReceiptDetailList() {
        return receiptDetailList;
    }

    public void setReceiptDetailList(List<ReceiptDetail> receiptDetailList) {
        this.receiptDetailList = receiptDetailList;
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
