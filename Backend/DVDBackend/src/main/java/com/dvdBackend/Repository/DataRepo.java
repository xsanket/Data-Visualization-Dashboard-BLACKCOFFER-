package com.dvdBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvdBackend.entity.DataEntity;

@Repository
public interface DataRepo extends JpaRepository<DataEntity, Long>{

}
