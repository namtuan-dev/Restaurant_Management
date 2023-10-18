package com.hcr.swd392g3.project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@javax.persistence.Table(name = "Table")
public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tableID;

    @Column(name = "Chair number")
    private int chairNumber;

    @Column(name = "Floor no")
    private int floorNo;

    @OneToMany(mappedBy = "table", cascade = CascadeType.ALL)
    private List<Receipt> receiptList;

    public List<Receipt> getReceiptList() {
        return receiptList;
    }

    public void setReceiptList(List<Receipt> receiptList) {
        this.receiptList = receiptList;
    }

    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public int getChairNumber() {
        return chairNumber;
    }

    public void setChairNumber(int chairNumber) {
        this.chairNumber = chairNumber;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }
}
