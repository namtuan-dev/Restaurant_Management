package com.hcr.swd392g3.project.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcr.swd392g3.project.entity.Waitlist;

@Repository
public interface WaitlistRepository extends JpaRepository<Waitlist, Integer>{

}
