package com.dvdBackend.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.dvdBackend.entity.DataEntity;

@Service
public interface DataService {
	List<DataEntity> getAllData();
	 DataEntity addData(DataEntity newData);
}
