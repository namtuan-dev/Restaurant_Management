package com.hcr.swd392g3.project.repository;

import com.hcr.swd392g3.project.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Integer> {
}
