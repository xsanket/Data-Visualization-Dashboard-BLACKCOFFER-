package com.dvdBackend.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvdBackend.entity.DataEntity;
import com.dvdBackend.service.DataService;

@RestController
@RequestMapping("/api/data")
@CrossOrigin(origins = "http://localhost:3000")
public class DataController {
	
	@Autowired
	private DataService ds;
	
//	@GetMapping("/getData")
//	public List<DataEntity> getAllData(){
//		return ds.getAllData();
//	}
	
	@PostMapping("/addData")
    public DataEntity addData(@RequestBody DataEntity newData) {
        return ds.addData(newData);
    }
	
	@GetMapping("/getData")
	public List<DataEntity> getAllData() {
	    List<DataEntity> data = ds.getAllData();
	    System.out.println("Retrieved data: " + data);
	    return data;
	}

}
