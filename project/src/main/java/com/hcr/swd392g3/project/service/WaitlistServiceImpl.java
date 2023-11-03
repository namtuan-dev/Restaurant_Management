package com.hcr.swd392g3.project.service;

import com.hcr.swd392g3.project.converter.WaitlistConverter;
import com.hcr.swd392g3.project.dto.WaitlistDTO;
import com.hcr.swd392g3.project.entity.Waitlist;
import com.hcr.swd392g3.project.repository.WaitlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcr.swd392g3.project.service.IService.IWailistService;

import java.util.ArrayList;
import java.util.List;

@Service
public class WaitlistServiceImpl implements IWailistService {
    @Autowired
    WaitlistRepository waitlistRepository;
    @Autowired
    WaitlistConverter waitlistConverter;

    @Override
    public List<WaitlistDTO> getAllByPersonID(int personID) {
        List<Waitlist> list = waitlistRepository.getAllByPerson_PersonIDOrderByBookingHourDesc(personID);
        List<WaitlistDTO> waitlistDTOS = new ArrayList<>();
        for (Waitlist waitlist : list) {
            waitlistDTOS.add(waitlistConverter.toDTO(waitlist));
        }
        return waitlistDTOS;
    }

    @Override
    public List<WaitlistDTO> getAllByTableID(int tableID) {
        List<Waitlist> list = waitlistRepository.getAllByTable_TableIDOrderByBookingHourDesc(tableID);
        List<WaitlistDTO> waitlistDTOS = new ArrayList<>();
        for (Waitlist waitlist : list) {
            waitlistDTOS.add(waitlistConverter.toDTO(waitlist));
        }
        return waitlistDTOS;
    }

    @Override
    public List<WaitlistDTO> getAll() {
        List<Waitlist> list = waitlistRepository.findAll();
        List<WaitlistDTO> waitlistDTOS = new ArrayList<>();
        for (Waitlist waitlist : list) {
            waitlistDTOS.add(waitlistConverter.toDTO(waitlist));
        }
        return waitlistDTOS;
    }

    @Override
    public WaitlistDTO saveWaitlist(WaitlistDTO waitlistDTO) {
        Waitlist waitlist = waitlistConverter.toEntity(waitlistDTO);
        if (waitlistRepository.getByBookingHour(waitlist.getBookingHour()) != null) {
            return null;
        }
        waitlistRepository.save(waitlist);
        return waitlistDTO;
    }

    @Override
    public void cancelWaitlist(WaitlistDTO waitlistDTO) {
        Waitlist waitlist = waitlistRepository.getByPerson_PersonIDAndTable_TableID
                (waitlistDTO.getPerson().getPersonID(), waitlistDTO.getTable().getTableID());
        waitlist.setBookingHour(null);
    }
}
