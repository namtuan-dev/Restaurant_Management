package com.hcr.swd392g3.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Waitlist")
public class Waitlist {

	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int warehouseID;

    @Column(name = "IngredientName")
    private String ingredientName;
}
