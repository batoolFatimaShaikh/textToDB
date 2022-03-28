package com.MF.TextToDB.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.MF.TextToDB.Helper.MFHelper;
import com.MF.TextToDB.Repo.MFRepo;
import com.MF.TextToDB.model.MFEntity;

@Service
	public class MFService {
	  @Autowired
	  MFRepo repository;

	  public void save(MultipartFile file) {
	    try {
	      List<MFEntity> tutorials = MFHelper.csvToTutorials(file.getInputStream());
	      repository.saveAll(tutorials);
	    } catch (IOException e) {
	      throw new RuntimeException("fail to store csv data: " + e.getMessage());
	    }
	  }

	  public ByteArrayInputStream load() {
	    List<MFEntity> tutorials = repository.findAll();

	    ByteArrayInputStream in = MFHelper.tutorialsToCSV(tutorials);
	    return in;
	  }

	  public List<MFEntity> getAllTutorials() {
	    return repository.findAll();
	  }

}
