package com.dvdBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvdBackend.Repository.DataRepo;
import com.dvdBackend.entity.DataEntity;

@Service
public class DataServiceImpl implements DataService {
	@Autowired
	private DataRepo dr;
	@Override
	public List<DataEntity> getAllData() {
		return dr.findAll();
		
	}
	@Override
	public DataEntity addData(DataEntity newData) {
		
		return dr.save(newData);
	}

}
