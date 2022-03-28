package com.MF.TextToDB.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MF.TextToDB.model.MFEntity;

@Repository
	public interface MFRepo extends JpaRepository<MFEntity,String>{
	}

