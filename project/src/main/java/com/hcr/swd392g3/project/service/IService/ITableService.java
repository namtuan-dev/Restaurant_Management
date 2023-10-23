package com.hcr.swd392g3.project.service.IService;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hcr.swd392g3.project.dto.TableDTO;


@Service
public interface ITableService {
	TableDTO saveTable(TableDTO tableDTO);
	TableDTO updateTable(TableDTO tableDTO);
	void delete(UUID  id);
	TableDTO changeTableStatus(TableDTO tableDTO);
	List<TableDTO> getAllTable();
}
