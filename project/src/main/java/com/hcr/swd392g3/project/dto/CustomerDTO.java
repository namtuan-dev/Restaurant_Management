package com.hcr.swd392g3.project.dto;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;


public class CustomerDTO extends PersonDTO {

    private boolean loyalty;

//    private List<ReceiptDTO> receipts;
//
//    private List<FeedbackDTO> feedbacks;


    public boolean isLoyalty() {
        return loyalty;
    }

    public void setLoyalty(boolean loyalty) {
        this.loyalty = loyalty;
    }


}
